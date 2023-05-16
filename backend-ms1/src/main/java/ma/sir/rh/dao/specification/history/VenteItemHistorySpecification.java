package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.VenteItemHistoryCriteria;
import ma.sir.rh.bean.history.VenteItemHistory;


public class VenteItemHistorySpecification extends AbstractHistorySpecification<VenteItemHistoryCriteria, VenteItemHistory> {

    public VenteItemHistorySpecification(VenteItemHistoryCriteria criteria) {
        super(criteria);
    }

    public VenteItemHistorySpecification(VenteItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
