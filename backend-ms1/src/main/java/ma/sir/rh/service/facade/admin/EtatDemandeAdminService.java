package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.EtatDemande;
import ma.sir.rh.dao.criteria.core.EtatDemandeCriteria;
import ma.sir.rh.dao.criteria.history.EtatDemandeHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.EtatDemandeDto;

public interface EtatDemandeAdminService extends  IService<EtatDemande,EtatDemandeCriteria, EtatDemandeHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(EtatDemandeDto dto) throws Exception;


}
