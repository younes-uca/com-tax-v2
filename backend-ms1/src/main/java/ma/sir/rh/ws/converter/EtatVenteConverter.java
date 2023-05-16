package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.EtatVenteHistory;
import ma.sir.rh.bean.core.EtatVente;
import ma.sir.rh.ws.dto.EtatVenteDto;

@Component
public class EtatVenteConverter extends AbstractConverter<EtatVente, EtatVenteDto, EtatVenteHistory> {


    public  EtatVenteConverter(){
        super(EtatVente.class, EtatVenteDto.class, EtatVenteHistory.class);
    }

    @Override
    public EtatVente toItem(EtatVenteDto dto) {
        if (dto == null) {
            return null;
        } else {
        EtatVente item = new EtatVente();
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
    public EtatVenteDto toDto(EtatVente item) {
        if (item == null) {
            return null;
        } else {
            EtatVenteDto dto = new EtatVenteDto();
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
