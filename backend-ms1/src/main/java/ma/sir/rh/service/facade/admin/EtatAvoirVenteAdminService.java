package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.EtatAvoirVente;
import ma.sir.rh.dao.criteria.core.EtatAvoirVenteCriteria;
import ma.sir.rh.dao.criteria.history.EtatAvoirVenteHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.EtatAvoirVenteDto;

public interface EtatAvoirVenteAdminService extends  IService<EtatAvoirVente,EtatAvoirVenteCriteria, EtatAvoirVenteHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(EtatAvoirVenteDto dto) throws Exception;


}
