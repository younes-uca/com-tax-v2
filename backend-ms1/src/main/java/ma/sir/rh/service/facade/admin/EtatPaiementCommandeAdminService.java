package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.EtatPaiementCommande;
import ma.sir.rh.dao.criteria.core.EtatPaiementCommandeCriteria;
import ma.sir.rh.dao.criteria.history.EtatPaiementCommandeHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.EtatPaiementCommandeDto;

public interface EtatPaiementCommandeAdminService extends  IService<EtatPaiementCommande,EtatPaiementCommandeCriteria, EtatPaiementCommandeHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(EtatPaiementCommandeDto dto) throws Exception;


}
