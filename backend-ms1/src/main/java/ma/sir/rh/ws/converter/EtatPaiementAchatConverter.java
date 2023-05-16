package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.EtatPaiementAchatHistory;
import ma.sir.rh.bean.core.EtatPaiementAchat;
import ma.sir.rh.ws.dto.EtatPaiementAchatDto;

@Component
public class EtatPaiementAchatConverter extends AbstractConverter<EtatPaiementAchat, EtatPaiementAchatDto, EtatPaiementAchatHistory> {


    public  EtatPaiementAchatConverter(){
        super(EtatPaiementAchat.class, EtatPaiementAchatDto.class, EtatPaiementAchatHistory.class);
    }

    @Override
    public EtatPaiementAchat toItem(EtatPaiementAchatDto dto) {
        if (dto == null) {
            return null;
        } else {
        EtatPaiementAchat item = new EtatPaiementAchat();
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
    public EtatPaiementAchatDto toDto(EtatPaiementAchat item) {
        if (item == null) {
            return null;
        } else {
            EtatPaiementAchatDto dto = new EtatPaiementAchatDto();
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
