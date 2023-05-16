package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.FournisseurHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurHistoryDao extends AbstractHistoryRepository<FournisseurHistory,Long> {

}
