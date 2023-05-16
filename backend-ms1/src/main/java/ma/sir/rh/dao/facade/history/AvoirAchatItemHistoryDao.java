package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.AvoirAchatItemHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AvoirAchatItemHistoryDao extends AbstractHistoryRepository<AvoirAchatItemHistory,Long> {

}
