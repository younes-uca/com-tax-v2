package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.EtatPaiementCommandeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatPaiementCommandeHistoryDao extends AbstractHistoryRepository<EtatPaiementCommandeHistory,Long> {

}
