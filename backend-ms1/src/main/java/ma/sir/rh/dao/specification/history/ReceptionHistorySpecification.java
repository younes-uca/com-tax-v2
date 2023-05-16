package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.ReceptionHistoryCriteria;
import ma.sir.rh.bean.history.ReceptionHistory;


public class ReceptionHistorySpecification extends AbstractHistorySpecification<ReceptionHistoryCriteria, ReceptionHistory> {

    public ReceptionHistorySpecification(ReceptionHistoryCriteria criteria) {
        super(criteria);
    }

    public ReceptionHistorySpecification(ReceptionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
