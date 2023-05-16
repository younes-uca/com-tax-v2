package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.StoreHistoryCriteria;
import ma.sir.rh.bean.history.StoreHistory;


public class StoreHistorySpecification extends AbstractHistorySpecification<StoreHistoryCriteria, StoreHistory> {

    public StoreHistorySpecification(StoreHistoryCriteria criteria) {
        super(criteria);
    }

    public StoreHistorySpecification(StoreHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
