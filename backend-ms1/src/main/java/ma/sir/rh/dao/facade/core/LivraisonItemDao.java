package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.LivraisonItem;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface LivraisonItemDao extends AbstractRepository<LivraisonItem,Long>  {

    List<LivraisonItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<LivraisonItem> findByLivraisonId(Long id);
    int deleteByLivraisonId(Long id);

}
