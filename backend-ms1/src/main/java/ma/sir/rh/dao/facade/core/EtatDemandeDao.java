package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.EtatDemande;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.EtatDemande;
import java.util.List;


@Repository
public interface EtatDemandeDao extends AbstractRepository<EtatDemande,Long>  {
    EtatDemande findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW EtatDemande(item.id,item.libelle) FROM EtatDemande item")
    List<EtatDemande> findAllOptimized();
}
