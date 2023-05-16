import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {ComptableValidateurService} from 'src/app/controller/service/ComptableValidateur.service';
import {ComptableValidateurDto} from 'src/app/controller/model/ComptableValidateur.model';
import {ComptableValidateurCriteria} from 'src/app/controller/criteria/ComptableValidateurCriteria.model';
@Component({
  selector: 'app-comptable-validateur-create-admin',
  templateUrl: './comptable-validateur-create-admin.component.html'
})
export class ComptableValidateurCreateAdminComponent extends AbstractCreateController<ComptableValidateurDto, ComptableValidateurCriteria, ComptableValidateurService>  implements OnInit {




    constructor( private comptableValidateurService: ComptableValidateurService ) {
        super(comptableValidateurService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }










}
