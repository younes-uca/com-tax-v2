package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.AvoirVenteItem;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AvoirVenteItemDao extends AbstractRepository<AvoirVenteItem,Long>  {

    List<AvoirVenteItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<AvoirVenteItem> findByAvoirVenteId(Long id);
    int deleteByAvoirVenteId(Long id);

}
