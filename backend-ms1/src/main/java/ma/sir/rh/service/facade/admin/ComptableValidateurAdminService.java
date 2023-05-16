package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.ComptableValidateur;
import ma.sir.rh.dao.criteria.core.ComptableValidateurCriteria;
import ma.sir.rh.dao.criteria.history.ComptableValidateurHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.ComptableValidateurDto;

public interface ComptableValidateurAdminService extends  IService<ComptableValidateur,ComptableValidateurCriteria, ComptableValidateurHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(ComptableValidateurDto dto) throws Exception;


}
