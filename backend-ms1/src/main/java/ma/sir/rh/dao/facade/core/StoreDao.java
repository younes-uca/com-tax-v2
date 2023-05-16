package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Store;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.Store;
import java.util.List;


@Repository
public interface StoreDao extends AbstractRepository<Store,Long>  {
    Store findByReference(String reference);
    int deleteByReference(String reference);

    List<Store> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);

    @Query("SELECT NEW Store(item.id,item.libelle) FROM Store item")
    List<Store> findAllOptimized();
}
