import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {CommandeService} from 'src/app/controller/service/Commande.service';
import {CommandeDto} from 'src/app/controller/model/Commande.model';
import {CommandeCriteria} from 'src/app/controller/criteria/CommandeCriteria.model';

import {CommandeItemDto} from 'src/app/controller/model/CommandeItem.model';
import {CommandeItemService} from 'src/app/controller/service/CommandeItem.service';
import {EtatCommandeDto} from 'src/app/controller/model/EtatCommande.model';
import {EtatCommandeService} from 'src/app/controller/service/EtatCommande.service';
import {ClientDto} from 'src/app/controller/model/Client.model';
import {ClientService} from 'src/app/controller/service/Client.service';
import {ProduitDto} from 'src/app/controller/model/Produit.model';
import {ProduitService} from 'src/app/controller/service/Produit.service';
import {StoreDto} from 'src/app/controller/model/Store.model';
import {StoreService} from 'src/app/controller/service/Store.service';
@Component({
  selector: 'app-commande-view-admin',
  templateUrl: './commande-view-admin.component.html'
})
export class CommandeViewAdminComponent extends AbstractViewController<CommandeDto, CommandeCriteria, CommandeService> implements OnInit {

    commandeItems = new CommandeItemDto();
    commandeItemss: Array<CommandeItemDto> = [];

    constructor(private commandeService: CommandeService, private commandeItemService: CommandeItemService, private etatCommandeService: EtatCommandeService, private clientService: ClientService, private produitService: ProduitService, private storeService: StoreService){
        super(commandeService);
    }

    ngOnInit(): void {
        this.commandeItems.produit = new ProduitDto();
        this.produitService.findAll().subscribe((data) => this.produits = data);
        this.commandeItems.etatCommande = new EtatCommandeDto();
        this.etatCommandeService.findAll().subscribe((data) => this.etatCommandes = data);
        this.client = new ClientDto();
        this.clientService.findAll().subscribe((data) => this.clients = data);
        this.store = new StoreDto();
        this.storeService.findAll().subscribe((data) => this.stores = data);
        this.etatCommande = new EtatCommandeDto();
        this.etatCommandeService.findAll().subscribe((data) => this.etatCommandes = data);
    }


    get produit(): ProduitDto {
       return this.produitService.item;
    }
    set produit(value: ProduitDto) {
        this.produitService.item = value;
    }
    get produits():Array<ProduitDto> {
       return this.produitService.items;
    }
    set produits(value: Array<ProduitDto>) {
        this.produitService.items = value;
    }
    get client(): ClientDto {
       return this.clientService.item;
    }
    set client(value: ClientDto) {
        this.clientService.item = value;
    }
    get clients():Array<ClientDto> {
       return this.clientService.items;
    }
    set clients(value: Array<ClientDto>) {
        this.clientService.items = value;
    }
    get etatCommande(): EtatCommandeDto {
       return this.etatCommandeService.item;
    }
    set etatCommande(value: EtatCommandeDto) {
        this.etatCommandeService.item = value;
    }
    get etatCommandes():Array<EtatCommandeDto> {
       return this.etatCommandeService.items;
    }
    set etatCommandes(value: Array<EtatCommandeDto>) {
        this.etatCommandeService.items = value;
    }
    get store(): StoreDto {
       return this.storeService.item;
    }
    set store(value: StoreDto) {
        this.storeService.item = value;
    }
    get stores():Array<StoreDto> {
       return this.storeService.items;
    }
    set stores(value: Array<StoreDto>) {
        this.storeService.items = value;
    }


}
