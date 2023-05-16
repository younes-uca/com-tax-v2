package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.ProduitHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitHistoryDao extends AbstractHistoryRepository<ProduitHistory,Long> {

}
