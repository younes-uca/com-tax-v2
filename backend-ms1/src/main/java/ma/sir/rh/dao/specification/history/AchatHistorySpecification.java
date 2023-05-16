package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.AchatHistoryCriteria;
import ma.sir.rh.bean.history.AchatHistory;


public class AchatHistorySpecification extends AbstractHistorySpecification<AchatHistoryCriteria, AchatHistory> {

    public AchatHistorySpecification(AchatHistoryCriteria criteria) {
        super(criteria);
    }

    public AchatHistorySpecification(AchatHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
