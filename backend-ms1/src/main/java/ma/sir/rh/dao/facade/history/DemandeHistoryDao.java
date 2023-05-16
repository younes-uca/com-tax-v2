package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.DemandeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeHistoryDao extends AbstractHistoryRepository<DemandeHistory,Long> {

}
