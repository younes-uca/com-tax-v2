package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.VenteItemHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface VenteItemHistoryDao extends AbstractHistoryRepository<VenteItemHistory,Long> {

}
