package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.DemandeItem;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface DemandeItemDao extends AbstractRepository<DemandeItem,Long>  {

    List<DemandeItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<DemandeItem> findByDemandeId(Long id);
    int deleteByDemandeId(Long id);

}
