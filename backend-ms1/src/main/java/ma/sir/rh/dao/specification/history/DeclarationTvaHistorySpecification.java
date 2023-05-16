package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.DeclarationTvaHistoryCriteria;
import ma.sir.rh.bean.history.DeclarationTvaHistory;


public class DeclarationTvaHistorySpecification extends AbstractHistorySpecification<DeclarationTvaHistoryCriteria, DeclarationTvaHistory> {

    public DeclarationTvaHistorySpecification(DeclarationTvaHistoryCriteria criteria) {
        super(criteria);
    }

    public DeclarationTvaHistorySpecification(DeclarationTvaHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
