package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Bilan;
import ma.sir.rh.dao.criteria.core.BilanCriteria;
import ma.sir.rh.dao.criteria.history.BilanHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.BilanDto;

public interface BilanAdminService extends  IService<Bilan,BilanCriteria, BilanHistoryCriteria>  {

    List<Bilan> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);

    HttpEntity<byte[]> createPdf(BilanDto dto) throws Exception;


}
