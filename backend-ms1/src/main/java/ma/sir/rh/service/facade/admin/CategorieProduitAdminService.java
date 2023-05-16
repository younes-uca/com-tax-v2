package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.CategorieProduit;
import ma.sir.rh.dao.criteria.core.CategorieProduitCriteria;
import ma.sir.rh.dao.criteria.history.CategorieProduitHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.CategorieProduitDto;

public interface CategorieProduitAdminService extends  IService<CategorieProduit,CategorieProduitCriteria, CategorieProduitHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(CategorieProduitDto dto) throws Exception;


}
