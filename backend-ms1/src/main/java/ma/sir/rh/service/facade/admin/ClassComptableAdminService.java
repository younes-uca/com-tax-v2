package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.ClassComptable;
import ma.sir.rh.dao.criteria.core.ClassComptableCriteria;
import ma.sir.rh.dao.criteria.history.ClassComptableHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.ClassComptableDto;

public interface ClassComptableAdminService extends  IService<ClassComptable,ClassComptableCriteria, ClassComptableHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(ClassComptableDto dto) throws Exception;


}
