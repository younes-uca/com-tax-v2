package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Fournisseur;
import ma.sir.rh.dao.criteria.core.FournisseurCriteria;
import ma.sir.rh.dao.criteria.history.FournisseurHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.FournisseurDto;

public interface FournisseurAdminService extends  IService<Fournisseur,FournisseurCriteria, FournisseurHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(FournisseurDto dto) throws Exception;


}
