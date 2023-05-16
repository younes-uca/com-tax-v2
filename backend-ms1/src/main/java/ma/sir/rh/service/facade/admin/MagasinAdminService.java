package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Magasin;
import ma.sir.rh.dao.criteria.core.MagasinCriteria;
import ma.sir.rh.dao.criteria.history.MagasinHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.MagasinDto;

public interface MagasinAdminService extends  IService<Magasin,MagasinCriteria, MagasinHistoryCriteria>  {

    List<Magasin> findByStoreId(Long id);
    int deleteByStoreId(Long id);

    HttpEntity<byte[]> createPdf(MagasinDto dto) throws Exception;


}
