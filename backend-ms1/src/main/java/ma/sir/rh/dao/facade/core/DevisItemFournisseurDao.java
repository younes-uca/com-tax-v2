package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.DevisItemFournisseur;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface DevisItemFournisseurDao extends AbstractRepository<DevisItemFournisseur,Long>  {

    List<DevisItemFournisseur> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    List<DevisItemFournisseur> findByDevisFournisseurId(Long id);
    int deleteByDevisFournisseurId(Long id);

}
