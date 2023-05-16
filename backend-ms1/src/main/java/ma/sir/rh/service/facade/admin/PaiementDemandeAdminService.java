package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.PaiementDemande;
import ma.sir.rh.dao.criteria.core.PaiementDemandeCriteria;
import ma.sir.rh.dao.criteria.history.PaiementDemandeHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.PaiementDemandeDto;

public interface PaiementDemandeAdminService extends  IService<PaiementDemande,PaiementDemandeCriteria, PaiementDemandeHistoryCriteria>  {

    List<PaiementDemande> findByDemandeId(Long id);
    int deleteByDemandeId(Long id);
    List<PaiementDemande> findByModePaiementId(Long id);
    int deleteByModePaiementId(Long id);

    HttpEntity<byte[]> createPdf(PaiementDemandeDto dto) throws Exception;


}
