package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Livraison;
import ma.sir.rh.dao.criteria.core.LivraisonCriteria;
import ma.sir.rh.dao.criteria.history.LivraisonHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.LivraisonDto;

public interface LivraisonAdminService extends  IService<Livraison,LivraisonCriteria, LivraisonHistoryCriteria>  {

    List<Livraison> findByDemandeId(Long id);
    int deleteByDemandeId(Long id);
    List<Livraison> findByEtatLivraisonId(Long id);
    int deleteByEtatLivraisonId(Long id);
    List<Livraison> findByClientId(Long id);
    int deleteByClientId(Long id);

    HttpEntity<byte[]> createPdf(LivraisonDto dto) throws Exception;


}
