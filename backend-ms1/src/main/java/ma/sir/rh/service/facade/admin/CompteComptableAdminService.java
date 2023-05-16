package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.CompteComptable;
import ma.sir.rh.dao.criteria.core.CompteComptableCriteria;
import ma.sir.rh.dao.criteria.history.CompteComptableHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.CompteComptableDto;

public interface CompteComptableAdminService extends  IService<CompteComptable,CompteComptableCriteria, CompteComptableHistoryCriteria>  {

    List<CompteComptable> findBySousClassComptableId(Long id);
    int deleteBySousClassComptableId(Long id);

    HttpEntity<byte[]> createPdf(CompteComptableDto dto) throws Exception;


}
