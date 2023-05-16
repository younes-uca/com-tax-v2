package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.ComptableValidateurHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ComptableValidateurHistoryDao extends AbstractHistoryRepository<ComptableValidateurHistory,Long> {

}
