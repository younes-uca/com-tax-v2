package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EtatCommandeHistoryCriteria;
import ma.sir.rh.bean.history.EtatCommandeHistory;


public class EtatCommandeHistorySpecification extends AbstractHistorySpecification<EtatCommandeHistoryCriteria, EtatCommandeHistory> {

    public EtatCommandeHistorySpecification(EtatCommandeHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatCommandeHistorySpecification(EtatCommandeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
