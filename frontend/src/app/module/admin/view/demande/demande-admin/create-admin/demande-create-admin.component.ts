import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {DemandeService} from 'src/app/controller/service/Demande.service';
import {DemandeDto} from 'src/app/controller/model/Demande.model';
import {DemandeCriteria} from 'src/app/controller/criteria/DemandeCriteria.model';
import {LivraisonDto} from 'src/app/controller/model/Livraison.model';
import {LivraisonService} from 'src/app/controller/service/Livraison.service';
import {EtatDemandeDto} from 'src/app/controller/model/EtatDemande.model';
import {EtatDemandeService} from 'src/app/controller/service/EtatDemande.service';
import {ClientDto} from 'src/app/controller/model/Client.model';
import {ClientService} from 'src/app/controller/service/Client.service';
import {MagasinDto} from 'src/app/controller/model/Magasin.model';
import {MagasinService} from 'src/app/controller/service/Magasin.service';
import {DemandeItemDto} from 'src/app/controller/model/DemandeItem.model';
import {DemandeItemService} from 'src/app/controller/service/DemandeItem.service';
import {ProduitDto} from 'src/app/controller/model/Produit.model';
import {ProduitService} from 'src/app/controller/service/Produit.service';
import {StoreDto} from 'src/app/controller/model/Store.model';
import {StoreService} from 'src/app/controller/service/Store.service';
@Component({
  selector: 'app-demande-create-admin',
  templateUrl: './demande-create-admin.component.html'
})
export class DemandeCreateAdminComponent extends AbstractCreateController<DemandeDto, DemandeCriteria, DemandeService>  implements OnInit {

    private _demandeItemsElement = new DemandeItemDto();


    private _validProduitReference = true;
    private _validProduitLibelle = true;
    private _validClientCin = true;
    private _validClientNom = true;
    private _validStoreLibelle = true;
    private _validStoreReference = true;
    private _validEtatDemandeLibelle = true;
    private _validEtatDemandeCode = true;

    constructor( private demandeService: DemandeService , private livraisonService: LivraisonService, private etatDemandeService: EtatDemandeService, private clientService: ClientService, private magasinService: MagasinService, private demandeItemService: DemandeItemService, private produitService: ProduitService, private storeService: StoreService) {
        super(demandeService);
    }

    ngOnInit(): void {
        this.demandeItemsElement.produit = new ProduitDto();
        this.produitService.findAll().subscribe((data) => this.produits = data);
    this.produit = new ProduitDto();
    this.produitService.findAll().subscribe((data) => this.produits = data);
    this.client = new ClientDto();
    this.clientService.findAll().subscribe((data) => this.clients = data);
    this.livraison = new LivraisonDto();
    this.livraisonService.findAll().subscribe((data) => this.livraisons = data);
    this.magasin = new MagasinDto();
    this.magasinService.findAll().subscribe((data) => this.magasins = data);
    this.store = new StoreDto();
    this.storeService.findAll().subscribe((data) => this.stores = data);
    this.etatDemande = new EtatDemandeDto();
    this.etatDemandeService.findAll().subscribe((data) => this.etatDemandes = data);
}



    validateDemandeItems(){
        this.errorMessages = new Array();
    }


    public setValidation(value: boolean){
    }

    public addDemandeItems() {
        if( this.item.demandeItems == null )
            this.item.demandeItems = new Array<DemandeItemDto>();
       this.validateDemandeItems();
       if (this.errorMessages.length === 0) {
              this.item.demandeItems.push({... this.demandeItemsElement});
              this.demandeItemsElement = new DemandeItemDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs',detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
       }
    }


    public deleteDemandeItem(p: DemandeItemDto) {
        this.item.demandeItems.forEach((element, index) => {
            if (element === p) { this.item.demandeItems.splice(index, 1); }
        });
    }

