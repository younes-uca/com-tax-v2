package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.ComptableTraitant;
import ma.sir.rh.dao.criteria.core.ComptableTraitantCriteria;
import ma.sir.rh.dao.criteria.history.ComptableTraitantHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.ComptableTraitantDto;

public interface ComptableTraitantAdminService extends  IService<ComptableTraitant,ComptableTraitantCriteria, ComptableTraitantHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(ComptableTraitantDto dto) throws Exception;


}
