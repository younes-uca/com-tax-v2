package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.AchatItem;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AchatItemDao extends AbstractRepository<AchatItem,Long>  {

    List<AchatItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<AchatItem> findByAchatId(Long id);
    int deleteByAchatId(Long id);

}
