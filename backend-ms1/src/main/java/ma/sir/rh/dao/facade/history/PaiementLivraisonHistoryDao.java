package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.PaiementLivraisonHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementLivraisonHistoryDao extends AbstractHistoryRepository<PaiementLivraisonHistory,Long> {

}
