package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.EtatPaiementLivraisonHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatPaiementLivraisonHistoryDao extends AbstractHistoryRepository<EtatPaiementLivraisonHistory,Long> {

}
