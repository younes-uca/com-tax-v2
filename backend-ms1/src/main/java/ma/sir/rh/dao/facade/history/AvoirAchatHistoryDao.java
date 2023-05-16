package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.AvoirAchatHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AvoirAchatHistoryDao extends AbstractHistoryRepository<AvoirAchatHistory,Long> {

}
