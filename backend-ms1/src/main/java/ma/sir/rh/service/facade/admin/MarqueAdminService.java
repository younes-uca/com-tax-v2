package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Marque;
import ma.sir.rh.dao.criteria.core.MarqueCriteria;
import ma.sir.rh.dao.criteria.history.MarqueHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.MarqueDto;

public interface MarqueAdminService extends  IService<Marque,MarqueCriteria, MarqueHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(MarqueDto dto) throws Exception;


}
