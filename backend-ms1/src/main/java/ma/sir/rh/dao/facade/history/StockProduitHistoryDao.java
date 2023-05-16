package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.StockProduitHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StockProduitHistoryDao extends AbstractHistoryRepository<StockProduitHistory,Long> {

}
