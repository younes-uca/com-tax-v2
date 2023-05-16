package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.ComptableTraitantHistoryCriteria;
import ma.sir.rh.bean.history.ComptableTraitantHistory;


public class ComptableTraitantHistorySpecification extends AbstractHistorySpecification<ComptableTraitantHistoryCriteria, ComptableTraitantHistory> {

    public ComptableTraitantHistorySpecification(ComptableTraitantHistoryCriteria criteria) {
        super(criteria);
    }

    public ComptableTraitantHistorySpecification(ComptableTraitantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
