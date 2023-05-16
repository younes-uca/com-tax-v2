package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EtatDemandeHistoryCriteria;
import ma.sir.rh.bean.history.EtatDemandeHistory;


public class EtatDemandeHistorySpecification extends AbstractHistorySpecification<EtatDemandeHistoryCriteria, EtatDemandeHistory> {

    public EtatDemandeHistorySpecification(EtatDemandeHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatDemandeHistorySpecification(EtatDemandeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
