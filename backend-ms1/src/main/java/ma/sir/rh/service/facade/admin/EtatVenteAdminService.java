package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.EtatVente;
import ma.sir.rh.dao.criteria.core.EtatVenteCriteria;
import ma.sir.rh.dao.criteria.history.EtatVenteHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.EtatVenteDto;

public interface EtatVenteAdminService extends  IService<EtatVente,EtatVenteCriteria, EtatVenteHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(EtatVenteDto dto) throws Exception;


}
