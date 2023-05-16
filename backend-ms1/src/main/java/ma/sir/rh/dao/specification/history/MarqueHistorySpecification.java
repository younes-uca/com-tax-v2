package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.MarqueHistoryCriteria;
import ma.sir.rh.bean.history.MarqueHistory;


public class MarqueHistorySpecification extends AbstractHistorySpecification<MarqueHistoryCriteria, MarqueHistory> {

    public MarqueHistorySpecification(MarqueHistoryCriteria criteria) {
        super(criteria);
    }

    public MarqueHistorySpecification(MarqueHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
