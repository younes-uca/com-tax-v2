package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.EtatAvoirVente;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.EtatAvoirVente;
import java.util.List;


@Repository
public interface EtatAvoirVenteDao extends AbstractRepository<EtatAvoirVente,Long>  {
    EtatAvoirVente findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW EtatAvoirVente(item.id,item.libelle) FROM EtatAvoirVente item")
    List<EtatAvoirVente> findAllOptimized();
}
