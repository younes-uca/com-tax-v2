package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.StockProduit;
import ma.sir.rh.dao.criteria.core.StockProduitCriteria;
import ma.sir.rh.dao.criteria.history.StockProduitHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.StockProduitDto;

public interface StockProduitAdminService extends  IService<StockProduit,StockProduitCriteria, StockProduitHistoryCriteria>  {

    List<StockProduit> findByMagasinId(Long id);
    int deleteByMagasinId(Long id);
    List<StockProduit> findByProduitId(Long id);
    int deleteByProduitId(Long id);

    HttpEntity<byte[]> createPdf(StockProduitDto dto) throws Exception;


}
