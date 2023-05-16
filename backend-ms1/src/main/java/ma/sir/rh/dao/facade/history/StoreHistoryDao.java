package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.StoreHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreHistoryDao extends AbstractHistoryRepository<StoreHistory,Long> {

}
