package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.UniteMesure;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.UniteMesure;
import java.util.List;


@Repository
public interface UniteMesureDao extends AbstractRepository<UniteMesure,Long>  {
    UniteMesure findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW UniteMesure(item.id,item.libelle) FROM UniteMesure item")
    List<UniteMesure> findAllOptimized();
}
