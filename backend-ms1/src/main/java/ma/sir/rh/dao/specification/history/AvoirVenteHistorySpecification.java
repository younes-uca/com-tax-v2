package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.AvoirVenteHistoryCriteria;
import ma.sir.rh.bean.history.AvoirVenteHistory;


public class AvoirVenteHistorySpecification extends AbstractHistorySpecification<AvoirVenteHistoryCriteria, AvoirVenteHistory> {

    public AvoirVenteHistorySpecification(AvoirVenteHistoryCriteria criteria) {
        super(criteria);
    }

    public AvoirVenteHistorySpecification(AvoirVenteHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
