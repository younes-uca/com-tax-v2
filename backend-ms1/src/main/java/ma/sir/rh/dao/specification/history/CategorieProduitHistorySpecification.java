package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.CategorieProduitHistoryCriteria;
import ma.sir.rh.bean.history.CategorieProduitHistory;


public class CategorieProduitHistorySpecification extends AbstractHistorySpecification<CategorieProduitHistoryCriteria, CategorieProduitHistory> {

    public CategorieProduitHistorySpecification(CategorieProduitHistoryCriteria criteria) {
        super(criteria);
    }

    public CategorieProduitHistorySpecification(CategorieProduitHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
