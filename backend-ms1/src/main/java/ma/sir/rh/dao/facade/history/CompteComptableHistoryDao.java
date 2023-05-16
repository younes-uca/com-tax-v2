package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.CompteComptableHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteComptableHistoryDao extends AbstractHistoryRepository<CompteComptableHistory,Long> {

}
