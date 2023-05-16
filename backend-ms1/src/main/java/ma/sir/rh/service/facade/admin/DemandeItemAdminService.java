package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.DemandeItem;
import ma.sir.rh.dao.criteria.core.DemandeItemCriteria;
import ma.sir.rh.dao.criteria.history.DemandeItemHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.DemandeItemDto;

public interface DemandeItemAdminService extends  IService<DemandeItem,DemandeItemCriteria, DemandeItemHistoryCriteria>  {

    List<DemandeItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<DemandeItem> findByDemandeId(Long id);
    int deleteByDemandeId(Long id);

    HttpEntity<byte[]> createPdf(DemandeItemDto dto) throws Exception;


}
