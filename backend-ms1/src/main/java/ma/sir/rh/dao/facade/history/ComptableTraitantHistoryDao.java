package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.ComptableTraitantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ComptableTraitantHistoryDao extends AbstractHistoryRepository<ComptableTraitantHistory,Long> {

}
