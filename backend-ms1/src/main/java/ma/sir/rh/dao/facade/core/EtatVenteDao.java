package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.EtatVente;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.EtatVente;
import java.util.List;


@Repository
public interface EtatVenteDao extends AbstractRepository<EtatVente,Long>  {
    EtatVente findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW EtatVente(item.id,item.libelle) FROM EtatVente item")
    List<EtatVente> findAllOptimized();
}
