package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.EtatPaiementVenteHistory;
import ma.sir.rh.bean.core.EtatPaiementVente;
import ma.sir.rh.ws.dto.EtatPaiementVenteDto;

@Component
public class EtatPaiementVenteConverter extends AbstractConverter<EtatPaiementVente, EtatPaiementVenteDto, EtatPaiementVenteHistory> {


    public  EtatPaiementVenteConverter(){
        super(EtatPaiementVente.class, EtatPaiementVenteDto.class, EtatPaiementVenteHistory.class);
    }

    @Override
    public EtatPaiementVente toItem(EtatPaiementVenteDto dto) {
        if (dto == null) {
            return null;
        } else {
        EtatPaiementVente item = new EtatPaiementVente();
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
    public EtatPaiementVenteDto toDto(EtatPaiementVente item) {
        if (item == null) {
            return null;
        } else {
            EtatPaiementVenteDto dto = new EtatPaiementVenteDto();
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
