package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Abonne;
import ma.sir.rh.dao.criteria.core.AbonneCriteria;
import ma.sir.rh.dao.criteria.history.AbonneHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.AbonneDto;

public interface AbonneAdminService extends  IService<Abonne,AbonneCriteria, AbonneHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(AbonneDto dto) throws Exception;


}
