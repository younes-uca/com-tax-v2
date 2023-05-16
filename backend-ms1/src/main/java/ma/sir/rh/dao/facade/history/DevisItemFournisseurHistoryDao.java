package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.DevisItemFournisseurHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisItemFournisseurHistoryDao extends AbstractHistoryRepository<DevisItemFournisseurHistory,Long> {

}
