package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.EtatPaiementCommande;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.EtatPaiementCommande;
import java.util.List;


@Repository
public interface EtatPaiementCommandeDao extends AbstractRepository<EtatPaiementCommande,Long>  {
    EtatPaiementCommande findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW EtatPaiementCommande(item.id,item.libelle) FROM EtatPaiementCommande item")
    List<EtatPaiementCommande> findAllOptimized();
}
