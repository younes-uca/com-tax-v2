package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.DeclarationTvaHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DeclarationTvaHistoryDao extends AbstractHistoryRepository<DeclarationTvaHistory,Long> {

}
