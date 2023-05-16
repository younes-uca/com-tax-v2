package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.PaiementCommande;
import ma.sir.rh.dao.criteria.core.PaiementCommandeCriteria;
import ma.sir.rh.dao.criteria.history.PaiementCommandeHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.PaiementCommandeDto;

public interface PaiementCommandeAdminService extends  IService<PaiementCommande,PaiementCommandeCriteria, PaiementCommandeHistoryCriteria>  {

    List<PaiementCommande> findByCommandeId(Long id);
    int deleteByCommandeId(Long id);
    List<PaiementCommande> findByModePaiementId(Long id);
    int deleteByModePaiementId(Long id);
    List<PaiementCommande> findByEtatPaiementCommandeId(Long id);
    int deleteByEtatPaiementCommandeId(Long id);

    HttpEntity<byte[]> createPdf(PaiementCommandeDto dto) throws Exception;


}
