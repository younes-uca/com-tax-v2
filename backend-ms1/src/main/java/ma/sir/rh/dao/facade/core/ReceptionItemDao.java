package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.ReceptionItem;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ReceptionItemDao extends AbstractRepository<ReceptionItem,Long>  {

    List<ReceptionItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<ReceptionItem> findByMagasinId(Long id);
    int deleteByMagasinId(Long id);
    List<ReceptionItem> findByReceptionId(Long id);
    int deleteByReceptionId(Long id);

}
