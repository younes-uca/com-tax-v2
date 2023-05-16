package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.ComptableValidateurHistory;
import ma.sir.rh.bean.core.ComptableValidateur;
import ma.sir.rh.ws.dto.ComptableValidateurDto;

@Component
public class ComptableValidateurConverter extends AbstractConverter<ComptableValidateur, ComptableValidateurDto, ComptableValidateurHistory> {


    public  ComptableValidateurConverter(){
        super(ComptableValidateur.class, ComptableValidateurDto.class, ComptableValidateurHistory.class);
    }

    @Override
    public ComptableValidateur toItem(ComptableValidateurDto dto) {
        if (dto == null) {
            return null;
        } else {
        ComptableValidateur item = new ComptableValidateur();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());


        return item;
        }
    }

    @Override
    public ComptableValidateurDto toDto(ComptableValidateur item) {
        if (item == null) {
            return null;
        } else {
            ComptableValidateurDto dto = new ComptableValidateurDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
