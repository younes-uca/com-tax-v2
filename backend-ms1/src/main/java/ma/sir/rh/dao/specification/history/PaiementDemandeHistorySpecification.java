package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.PaiementDemandeHistoryCriteria;
import ma.sir.rh.bean.history.PaiementDemandeHistory;


public class PaiementDemandeHistorySpecification extends AbstractHistorySpecification<PaiementDemandeHistoryCriteria, PaiementDemandeHistory> {

    public PaiementDemandeHistorySpecification(PaiementDemandeHistoryCriteria criteria) {
        super(criteria);
    }

    public PaiementDemandeHistorySpecification(PaiementDemandeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
