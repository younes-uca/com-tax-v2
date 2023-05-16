package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.rh.bean.core.DevisFournisseur;

import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.DevisItemFournisseurHistory;
import ma.sir.rh.bean.core.DevisItemFournisseur;
import ma.sir.rh.ws.dto.DevisItemFournisseurDto;

@Component
public class DevisItemFournisseurConverter extends AbstractConverter<DevisItemFournisseur, DevisItemFournisseurDto, DevisItemFournisseurHistory> {

    @Autowired
    private ProduitConverter produitConverter ;
    @Autowired
    private DevisFournisseurConverter devisFournisseurConverter ;
    private boolean produit;
    private boolean devisFournisseur;

    public  DevisItemFournisseurConverter(){
        super(DevisItemFournisseur.class, DevisItemFournisseurDto.class, DevisItemFournisseurHistory.class);
    }

    @Override
    public DevisItemFournisseur toItem(DevisItemFournisseurDto dto) {
        if (dto == null) {
            return null;
        } else {
        DevisItemFournisseur item = new DevisItemFournisseur();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getPrixUnitaire()))
                item.setPrixUnitaire(dto.getPrixUnitaire());
            if(StringUtil.isNotEmpty(dto.getQuantite()))
                item.setQuantite(dto.getQuantite());
            if(StringUtil.isNotEmpty(dto.getRemise()))
                item.setRemise(dto.getRemise());
            if(this.produit && dto.getProduit()!=null)
                item.setProduit(produitConverter.toItem(dto.getProduit())) ;

            if(dto.getDevisFournisseur() != null && dto.getDevisFournisseur().getId() != null){
                item.setDevisFournisseur(new DevisFournisseur());
                item.getDevisFournisseur().setId(dto.getDevisFournisseur().getId());
            }



        return item;
        }
    }

    @Override
    public DevisItemFournisseurDto toDto(DevisItemFournisseur item) {
        if (item == null) {
            return null;
        } else {
            DevisItemFournisseurDto dto = new DevisItemFournisseurDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getPrixUnitaire()))
                dto.setPrixUnitaire(item.getPrixUnitaire());
            if(StringUtil.isNotEmpty(item.getQuantite()))
                dto.setQuantite(item.getQuantite());
            if(StringUtil.isNotEmpty(item.getRemise()))
                dto.setRemise(item.getRemise());
        if(this.produit && item.getProduit()!=null) {
            dto.setProduit(produitConverter.toDto(item.getProduit())) ;
        }
        if(this.devisFournisseur && item.getDevisFournisseur()!=null) {
            dto.setDevisFournisseur(devisFournisseurConverter.toDto(item.getDevisFournisseur())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.produit = value;
        this.devisFournisseur = value;
    }


    public ProduitConverter getProduitConverter(){
        return this.produitConverter;
    }
    public void setProduitConverter(ProduitConverter produitConverter ){
        this.produitConverter = produitConverter;
    }
    public DevisFournisseurConverter getDevisFournisseurConverter(){
        return this.devisFournisseurConverter;
    }
    public void setDevisFournisseurConverter(DevisFournisseurConverter devisFournisseurConverter ){
        this.devisFournisseurConverter = devisFournisseurConverter;
    }
    public boolean  isProduit(){
        return this.produit;
    }
    public void  setProduit(boolean produit){
        this.produit = produit;
    }
    public boolean  isDevisFournisseur(){
        return this.devisFournisseur;
    }
    public void  setDevisFournisseur(boolean devisFournisseur){
        this.devisFournisseur = devisFournisseur;
    }
}
