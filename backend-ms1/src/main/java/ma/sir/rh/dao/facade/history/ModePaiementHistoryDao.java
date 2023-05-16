package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.ModePaiementHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ModePaiementHistoryDao extends AbstractHistoryRepository<ModePaiementHistory,Long> {

}
