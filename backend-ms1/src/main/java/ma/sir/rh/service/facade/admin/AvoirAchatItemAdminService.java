package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.AvoirAchatItem;
import ma.sir.rh.dao.criteria.core.AvoirAchatItemCriteria;
import ma.sir.rh.dao.criteria.history.AvoirAchatItemHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.AvoirAchatItemDto;

public interface AvoirAchatItemAdminService extends  IService<AvoirAchatItem,AvoirAchatItemCriteria, AvoirAchatItemHistoryCriteria>  {

    List<AvoirAchatItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<AvoirAchatItem> findByAvoirAchatId(Long id);
    int deleteByAvoirAchatId(Long id);

    HttpEntity<byte[]> createPdf(AvoirAchatItemDto dto) throws Exception;


}
