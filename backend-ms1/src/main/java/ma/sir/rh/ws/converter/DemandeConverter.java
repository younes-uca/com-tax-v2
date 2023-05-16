package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.rh.zynerator.util.ListUtil;

import ma.sir.rh.bean.core.Livraison;

import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.DemandeHistory;
import ma.sir.rh.bean.core.Demande;
import ma.sir.rh.ws.dto.DemandeDto;

@Component
public class DemandeConverter extends AbstractConverter<Demande, DemandeDto, DemandeHistory> {

    @Autowired
    private LivraisonConverter livraisonConverter ;
    @Autowired
    private EtatDemandeConverter etatDemandeConverter ;
    @Autowired
    private ClientConverter clientConverter ;
    @Autowired
    private MagasinConverter magasinConverter ;
    @Autowired
    private DemandeItemConverter demandeItemConverter ;
    @Autowired
    private ProduitConverter produitConverter ;
    @Autowired
    private StoreConverter storeConverter ;
    private boolean produit;
    private boolean client;
    private boolean livraison;
    private boolean magasin;
    private boolean store;
    private boolean etatDemande;
    private boolean demandeItems;

    public  DemandeConverter(){
        super(Demande.class, DemandeDto.class, DemandeHistory.class);
        init(true);
    }

    @Override
    public Demande toItem(DemandeDto dto) {
        if (dto == null) {
            return null;
        } else {
        Demande item = new Demande();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(this.produit && dto.getProduit()!=null)
                item.setProduit(produitConverter.toItem(dto.getProduit())) ;

            if(this.client && dto.getClient()!=null)
                item.setClient(clientConverter.toItem(dto.getClient())) ;

            if(dto.getLivraison() != null && dto.getLivraison().getId() != null){
                item.setLivraison(new Livraison());
                item.getLivraison().setId(dto.getLivraison().getId());
            }

            if(this.magasin && dto.getMagasin()!=null)
                item.setMagasin(magasinConverter.toItem(dto.getMagasin())) ;

            if(this.store && dto.getStore()!=null)
                item.setStore(storeConverter.toItem(dto.getStore())) ;

            if(this.etatDemande && dto.getEtatDemande()!=null)
                item.setEtatDemande(etatDemandeConverter.toItem(dto.getEtatDemande())) ;


            if(this.demandeItems && ListUtil.isNotEmpty(dto.getDemandeItems()))
                item.setDemandeItems(demandeItemConverter.toItem(dto.getDemandeItems()));

        return item;
        }
    }

    @Override
    public DemandeDto toDto(Demande item) {
        if (item == null) {
            return null;
        } else {
            DemandeDto dto = new DemandeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
        if(this.produit && item.getProduit()!=null) {
            dto.setProduit(produitConverter.toDto(item.getProduit())) ;
        }
        if(this.client && item.getClient()!=null) {
            dto.setClient(clientConverter.toDto(item.getClient())) ;
        }
        if(this.livraison && item.getLivraison()!=null) {
            livraisonConverter.setDemande(false);
            dto.setLivraison(livraisonConverter.toDto(item.getLivraison())) ;
            livraisonConverter.setDemande(true);
        }
        if(this.magasin && item.getMagasin()!=null) {
            dto.setMagasin(magasinConverter.toDto(item.getMagasin())) ;
        }
        if(this.store && item.getStore()!=null) {
            dto.setStore(storeConverter.toDto(item.getStore())) ;
        }
        if(this.etatDemande && item.getEtatDemande()!=null) {
            dto.setEtatDemande(etatDemandeConverter.toDto(item.getEtatDemande())) ;
        }
        if(this.demandeItems && ListUtil.isNotEmpty(item.getDemandeItems())){
            demandeItemConverter.init(true);
            demandeItemConverter.setDemande(false);
            dto.setDemandeItems(demandeItemConverter.toDto(item.getDemandeItems()));
            demandeItemConverter.setDemande(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.demandeItems = value;
    }

    public void initObject(boolean value) {
        this.produit = value;
        this.client = value;
        this.livraison = value;
        this.magasin = value;
        this.store = value;
        this.etatDemande = value;
    }


    public LivraisonConverter getLivraisonConverter(){
        return this.livraisonConverter;
    }
    public void setLivraisonConverter(LivraisonConverter livraisonConverter ){
        this.livraisonConverter = livraisonConverter;
    }
    public EtatDemandeConverter getEtatDemandeConverter(){
        return this.etatDemandeConverter;
    }
    public void setEtatDemandeConverter(EtatDemandeConverter etatDemandeConverter ){
        this.etatDemandeConverter = etatDemandeConverter;
    }
    public ClientConverter getClientConverter(){
        return this.clientConverter;
    }
    public void setClientConverter(ClientConverter clientConverter ){
        this.clientConverter = clientConverter;
    }
    public MagasinConverter getMagasinConverter(){
        return this.magasinConverter;
    }
    public void setMagasinConverter(MagasinConverter magasinConverter ){
        this.magasinConverter = magasinConverter;
    }
    public DemandeItemConverter getDemandeItemConverter(){
        return this.demandeItemConverter;
    }
    public void setDemandeItemConverter(DemandeItemConverter demandeItemConverter ){
        this.demandeItemConverter = demandeItemConverter;
    }
    public ProduitConverter getProduitConverter(){
        return this.produitConverter;
    }
    public void setProduitConverter(ProduitConverter produitConverter ){
        this.produitConverter = produitConverter;
    }
    public StoreConverter getStoreConverter(){
        return this.storeConverter;
    }
    public void setStoreConverter(StoreConverter storeConverter ){
        this.storeConverter = storeConverter;
    }
    public boolean  isProduit(){
        return this.produit;
    }
    public void  setProduit(boolean produit){
        this.produit = produit;
    }
    public boolean  isClient(){
        return this.client;
    }
    public void  setClient(boolean client){
        this.client = client;
    }
    public boolean  isLivraison(){
        return this.livraison;
    }
    public void  setLivraison(boolean livraison){
        this.livraison = livraison;
    }
    public boolean  isMagasin(){
        return this.magasin;
    }
    public void  setMagasin(boolean magasin){
        this.magasin = magasin;
    }
    public boolean  isStore(){
        return this.store;
    }
    public void  setStore(boolean store){
        this.store = store;
    }
    public boolean  isEtatDemande(){
        return this.etatDemande;
    }
    public void  setEtatDemande(boolean etatDemande){
        this.etatDemande = etatDemande;
    }
    public boolean  isDemandeItems(){
        return this.demandeItems ;
    }
    public void  setDemandeItems(boolean demandeItems ){
        this.demandeItems  = demandeItems ;
    }
}
