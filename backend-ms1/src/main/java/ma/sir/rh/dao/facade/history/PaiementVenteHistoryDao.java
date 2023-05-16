package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.PaiementVenteHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementVenteHistoryDao extends AbstractHistoryRepository<PaiementVenteHistory,Long> {

}
