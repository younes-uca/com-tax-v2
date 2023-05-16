package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.TauxRetardTva;
import ma.sir.rh.dao.criteria.core.TauxRetardTvaCriteria;
import ma.sir.rh.dao.criteria.history.TauxRetardTvaHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.TauxRetardTvaDto;

public interface TauxRetardTvaAdminService extends  IService<TauxRetardTva,TauxRetardTvaCriteria, TauxRetardTvaHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(TauxRetardTvaDto dto) throws Exception;


}
