package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.EtatCommandeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatCommandeHistoryDao extends AbstractHistoryRepository<EtatCommandeHistory,Long> {

}
