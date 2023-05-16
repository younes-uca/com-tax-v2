package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.PaiementLivraison;
import ma.sir.rh.dao.criteria.core.PaiementLivraisonCriteria;
import ma.sir.rh.dao.criteria.history.PaiementLivraisonHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.PaiementLivraisonDto;

public interface PaiementLivraisonAdminService extends  IService<PaiementLivraison,PaiementLivraisonCriteria, PaiementLivraisonHistoryCriteria>  {

    List<PaiementLivraison> findByLivraisonId(Long id);
    int deleteByLivraisonId(Long id);
    List<PaiementLivraison> findByVenteId(Long id);
    int deleteByVenteId(Long id);
    List<PaiementLivraison> findByModePaiementId(Long id);
    int deleteByModePaiementId(Long id);
    List<PaiementLivraison> findByEtatPaiementLivraisonId(Long id);
    int deleteByEtatPaiementLivraisonId(Long id);

    HttpEntity<byte[]> createPdf(PaiementLivraisonDto dto) throws Exception;


}
