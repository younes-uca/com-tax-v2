package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Vente;
import ma.sir.rh.dao.criteria.core.VenteCriteria;
import ma.sir.rh.dao.criteria.history.VenteHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.VenteDto;

public interface VenteAdminService extends  IService<Vente,VenteCriteria, VenteHistoryCriteria>  {

    List<Vente> findByStoreId(Long id);
    int deleteByStoreId(Long id);
    List<Vente> findByClientId(Long id);
    int deleteByClientId(Long id);
    List<Vente> findByEtatVenteId(Long id);
    int deleteByEtatVenteId(Long id);

    HttpEntity<byte[]> createPdf(VenteDto dto) throws Exception;


}
