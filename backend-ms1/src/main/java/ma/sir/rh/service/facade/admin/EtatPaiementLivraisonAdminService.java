package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.EtatPaiementLivraison;
import ma.sir.rh.dao.criteria.core.EtatPaiementLivraisonCriteria;
import ma.sir.rh.dao.criteria.history.EtatPaiementLivraisonHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.EtatPaiementLivraisonDto;

public interface EtatPaiementLivraisonAdminService extends  IService<EtatPaiementLivraison,EtatPaiementLivraisonCriteria, EtatPaiementLivraisonHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(EtatPaiementLivraisonDto dto) throws Exception;


}
