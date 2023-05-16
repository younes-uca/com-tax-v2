package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.DemandeItemHistoryCriteria;
import ma.sir.rh.bean.history.DemandeItemHistory;


public class DemandeItemHistorySpecification extends AbstractHistorySpecification<DemandeItemHistoryCriteria, DemandeItemHistory> {

    public DemandeItemHistorySpecification(DemandeItemHistoryCriteria criteria) {
        super(criteria);
    }

    public DemandeItemHistorySpecification(DemandeItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
