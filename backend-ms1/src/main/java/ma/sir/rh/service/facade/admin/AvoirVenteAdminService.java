package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.AvoirVente;
import ma.sir.rh.dao.criteria.core.AvoirVenteCriteria;
import ma.sir.rh.dao.criteria.history.AvoirVenteHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.AvoirVenteDto;

public interface AvoirVenteAdminService extends  IService<AvoirVente,AvoirVenteCriteria, AvoirVenteHistoryCriteria>  {

    List<AvoirVente> findByVenteId(Long id);
    int deleteByVenteId(Long id);
    List<AvoirVente> findByEtatAvoirVenteId(Long id);
    int deleteByEtatAvoirVenteId(Long id);

    HttpEntity<byte[]> createPdf(AvoirVenteDto dto) throws Exception;


}
