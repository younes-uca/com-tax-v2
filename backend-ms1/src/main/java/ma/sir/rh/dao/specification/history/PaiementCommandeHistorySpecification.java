package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.PaiementCommandeHistoryCriteria;
import ma.sir.rh.bean.history.PaiementCommandeHistory;


public class PaiementCommandeHistorySpecification extends AbstractHistorySpecification<PaiementCommandeHistoryCriteria, PaiementCommandeHistory> {

    public PaiementCommandeHistorySpecification(PaiementCommandeHistoryCriteria criteria) {
        super(criteria);
    }

    public PaiementCommandeHistorySpecification(PaiementCommandeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
