package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.SousClassComptable;
import ma.sir.rh.dao.criteria.core.SousClassComptableCriteria;
import ma.sir.rh.dao.criteria.history.SousClassComptableHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.SousClassComptableDto;

public interface SousClassComptableAdminService extends  IService<SousClassComptable,SousClassComptableCriteria, SousClassComptableHistoryCriteria>  {

    List<SousClassComptable> findByClassComptableId(Long id);
    int deleteByClassComptableId(Long id);

    HttpEntity<byte[]> createPdf(SousClassComptableDto dto) throws Exception;


}
