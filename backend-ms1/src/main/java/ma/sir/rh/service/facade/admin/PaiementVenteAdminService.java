package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.PaiementVente;
import ma.sir.rh.dao.criteria.core.PaiementVenteCriteria;
import ma.sir.rh.dao.criteria.history.PaiementVenteHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.PaiementVenteDto;

public interface PaiementVenteAdminService extends  IService<PaiementVente,PaiementVenteCriteria, PaiementVenteHistoryCriteria>  {

    List<PaiementVente> findByVenteId(Long id);
    int deleteByVenteId(Long id);
    List<PaiementVente> findByModePaiementId(Long id);
    int deleteByModePaiementId(Long id);
    List<PaiementVente> findByEtatPaiementVenteId(Long id);
    int deleteByEtatPaiementVenteId(Long id);

    HttpEntity<byte[]> createPdf(PaiementVenteDto dto) throws Exception;


}
