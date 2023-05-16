package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.VenteItem;
import ma.sir.rh.dao.criteria.core.VenteItemCriteria;
import ma.sir.rh.dao.criteria.history.VenteItemHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.VenteItemDto;

public interface VenteItemAdminService extends  IService<VenteItem,VenteItemCriteria, VenteItemHistoryCriteria>  {

    List<VenteItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<VenteItem> findByVenteId(Long id);
    int deleteByVenteId(Long id);

    HttpEntity<byte[]> createPdf(VenteItemDto dto) throws Exception;


}
