package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.EtatAchat;
import ma.sir.rh.dao.criteria.core.EtatAchatCriteria;
import ma.sir.rh.dao.criteria.history.EtatAchatHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.EtatAchatDto;

public interface EtatAchatAdminService extends  IService<EtatAchat,EtatAchatCriteria, EtatAchatHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(EtatAchatDto dto) throws Exception;


}
