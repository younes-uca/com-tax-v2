import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {PaiementDemandeService} from 'src/app/controller/service/PaiementDemande.service';
import {PaiementDemandeDto} from 'src/app/controller/model/PaiementDemande.model';
import {PaiementDemandeCriteria} from 'src/app/controller/criteria/PaiementDemandeCriteria.model';


import {DemandeDto} from 'src/app/controller/model/Demande.model';
import {DemandeService} from 'src/app/controller/service/Demande.service';
import {ModePaiementDto} from 'src/app/controller/model/ModePaiement.model';
import {ModePaiementService} from 'src/app/controller/service/ModePaiement.service';

@Component({
  selector: 'app-paiement-demande-edit-admin',
  templateUrl: './paiement-demande-edit-admin.component.html'
})
export class PaiementDemandeEditAdminComponent extends AbstractEditController<PaiementDemandeDto, PaiementDemandeCriteria, PaiementDemandeService>   implements OnInit {


    private _validPaiementDemandeReference = true;

    private _validModePaiementLibelle = true;
    private _validModePaiementCode = true;



    constructor( private paiementDemandeService: PaiementDemandeService , private demandeService: DemandeService, private modePaiementService: ModePaiementService) {
        super(paiementDemandeService);
    }

    ngOnInit(): void {
    this.demande = new DemandeDto();
    this.demandeService.findAll().subscribe((data) => this.demandes = data);
    this.modePaiement = new ModePaiementDto();
    this.modePaiementService.findAll().subscribe((data) => this.modePaiements = data);
}
    public prepareEdit() {
        this.item.datePaiement = this.paiementDemandeService.format(this.item.datePaiement);
    }



    public setValidation(value : boolean){
        this.validPaiementDemandeReference = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validatePaiementDemandeReference();
    }
    public validatePaiementDemandeReference(){
        if (this.stringUtilService.isEmpty(this.item.reference)) {
            this.errorMessages.push('Reference non valide');
            this.validPaiementDemandeReference = false;
        } else {
            this.validPaiementDemandeReference = true;
        }
    }



   public async openCreateDemande(demande: string) {
        const isPermistted = await this.roleService.isPermitted('Demande', 'edit');
        if(isPermistted) {
             this.demande = new DemandeDto();
             this.createDemandeDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }

   get demande(): DemandeDto {
       return this.demandeService.item;
   }
  set demande(value: DemandeDto) {
        this.demandeService.item = value;
   }
   get demandes(): Array<DemandeDto> {
        return this.demandeService.items;
   }
   set demandes(value: Array<DemandeDto>) {
        this.demandeService.items = value;
   }
   get createDemandeDialog(): boolean {
       return this.demandeService.createDialog;
   }
  set createDemandeDialog(value: boolean) {
       this.demandeService.createDialog= value;
   }
   get modePaiement(): ModePaiementDto {
       return this.modePaiementService.item;
   }
  set modePaiement(value: ModePaiementDto) {
        this.modePaiementService.item = value;
   }
   get modePaiements(): Array<ModePaiementDto> {
        return this.modePaiementService.items;
   }
   set modePaiements(value: Array<ModePaiementDto>) {
        this.modePaiementService.items = value;
   }
   get createModePaiementDialog(): boolean {
       return this.modePaiementService.createDialog;
   }
  set createModePaiementDialog(value: boolean) {
       this.modePaiementService.createDialog= value;
   }


    get validPaiementDemandeReference(): boolean {
        return this._validPaiementDemandeReference;
    }
    set validPaiementDemandeReference(value: boolean) {
        this._validPaiementDemandeReference = value;
    }

    get validModePaiementLibelle(): boolean {
        return this._validModePaiementLibelle;
    }
    set validModePaiementLibelle(value: boolean) {
        this._validModePaiementLibelle = value;
    }
    get validModePaiementCode(): boolean {
        return this._validModePaiementCode;
    }
    set validModePaiementCode(value: boolean) {
        this._validModePaiementCode = value;
    }
}
