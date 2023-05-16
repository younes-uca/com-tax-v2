package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.ProprietaireChequeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietaireChequeHistoryDao extends AbstractHistoryRepository<ProprietaireChequeHistory,Long> {

}
