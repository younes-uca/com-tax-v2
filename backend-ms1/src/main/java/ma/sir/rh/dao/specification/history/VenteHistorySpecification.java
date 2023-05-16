package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.VenteHistoryCriteria;
import ma.sir.rh.bean.history.VenteHistory;


public class VenteHistorySpecification extends AbstractHistorySpecification<VenteHistoryCriteria, VenteHistory> {

    public VenteHistorySpecification(VenteHistoryCriteria criteria) {
        super(criteria);
    }

    public VenteHistorySpecification(VenteHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
