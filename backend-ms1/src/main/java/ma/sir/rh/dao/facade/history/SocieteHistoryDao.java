package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.SocieteHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SocieteHistoryDao extends AbstractHistoryRepository<SocieteHistory,Long> {

}
