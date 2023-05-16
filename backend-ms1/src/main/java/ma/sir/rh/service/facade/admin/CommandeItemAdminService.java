package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.CommandeItem;
import ma.sir.rh.dao.criteria.core.CommandeItemCriteria;
import ma.sir.rh.dao.criteria.history.CommandeItemHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.CommandeItemDto;

public interface CommandeItemAdminService extends  IService<CommandeItem,CommandeItemCriteria, CommandeItemHistoryCriteria>  {

    List<CommandeItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<CommandeItem> findByCommandeId(Long id);
    int deleteByCommandeId(Long id);
    List<CommandeItem> findByEtatCommandeId(Long id);
    int deleteByEtatCommandeId(Long id);

    HttpEntity<byte[]> createPdf(CommandeItemDto dto) throws Exception;


}
