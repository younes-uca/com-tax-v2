import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {ComptableValidateurService} from 'src/app/controller/service/ComptableValidateur.service';
import {ComptableValidateurDto} from 'src/app/controller/model/ComptableValidateur.model';
import {ComptableValidateurCriteria} from 'src/app/controller/criteria/ComptableValidateurCriteria.model';



@Component({
  selector: 'app-comptable-validateur-edit-admin',
  templateUrl: './comptable-validateur-edit-admin.component.html'
})
export class ComptableValidateurEditAdminComponent extends AbstractEditController<ComptableValidateurDto, ComptableValidateurCriteria, ComptableValidateurService>   implements OnInit {






    constructor( private comptableValidateurService: ComptableValidateurService ) {
        super(comptableValidateurService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }







}
