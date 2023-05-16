package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.ReceptionItemHistoryCriteria;
import ma.sir.rh.bean.history.ReceptionItemHistory;


public class ReceptionItemHistorySpecification extends AbstractHistorySpecification<ReceptionItemHistoryCriteria, ReceptionItemHistory> {

    public ReceptionItemHistorySpecification(ReceptionItemHistoryCriteria criteria) {
        super(criteria);
    }

    public ReceptionItemHistorySpecification(ReceptionItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
