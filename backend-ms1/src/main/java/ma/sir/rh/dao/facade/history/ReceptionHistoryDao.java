package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.ReceptionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptionHistoryDao extends AbstractHistoryRepository<ReceptionHistory,Long> {

}
