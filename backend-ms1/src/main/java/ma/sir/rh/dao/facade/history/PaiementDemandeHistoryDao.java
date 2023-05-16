package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.PaiementDemandeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementDemandeHistoryDao extends AbstractHistoryRepository<PaiementDemandeHistory,Long> {

}
