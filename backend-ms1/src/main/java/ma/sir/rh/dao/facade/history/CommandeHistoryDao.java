package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.CommandeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeHistoryDao extends AbstractHistoryRepository<CommandeHistory,Long> {

}
