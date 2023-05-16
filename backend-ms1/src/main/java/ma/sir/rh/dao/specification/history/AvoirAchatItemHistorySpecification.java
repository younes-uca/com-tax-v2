package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.AvoirAchatItemHistoryCriteria;
import ma.sir.rh.bean.history.AvoirAchatItemHistory;


public class AvoirAchatItemHistorySpecification extends AbstractHistorySpecification<AvoirAchatItemHistoryCriteria, AvoirAchatItemHistory> {

    public AvoirAchatItemHistorySpecification(AvoirAchatItemHistoryCriteria criteria) {
        super(criteria);
    }

    public AvoirAchatItemHistorySpecification(AvoirAchatItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
