package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.ComptableTraitant;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ComptableTraitantDao extends AbstractRepository<ComptableTraitant,Long>  {


}
