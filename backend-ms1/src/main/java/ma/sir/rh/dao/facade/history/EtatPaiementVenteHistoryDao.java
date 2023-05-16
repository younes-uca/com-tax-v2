package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.EtatPaiementVenteHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatPaiementVenteHistoryDao extends AbstractHistoryRepository<EtatPaiementVenteHistory,Long> {

}
