package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.OperationComptable;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface OperationComptableDao extends AbstractRepository<OperationComptable,Long>  {

    List<OperationComptable> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    List<OperationComptable> findByCompteComptableId(Long id);
    int deleteByCompteComptableId(Long id);

}
