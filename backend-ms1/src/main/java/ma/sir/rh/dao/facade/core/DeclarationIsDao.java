package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.DeclarationIs;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface DeclarationIsDao extends AbstractRepository<DeclarationIs,Long>  {

    List<DeclarationIs> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    List<DeclarationIs> findByTauxIsId(Long id);
    int deleteByTauxIsId(Long id);
    List<DeclarationIs> findByComptableTraitantId(Long id);
    int deleteByComptableTraitantId(Long id);
    List<DeclarationIs> findByComptableValidateurId(Long id);
    int deleteByComptableValidateurId(Long id);

}
