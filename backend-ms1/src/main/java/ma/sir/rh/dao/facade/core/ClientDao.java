package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Client;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.Client;
import java.util.List;


@Repository
public interface ClientDao extends AbstractRepository<Client,Long>  {
    Client findByCin(String cin);
    int deleteByCin(String cin);


    @Query("SELECT NEW Client(item.id,item.nom) FROM Client item")
    List<Client> findAllOptimized();
}
