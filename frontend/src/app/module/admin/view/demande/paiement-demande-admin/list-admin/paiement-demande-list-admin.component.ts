import {Component, OnInit} from '@angular/core';
import {PaiementDemandeService} from 'src/app/controller/service/PaiementDemande.service';
import {PaiementDemandeDto} from 'src/app/controller/model/PaiementDemande.model';
import {PaiementDemandeCriteria} from 'src/app/controller/criteria/PaiementDemandeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { DemandeService } from 'src/app/controller/service/Demande.service';
import { ModePaiementService } from 'src/app/controller/service/ModePaiement.service';

import {DemandeDto} from 'src/app/controller/model/Demande.model';
import {ModePaiementDto} from 'src/app/controller/model/ModePaiement.model';


@Component({
  selector: 'app-paiement-demande-list-admin',
  templateUrl: './paiement-demande-list-admin.component.html'
})
export class PaiementDemandeListAdminComponent extends AbstractListController<PaiementDemandeDto, PaiementDemandeCriteria, PaiementDemandeService>  implements OnInit {

    fileName = 'PaiementDemande';

    demandes :Array<DemandeDto>;
    modePaiements :Array<ModePaiementDto>;
  
    constructor(paiementDemandeService: PaiementDemandeService, private demandeService: DemandeService, private modePaiementService: ModePaiementService) {
        super(paiementDemandeService);
        this.pdfName='PaiementDemande.pdf';
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadDemande();
      this.loadModePaiement();
    }

    public async loadPaiementDemandes(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PaiementDemande', 'list');
        isPermistted ? this.service.findAll().subscribe(paiementDemandes => this.items = paiementDemandes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'reference', header: 'Reference'},
            {field: 'datePaiement', header: 'Date paiement'},
            {field: 'montant', header: 'Montant'},
            {field: 'demande?.id', header: 'Demande'},
            {field: 'modePaiement?.libelle', header: 'Mode paiement'},
        ];
    }


    public async loadDemande(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PaiementDemande', 'list');
        isPermistted ? this.demandeService.findAll().subscribe(demandes => this.demandes = demandes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadModePaiement(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('PaiementDemande', 'list');
        isPermistted ? this.modePaiementService.findAllOptimized().subscribe(modePaiements => this.modePaiements = modePaiements,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: PaiementDemandeDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Reference': e.reference ,
                'Date paiement': this.datePipe.transform(e.datePaiement , 'dd/MM/yyyy hh:mm'),
                 'Montant': e.montant ,
                'Demande': e.demande?.id ,
                'Mode paiement': e.modePaiement?.libelle ,
                 'Description': e.description ,
            }
        });

        this.criteriaData = [{
            'Reference': this.criteria.reference ? this.criteria.reference : environment.emptyForExport ,
            'Date paiement Min': this.criteria.datePaiementFrom ? this.datePipe.transform(this.criteria.datePaiementFrom , this.dateFormat) : environment.emptyForExport ,
            'Date paiement Max': this.criteria.datePaiementTo ? this.datePipe.transform(this.criteria.datePaiementTo , this.dateFormat) : environment.emptyForExport ,
            'Montant Min': this.criteria.montantMin ? this.criteria.montantMin : environment.emptyForExport ,
            'Montant Max': this.criteria.montantMax ? this.criteria.montantMax : environment.emptyForExport ,
        //'Demande': this.criteria.demande?.id ? this.criteria.demande?.id : environment.emptyForExport ,
        //'Mode paiement': this.criteria.modePaiement?.libelle ? this.criteria.modePaiement?.libelle : environment.emptyForExport ,
            'Description': this.criteria.description ? this.criteria.description : environment.emptyForExport ,
        }];
      }
}
