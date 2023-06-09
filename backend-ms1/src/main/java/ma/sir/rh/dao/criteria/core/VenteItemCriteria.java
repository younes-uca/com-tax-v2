package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;

public class VenteItemCriteria extends  BaseCriteria  {

    private String prixUnitaire;
    private String prixUnitaireMin;
    private String prixUnitaireMax;
    private String quantite;
    private String quantiteMin;
    private String quantiteMax;
    private String remise;
    private String remiseMin;
    private String remiseMax;
    private String quantiteAvoir;
    private String quantiteAvoirMin;
    private String quantiteAvoirMax;

    private ProduitCriteria produit ;
    private List<ProduitCriteria> produits ;
    private VenteCriteria vente ;
    private List<VenteCriteria> ventes ;


    public VenteItemCriteria(){}

    public String getPrixUnitaire(){
        return this.prixUnitaire;
    }
    public void setPrixUnitaire(String prixUnitaire){
        this.prixUnitaire = prixUnitaire;
    }   
    public String getPrixUnitaireMin(){
        return this.prixUnitaireMin;
    }
    public void setPrixUnitaireMin(String prixUnitaireMin){
        this.prixUnitaireMin = prixUnitaireMin;
    }
    public String getPrixUnitaireMax(){
        return this.prixUnitaireMax;
    }
    public void setPrixUnitaireMax(String prixUnitaireMax){
        this.prixUnitaireMax = prixUnitaireMax;
    }
      
    public String getQuantite(){
        return this.quantite;
    }
    public void setQuantite(String quantite){
        this.quantite = quantite;
    }   
    public String getQuantiteMin(){
        return this.quantiteMin;
    }
    public void setQuantiteMin(String quantiteMin){
        this.quantiteMin = quantiteMin;
    }
    public String getQuantiteMax(){
        return this.quantiteMax;
    }
    public void setQuantiteMax(String quantiteMax){
        this.quantiteMax = quantiteMax;
    }
      
    public String getRemise(){
        return this.remise;
    }
    public void setRemise(String remise){
        this.remise = remise;
    }   
    public String getRemiseMin(){
        return this.remiseMin;
    }
    public void setRemiseMin(String remiseMin){
        this.remiseMin = remiseMin;
    }
    public String getRemiseMax(){
        return this.remiseMax;
    }
    public void setRemiseMax(String remiseMax){
        this.remiseMax = remiseMax;
    }
      
    public String getQuantiteAvoir(){
        return this.quantiteAvoir;
    }
    public void setQuantiteAvoir(String quantiteAvoir){
        this.quantiteAvoir = quantiteAvoir;
    }   
    public String getQuantiteAvoirMin(){
        return this.quantiteAvoirMin;
    }
    public void setQuantiteAvoirMin(String quantiteAvoirMin){
        this.quantiteAvoirMin = quantiteAvoirMin;
    }
    public String getQuantiteAvoirMax(){
        return this.quantiteAvoirMax;
    }
    public void setQuantiteAvoirMax(String quantiteAvoirMax){
        this.quantiteAvoirMax = quantiteAvoirMax;
    }
      

    public ProduitCriteria getProduit(){
        return this.produit;
    }

    public void setProduit(ProduitCriteria produit){
        this.produit = produit;
    }
    public List<ProduitCriteria> getProduits(){
        return this.produits;
    }

    public void setProduits(List<ProduitCriteria> produits){
        this.produits = produits;
    }
    public VenteCriteria getVente(){
        return this.vente;
    }

    public void setVente(VenteCriteria vente){
        this.vente = vente;
    }
    public List<VenteCriteria> getVentes(){
        return this.ventes;
    }

    public void setVentes(List<VenteCriteria> ventes){
        this.ventes = ventes;
    }
}
