package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.ComptableValidateurHistoryCriteria;
import ma.sir.rh.bean.history.ComptableValidateurHistory;


public class ComptableValidateurHistorySpecification extends AbstractHistorySpecification<ComptableValidateurHistoryCriteria, ComptableValidateurHistory> {

    public ComptableValidateurHistorySpecification(ComptableValidateurHistoryCriteria criteria) {
        super(criteria);
    }

    public ComptableValidateurHistorySpecification(ComptableValidateurHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
