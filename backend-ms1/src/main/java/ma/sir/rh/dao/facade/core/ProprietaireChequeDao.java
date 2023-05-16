package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.ProprietaireCheque;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ProprietaireChequeDao extends AbstractRepository<ProprietaireCheque,Long>  {


    @Query("SELECT NEW ProprietaireCheque(item.id,item.nom) FROM ProprietaireCheque item")
    List<ProprietaireCheque> findAllOptimized();
}
