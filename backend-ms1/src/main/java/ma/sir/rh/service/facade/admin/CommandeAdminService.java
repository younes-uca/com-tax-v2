package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Commande;
import ma.sir.rh.dao.criteria.core.CommandeCriteria;
import ma.sir.rh.dao.criteria.history.CommandeHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.CommandeDto;

public interface CommandeAdminService extends  IService<Commande,CommandeCriteria, CommandeHistoryCriteria>  {

    List<Commande> findByClientId(Long id);
    int deleteByClientId(Long id);
    List<Commande> findByStoreId(Long id);
    int deleteByStoreId(Long id);
    List<Commande> findByEtatCommandeId(Long id);
    int deleteByEtatCommandeId(Long id);

    HttpEntity<byte[]> createPdf(CommandeDto dto) throws Exception;


}
