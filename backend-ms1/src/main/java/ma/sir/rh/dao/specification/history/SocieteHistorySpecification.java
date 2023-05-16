package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.SocieteHistoryCriteria;
import ma.sir.rh.bean.history.SocieteHistory;


public class SocieteHistorySpecification extends AbstractHistorySpecification<SocieteHistoryCriteria, SocieteHistory> {

    public SocieteHistorySpecification(SocieteHistoryCriteria criteria) {
        super(criteria);
    }

    public SocieteHistorySpecification(SocieteHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
