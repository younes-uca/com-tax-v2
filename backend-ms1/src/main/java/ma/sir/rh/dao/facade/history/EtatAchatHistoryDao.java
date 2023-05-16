package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.EtatAchatHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatAchatHistoryDao extends AbstractHistoryRepository<EtatAchatHistory,Long> {

}
