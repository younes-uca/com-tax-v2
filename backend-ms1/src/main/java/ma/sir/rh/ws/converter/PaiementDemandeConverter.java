package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.rh.bean.core.Demande;

import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.PaiementDemandeHistory;
import ma.sir.rh.bean.core.PaiementDemande;
import ma.sir.rh.ws.dto.PaiementDemandeDto;

@Component
public class PaiementDemandeConverter extends AbstractConverter<PaiementDemande, PaiementDemandeDto, PaiementDemandeHistory> {

    @Autowired
    private DemandeConverter demandeConverter ;
    @Autowired
    private ModePaiementConverter modePaiementConverter ;
    private boolean demande;
    private boolean modePaiement;

    public  PaiementDemandeConverter(){
        super(PaiementDemande.class, PaiementDemandeDto.class, PaiementDemandeHistory.class);
    }

    @Override
    public PaiementDemande toItem(PaiementDemandeDto dto) {
        if (dto == null) {
            return null;
        } else {
        PaiementDemande item = new PaiementDemande();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());
            if(StringUtil.isNotEmpty(dto.getDatePaiement()))
                item.setDatePaiement(DateUtil.stringEnToDate(dto.getDatePaiement()));
            if(StringUtil.isNotEmpty(dto.getMontant()))
                item.setMontant(dto.getMontant());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(dto.getDemande() != null && dto.getDemande().getId() != null){
                item.setDemande(new Demande());
                item.getDemande().setId(dto.getDemande().getId());
            }

            if(this.modePaiement && dto.getModePaiement()!=null)
                item.setModePaiement(modePaiementConverter.toItem(dto.getModePaiement())) ;



        return item;
        }
    }

    @Override
    public PaiementDemandeDto toDto(PaiementDemande item) {
        if (item == null) {
            return null;
        } else {
            PaiementDemandeDto dto = new PaiementDemandeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());
            if(item.getDatePaiement()!=null)
                dto.setDatePaiement(DateUtil.dateTimeToString(item.getDatePaiement()));
            if(StringUtil.isNotEmpty(item.getMontant()))
                dto.setMontant(item.getMontant());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.demande && item.getDemande()!=null) {
            dto.setDemande(demandeConverter.toDto(item.getDemande())) ;
        }
        if(this.modePaiement && item.getModePaiement()!=null) {
            dto.setModePaiement(modePaiementConverter.toDto(item.getModePaiement())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.demande = value;
        this.modePaiement = value;
    }


    public DemandeConverter getDemandeConverter(){
        return this.demandeConverter;
    }
    public void setDemandeConverter(DemandeConverter demandeConverter ){
        this.demandeConverter = demandeConverter;
    }
    public ModePaiementConverter getModePaiementConverter(){
        return this.modePaiementConverter;
    }
    public void setModePaiementConverter(ModePaiementConverter modePaiementConverter ){
        this.modePaiementConverter = modePaiementConverter;
    }
    public boolean  isDemande(){
        return this.demande;
    }
    public void  setDemande(boolean demande){
        this.demande = demande;
    }
    public boolean  isModePaiement(){
        return this.modePaiement;
    }
    public void  setModePaiement(boolean modePaiement){
        this.modePaiement = modePaiement;
    }
}
