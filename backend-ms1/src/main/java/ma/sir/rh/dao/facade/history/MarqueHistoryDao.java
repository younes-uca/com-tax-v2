package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.MarqueHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface MarqueHistoryDao extends AbstractHistoryRepository<MarqueHistory,Long> {

}
