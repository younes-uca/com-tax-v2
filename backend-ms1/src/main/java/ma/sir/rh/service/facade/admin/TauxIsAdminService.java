package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.TauxIs;
import ma.sir.rh.dao.criteria.core.TauxIsCriteria;
import ma.sir.rh.dao.criteria.history.TauxIsHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.TauxIsDto;

public interface TauxIsAdminService extends  IService<TauxIs,TauxIsCriteria, TauxIsHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(TauxIsDto dto) throws Exception;


}
