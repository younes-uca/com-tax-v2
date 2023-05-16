package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.PaiementVenteHistoryCriteria;
import ma.sir.rh.bean.history.PaiementVenteHistory;


public class PaiementVenteHistorySpecification extends AbstractHistorySpecification<PaiementVenteHistoryCriteria, PaiementVenteHistory> {

    public PaiementVenteHistorySpecification(PaiementVenteHistoryCriteria criteria) {
        super(criteria);
    }

    public PaiementVenteHistorySpecification(PaiementVenteHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