    public editDemandeItem(p: DemandeItemDto) {
        this.demandeItemsElement = {... p};
        this.activeTab = 0;
    }


    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }



    public async openCreateLivraison(livraison: string) {
    const isPermistted = await this.roleService.isPermitted('Livraison', 'add');
    if(isPermistted) {
         this.livraison = new LivraisonDto();
         this.createLivraisonDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }
    public async openCreateEtatDemande(etatDemande: string) {
    const isPermistted = await this.roleService.isPermitted('EtatDemande', 'add');
    if(isPermistted) {
         this.etatDemande = new EtatDemandeDto();
         this.createEtatDemandeDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }

    get produit(): ProduitDto {
        return this.produitService.item;
    }
    set produit(value: ProduitDto) {
        this.produitService.item = value;
    }
    get produits(): Array<ProduitDto> {
        return this.produitService.items;
    }
    set produits(value: Array<ProduitDto>) {
        this.produitService.items = value;
    }
    get createProduitDialog(): boolean {
       return this.produitService.createDialog;
    }
    set createProduitDialog(value: boolean) {
        this.produitService.createDialog= value;
    }
    get client(): ClientDto {
        return this.clientService.item;
    }
    set client(value: ClientDto) {
        this.clientService.item = value;
    }
    get clients(): Array<ClientDto> {
        return this.clientService.items;
    }
    set clients(value: Array<ClientDto>) {
        this.clientService.items = value;
    }
    get createClientDialog(): boolean {
       return this.clientService.createDialog;
    }
    set createClientDialog(value: boolean) {
        this.clientService.createDialog= value;
    }
    get magasin(): MagasinDto {
        return this.magasinService.item;
    }
    set magasin(value: MagasinDto) {
        this.magasinService.item = value;
    }
    get magasins(): Array<MagasinDto> {
        return this.magasinService.items;
    }
    set magasins(value: Array<MagasinDto>) {
        this.magasinService.items = value;
    }
    get createMagasinDialog(): boolean {
       return this.magasinService.createDialog;
    }
    set createMagasinDialog(value: boolean) {
        this.magasinService.createDialog= value;
    }
    get store(): StoreDto {
        return this.storeService.item;
    }
    set store(value: StoreDto) {
        this.storeService.item = value;
    }
    get stores(): Array<StoreDto> {
        return this.storeService.items;
    }
    set stores(value: Array<StoreDto>) {
        this.storeService.items = value;
    }
    get createStoreDialog(): boolean {
       return this.storeService.createDialog;
    }
    set createStoreDialog(value: boolean) {
        this.storeService.createDialog= value;
    }
    get livraison(): LivraisonDto {
        return this.livraisonService.item;
    }
    set livraison(value: LivraisonDto) {
        this.livraisonService.item = value;
    }
    get livraisons(): Array<LivraisonDto> {
        return this.livraisonService.items;
    }
    set livraisons(value: Array<LivraisonDto>) {
        this.livraisonService.items = value;
    }
    get createLivraisonDialog(): boolean {
       return this.livraisonService.createDialog;
    }
    set createLivraisonDialog(value: boolean) {
        this.livraisonService.createDialog= value;
    }
    get etatDemande(): EtatDemandeDto {
        return this.etatDemandeService.item;
    }
    set etatDemande(value: EtatDemandeDto) {
        this.etatDemandeService.item = value;
    }
    get etatDemandes(): Array<EtatDemandeDto> {
        return this.etatDemandeService.items;
    }
    set etatDemandes(value: Array<EtatDemandeDto>) {
        this.etatDemandeService.items = value;
    }
    get createEtatDemandeDialog(): boolean {
       return this.etatDemandeService.createDialog;
    }
    set createEtatDemandeDialog(value: boolean) {
        this.etatDemandeService.createDialog= value;
    }




    get validProduitReference(): boolean {
        return this._validProduitReference;
    }
    set validProduitReference(value: boolean) {
        this._validProduitReference = value;
    }
    get validProduitLibelle(): boolean {
        return this._validProduitLibelle;
    }
    set validProduitLibelle(value: boolean) {
        this._validProduitLibelle = value;
    }
    get validClientCin(): boolean {
        return this._validClientCin;
    }
    set validClientCin(value: boolean) {
        this._validClientCin = value;
    }
    get validClientNom(): boolean {
        return this._validClientNom;
    }
    set validClientNom(value: boolean) {
        this._validClientNom = value;
    }
    get validStoreLibelle(): boolean {
        return this._validStoreLibelle;
    }
    set validStoreLibelle(value: boolean) {
        this._validStoreLibelle = value;
    }
    get validStoreReference(): boolean {
        return this._validStoreReference;
    }
    set validStoreReference(value: boolean) {
        this._validStoreReference = value;
    }
    get validEtatDemandeLibelle(): boolean {
        return this._validEtatDemandeLibelle;
    }
    set validEtatDemandeLibelle(value: boolean) {
        this._validEtatDemandeLibelle = value;
    }
    get validEtatDemandeCode(): boolean {
        return this._validEtatDemandeCode;
    }
    set validEtatDemandeCode(value: boolean) {
        this._validEtatDemandeCode = value;
    }

    get demandeItemsElement(): DemandeItemDto {
        if( this._demandeItemsElement == null )
            this._demandeItemsElement = new DemandeItemDto();
        return this._demandeItemsElement;
    }

    set demandeItemsElement(value: DemandeItemDto) {
        this._demandeItemsElement = value;
    }

}
