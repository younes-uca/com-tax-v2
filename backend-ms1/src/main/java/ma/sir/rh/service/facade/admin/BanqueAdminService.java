package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Banque;
import ma.sir.rh.dao.criteria.core.BanqueCriteria;
import ma.sir.rh.dao.criteria.history.BanqueHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.BanqueDto;

public interface BanqueAdminService extends  IService<Banque,BanqueCriteria, BanqueHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(BanqueDto dto) throws Exception;


}
