package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Produit;
import ma.sir.rh.dao.criteria.core.ProduitCriteria;
import ma.sir.rh.dao.criteria.history.ProduitHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.ProduitDto;

public interface ProduitAdminService extends  IService<Produit,ProduitCriteria, ProduitHistoryCriteria>  {

    List<Produit> findByCategorieProduitId(Long id);
    int deleteByCategorieProduitId(Long id);
    List<Produit> findByUniteMesureId(Long id);
    int deleteByUniteMesureId(Long id);
    List<Produit> findByMarqueId(Long id);
    int deleteByMarqueId(Long id);
    List<Produit> findByStoreId(Long id);
    int deleteByStoreId(Long id);

    HttpEntity<byte[]> createPdf(ProduitDto dto) throws Exception;


}
