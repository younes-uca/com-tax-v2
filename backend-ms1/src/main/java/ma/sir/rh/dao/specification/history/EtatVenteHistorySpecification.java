package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EtatVenteHistoryCriteria;
import ma.sir.rh.bean.history.EtatVenteHistory;


public class EtatVenteHistorySpecification extends AbstractHistorySpecification<EtatVenteHistoryCriteria, EtatVenteHistory> {

    public EtatVenteHistorySpecification(EtatVenteHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatVenteHistorySpecification(EtatVenteHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
