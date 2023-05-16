package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.ProduitHistoryCriteria;
import ma.sir.rh.bean.history.ProduitHistory;


public class ProduitHistorySpecification extends AbstractHistorySpecification<ProduitHistoryCriteria, ProduitHistory> {

    public ProduitHistorySpecification(ProduitHistoryCriteria criteria) {
        super(criteria);
    }

    public ProduitHistorySpecification(ProduitHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
