package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Banque;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface BanqueDao extends AbstractRepository<Banque,Long>  {


    @Query("SELECT NEW Banque(item.id,item.libelle) FROM Banque item")
    List<Banque> findAllOptimized();
}
