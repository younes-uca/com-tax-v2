package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.SousClassComptableHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SousClassComptableHistoryDao extends AbstractHistoryRepository<SousClassComptableHistory,Long> {

}
