package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.PaiementCommande;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.PaiementCommande;
import java.util.List;


@Repository
public interface PaiementCommandeDao extends AbstractRepository<PaiementCommande,Long>  {
    PaiementCommande findByReference(String reference);
    int deleteByReference(String reference);

    List<PaiementCommande> findByCommandeId(Long id);
    int deleteByCommandeId(Long id);
    List<PaiementCommande> findByModePaiementId(Long id);
    int deleteByModePaiementId(Long id);
    List<PaiementCommande> findByEtatPaiementCommandeId(Long id);
    int deleteByEtatPaiementCommandeId(Long id);

    @Query("SELECT NEW PaiementCommande(item.id,item.reference) FROM PaiementCommande item")
    List<PaiementCommande> findAllOptimized();
}
