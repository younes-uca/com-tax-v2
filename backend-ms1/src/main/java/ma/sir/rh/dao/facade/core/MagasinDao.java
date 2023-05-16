package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Magasin;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface MagasinDao extends AbstractRepository<Magasin,Long>  {

    List<Magasin> findByStoreId(Long id);
    int deleteByStoreId(Long id);

}
