package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.EtatPaiementVente;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.EtatPaiementVente;
import java.util.List;


@Repository
public interface EtatPaiementVenteDao extends AbstractRepository<EtatPaiementVente,Long>  {
    EtatPaiementVente findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW EtatPaiementVente(item.id,item.libelle) FROM EtatPaiementVente item")
    List<EtatPaiementVente> findAllOptimized();
}
