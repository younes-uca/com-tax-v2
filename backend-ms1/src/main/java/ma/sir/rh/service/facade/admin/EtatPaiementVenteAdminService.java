package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.EtatPaiementVente;
import ma.sir.rh.dao.criteria.core.EtatPaiementVenteCriteria;
import ma.sir.rh.dao.criteria.history.EtatPaiementVenteHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.EtatPaiementVenteDto;

public interface EtatPaiementVenteAdminService extends  IService<EtatPaiementVente,EtatPaiementVenteCriteria, EtatPaiementVenteHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(EtatPaiementVenteDto dto) throws Exception;


}
