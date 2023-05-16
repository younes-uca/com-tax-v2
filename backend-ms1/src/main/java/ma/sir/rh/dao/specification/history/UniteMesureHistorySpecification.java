package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.UniteMesureHistoryCriteria;
import ma.sir.rh.bean.history.UniteMesureHistory;


public class UniteMesureHistorySpecification extends AbstractHistorySpecification<UniteMesureHistoryCriteria, UniteMesureHistory> {

    public UniteMesureHistorySpecification(UniteMesureHistoryCriteria criteria) {
        super(criteria);
    }

    public UniteMesureHistorySpecification(UniteMesureHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
