package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.TauxRetardTvaHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxRetardTvaHistoryDao extends AbstractHistoryRepository<TauxRetardTvaHistory,Long> {

}
