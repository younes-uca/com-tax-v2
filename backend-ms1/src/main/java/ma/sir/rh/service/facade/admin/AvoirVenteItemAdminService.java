package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.AvoirVenteItem;
import ma.sir.rh.dao.criteria.core.AvoirVenteItemCriteria;
import ma.sir.rh.dao.criteria.history.AvoirVenteItemHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.AvoirVenteItemDto;

public interface AvoirVenteItemAdminService extends  IService<AvoirVenteItem,AvoirVenteItemCriteria, AvoirVenteItemHistoryCriteria>  {

    List<AvoirVenteItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<AvoirVenteItem> findByAvoirVenteId(Long id);
    int deleteByAvoirVenteId(Long id);

    HttpEntity<byte[]> createPdf(AvoirVenteItemDto dto) throws Exception;


}
