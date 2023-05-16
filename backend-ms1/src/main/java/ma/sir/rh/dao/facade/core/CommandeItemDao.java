package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.CommandeItem;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CommandeItemDao extends AbstractRepository<CommandeItem,Long>  {

    List<CommandeItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<CommandeItem> findByCommandeId(Long id);
    int deleteByCommandeId(Long id);
    List<CommandeItem> findByEtatCommandeId(Long id);
    int deleteByEtatCommandeId(Long id);

}
