package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.ClassComptableHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassComptableHistoryDao extends AbstractHistoryRepository<ClassComptableHistory,Long> {

}
