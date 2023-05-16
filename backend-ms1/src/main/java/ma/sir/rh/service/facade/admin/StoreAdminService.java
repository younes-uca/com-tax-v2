package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Store;
import ma.sir.rh.dao.criteria.core.StoreCriteria;
import ma.sir.rh.dao.criteria.history.StoreHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.StoreDto;

public interface StoreAdminService extends  IService<Store,StoreCriteria, StoreHistoryCriteria>  {

    List<Store> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);

    HttpEntity<byte[]> createPdf(StoreDto dto) throws Exception;


}
