package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.AvoirVenteItemHistoryCriteria;
import ma.sir.rh.bean.history.AvoirVenteItemHistory;


public class AvoirVenteItemHistorySpecification extends AbstractHistorySpecification<AvoirVenteItemHistoryCriteria, AvoirVenteItemHistory> {

    public AvoirVenteItemHistorySpecification(AvoirVenteItemHistoryCriteria criteria) {
        super(criteria);
    }

    public AvoirVenteItemHistorySpecification(AvoirVenteItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
