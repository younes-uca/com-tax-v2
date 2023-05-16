package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.ReceptionItem;
import ma.sir.rh.dao.criteria.core.ReceptionItemCriteria;
import ma.sir.rh.dao.criteria.history.ReceptionItemHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.ReceptionItemDto;

public interface ReceptionItemAdminService extends  IService<ReceptionItem,ReceptionItemCriteria, ReceptionItemHistoryCriteria>  {

    List<ReceptionItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<ReceptionItem> findByMagasinId(Long id);
    int deleteByMagasinId(Long id);
    List<ReceptionItem> findByReceptionId(Long id);
    int deleteByReceptionId(Long id);

    HttpEntity<byte[]> createPdf(ReceptionItemDto dto) throws Exception;


}
