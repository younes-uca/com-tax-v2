package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.DevisFournisseur;
import ma.sir.rh.dao.criteria.core.DevisFournisseurCriteria;
import ma.sir.rh.dao.criteria.history.DevisFournisseurHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.DevisFournisseurDto;

public interface DevisFournisseurAdminService extends  IService<DevisFournisseur,DevisFournisseurCriteria, DevisFournisseurHistoryCriteria>  {

    List<DevisFournisseur> findByFournisseurId(Long id);
    int deleteByFournisseurId(Long id);

    HttpEntity<byte[]> createPdf(DevisFournisseurDto dto) throws Exception;


}
