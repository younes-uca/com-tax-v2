package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.EtatPaiementLivraisonHistory;
import ma.sir.rh.bean.core.EtatPaiementLivraison;
import ma.sir.rh.ws.dto.EtatPaiementLivraisonDto;

@Component
public class EtatPaiementLivraisonConverter extends AbstractConverter<EtatPaiementLivraison, EtatPaiementLivraisonDto, EtatPaiementLivraisonHistory> {


    public  EtatPaiementLivraisonConverter(){
        super(EtatPaiementLivraison.class, EtatPaiementLivraisonDto.class, EtatPaiementLivraisonHistory.class);
    }

    @Override
    public EtatPaiementLivraison toItem(EtatPaiementLivraisonDto dto) {
        if (dto == null) {
            return null;
        } else {
        EtatPaiementLivraison item = new EtatPaiementLivraison();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getStyle()))
                item.setStyle(dto.getStyle());


        return item;
        }
    }

    @Override
    public EtatPaiementLivraisonDto toDto(EtatPaiementLivraison item) {
        if (item == null) {
            return null;
        } else {
            EtatPaiementLivraisonDto dto = new EtatPaiementLivraisonDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getStyle()))
                dto.setStyle(item.getStyle());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
