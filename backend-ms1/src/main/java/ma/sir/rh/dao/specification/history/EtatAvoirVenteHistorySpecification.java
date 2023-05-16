package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EtatAvoirVenteHistoryCriteria;
import ma.sir.rh.bean.history.EtatAvoirVenteHistory;


public class EtatAvoirVenteHistorySpecification extends AbstractHistorySpecification<EtatAvoirVenteHistoryCriteria, EtatAvoirVenteHistory> {

    public EtatAvoirVenteHistorySpecification(EtatAvoirVenteHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatAvoirVenteHistorySpecification(EtatAvoirVenteHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
