package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.VenteHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface VenteHistoryDao extends AbstractHistoryRepository<VenteHistory,Long> {

}
