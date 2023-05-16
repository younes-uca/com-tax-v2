package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.OperationComptable;
import ma.sir.rh.dao.criteria.core.OperationComptableCriteria;
import ma.sir.rh.dao.criteria.history.OperationComptableHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.OperationComptableDto;

public interface OperationComptableAdminService extends  IService<OperationComptable,OperationComptableCriteria, OperationComptableHistoryCriteria>  {

    List<OperationComptable> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    List<OperationComptable> findByCompteComptableId(Long id);
    int deleteByCompteComptableId(Long id);

    HttpEntity<byte[]> createPdf(OperationComptableDto dto) throws Exception;


}
