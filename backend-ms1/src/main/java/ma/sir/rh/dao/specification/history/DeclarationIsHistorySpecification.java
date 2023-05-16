package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.DeclarationIsHistoryCriteria;
import ma.sir.rh.bean.history.DeclarationIsHistory;


public class DeclarationIsHistorySpecification extends AbstractHistorySpecification<DeclarationIsHistoryCriteria, DeclarationIsHistory> {

    public DeclarationIsHistorySpecification(DeclarationIsHistoryCriteria criteria) {
        super(criteria);
    }

    public DeclarationIsHistorySpecification(DeclarationIsHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
