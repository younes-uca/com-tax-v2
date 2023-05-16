package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.EtatVenteHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatVenteHistoryDao extends AbstractHistoryRepository<EtatVenteHistory,Long> {

}
