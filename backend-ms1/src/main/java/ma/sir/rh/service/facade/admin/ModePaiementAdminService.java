package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.ModePaiement;
import ma.sir.rh.dao.criteria.core.ModePaiementCriteria;
import ma.sir.rh.dao.criteria.history.ModePaiementHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.ModePaiementDto;

public interface ModePaiementAdminService extends  IService<ModePaiement,ModePaiementCriteria, ModePaiementHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(ModePaiementDto dto) throws Exception;


}
