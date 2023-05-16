package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.DemandeHistoryCriteria;
import ma.sir.rh.bean.history.DemandeHistory;


public class DemandeHistorySpecification extends AbstractHistorySpecification<DemandeHistoryCriteria, DemandeHistory> {

    public DemandeHistorySpecification(DemandeHistoryCriteria criteria) {
        super(criteria);
    }

    public DemandeHistorySpecification(DemandeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
