package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.EtatAvoirAchat;
import ma.sir.rh.dao.criteria.core.EtatAvoirAchatCriteria;
import ma.sir.rh.dao.criteria.history.EtatAvoirAchatHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.EtatAvoirAchatDto;

public interface EtatAvoirAchatAdminService extends  IService<EtatAvoirAchat,EtatAvoirAchatCriteria, EtatAvoirAchatHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(EtatAvoirAchatDto dto) throws Exception;


}
