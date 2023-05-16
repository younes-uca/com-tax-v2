package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.DeclarationTva;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface DeclarationTvaDao extends AbstractRepository<DeclarationTva,Long>  {

    List<DeclarationTva> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    List<DeclarationTva> findByTauxRetardTvaId(Long id);
    int deleteByTauxRetardTvaId(Long id);
    List<DeclarationTva> findByComptableTraitantId(Long id);
    int deleteByComptableTraitantId(Long id);
    List<DeclarationTva> findByComptableValidateurId(Long id);
    int deleteByComptableValidateurId(Long id);

}
