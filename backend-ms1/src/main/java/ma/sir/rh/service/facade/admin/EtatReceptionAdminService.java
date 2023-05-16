package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.EtatReception;
import ma.sir.rh.dao.criteria.core.EtatReceptionCriteria;
import ma.sir.rh.dao.criteria.history.EtatReceptionHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.EtatReceptionDto;

public interface EtatReceptionAdminService extends  IService<EtatReception,EtatReceptionCriteria, EtatReceptionHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(EtatReceptionDto dto) throws Exception;


}
