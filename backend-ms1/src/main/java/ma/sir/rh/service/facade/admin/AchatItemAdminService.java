package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.AchatItem;
import ma.sir.rh.dao.criteria.core.AchatItemCriteria;
import ma.sir.rh.dao.criteria.history.AchatItemHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.AchatItemDto;

public interface AchatItemAdminService extends  IService<AchatItem,AchatItemCriteria, AchatItemHistoryCriteria>  {

    List<AchatItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<AchatItem> findByAchatId(Long id);
    int deleteByAchatId(Long id);

    HttpEntity<byte[]> createPdf(AchatItemDto dto) throws Exception;


}
