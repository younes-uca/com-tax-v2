package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.BanqueHistoryCriteria;
import ma.sir.rh.bean.history.BanqueHistory;


public class BanqueHistorySpecification extends AbstractHistorySpecification<BanqueHistoryCriteria, BanqueHistory> {

    public BanqueHistorySpecification(BanqueHistoryCriteria criteria) {
        super(criteria);
    }

    public BanqueHistorySpecification(BanqueHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
