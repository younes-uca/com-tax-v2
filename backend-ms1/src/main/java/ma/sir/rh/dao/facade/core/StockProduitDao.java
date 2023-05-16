package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.StockProduit;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface StockProduitDao extends AbstractRepository<StockProduit,Long>  {

    List<StockProduit> findByMagasinId(Long id);
    int deleteByMagasinId(Long id);
    List<StockProduit> findByProduitId(Long id);
    int deleteByProduitId(Long id);

}
