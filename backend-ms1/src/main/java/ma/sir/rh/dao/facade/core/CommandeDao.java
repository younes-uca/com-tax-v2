package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Commande;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.Commande;
import java.util.List;


@Repository
public interface CommandeDao extends AbstractRepository<Commande,Long>  {
    Commande findByReference(String reference);
    int deleteByReference(String reference);

    List<Commande> findByClientId(Long id);
    int deleteByClientId(Long id);
    List<Commande> findByStoreId(Long id);
    int deleteByStoreId(Long id);
    List<Commande> findByEtatCommandeId(Long id);
    int deleteByEtatCommandeId(Long id);

    @Query("SELECT NEW Commande(item.id,item.reference) FROM Commande item")
    List<Commande> findAllOptimized();
}
