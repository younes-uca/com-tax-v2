package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.EtatDemandeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatDemandeHistoryDao extends AbstractHistoryRepository<EtatDemandeHistory,Long> {

}
