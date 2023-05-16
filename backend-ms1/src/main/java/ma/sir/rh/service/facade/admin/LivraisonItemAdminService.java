package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.LivraisonItem;
import ma.sir.rh.dao.criteria.core.LivraisonItemCriteria;
import ma.sir.rh.dao.criteria.history.LivraisonItemHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.LivraisonItemDto;

public interface LivraisonItemAdminService extends  IService<LivraisonItem,LivraisonItemCriteria, LivraisonItemHistoryCriteria>  {

    List<LivraisonItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<LivraisonItem> findByLivraisonId(Long id);
    int deleteByLivraisonId(Long id);

    HttpEntity<byte[]> createPdf(LivraisonItemDto dto) throws Exception;


}
