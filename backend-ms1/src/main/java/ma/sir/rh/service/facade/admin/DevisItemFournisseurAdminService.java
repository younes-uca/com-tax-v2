package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.DevisItemFournisseur;
import ma.sir.rh.dao.criteria.core.DevisItemFournisseurCriteria;
import ma.sir.rh.dao.criteria.history.DevisItemFournisseurHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.DevisItemFournisseurDto;

public interface DevisItemFournisseurAdminService extends  IService<DevisItemFournisseur,DevisItemFournisseurCriteria, DevisItemFournisseurHistoryCriteria>  {

    List<DevisItemFournisseur> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<DevisItemFournisseur> findByDevisFournisseurId(Long id);
    int deleteByDevisFournisseurId(Long id);

    HttpEntity<byte[]> createPdf(DevisItemFournisseurDto dto) throws Exception;


}
