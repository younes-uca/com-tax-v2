package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.AvoirAchatHistoryCriteria;
import ma.sir.rh.bean.history.AvoirAchatHistory;


public class AvoirAchatHistorySpecification extends AbstractHistorySpecification<AvoirAchatHistoryCriteria, AvoirAchatHistory> {

    public AvoirAchatHistorySpecification(AvoirAchatHistoryCriteria criteria) {
        super(criteria);
    }

    public AvoirAchatHistorySpecification(AvoirAchatHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
