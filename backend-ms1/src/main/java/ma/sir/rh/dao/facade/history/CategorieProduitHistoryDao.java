package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.CategorieProduitHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieProduitHistoryDao extends AbstractHistoryRepository<CategorieProduitHistory,Long> {

}
