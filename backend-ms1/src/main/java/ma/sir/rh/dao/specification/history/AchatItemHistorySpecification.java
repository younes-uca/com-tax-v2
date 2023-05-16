package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.AchatItemHistoryCriteria;
import ma.sir.rh.bean.history.AchatItemHistory;


public class AchatItemHistorySpecification extends AbstractHistorySpecification<AchatItemHistoryCriteria, AchatItemHistory> {

    public AchatItemHistorySpecification(AchatItemHistoryCriteria criteria) {
        super(criteria);
    }

    public AchatItemHistorySpecification(AchatItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
