package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.AvoirAchatItem;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AvoirAchatItemDao extends AbstractRepository<AvoirAchatItem,Long>  {

    List<AvoirAchatItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<AvoirAchatItem> findByAvoirAchatId(Long id);
    int deleteByAvoirAchatId(Long id);

}
