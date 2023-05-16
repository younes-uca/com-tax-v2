package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.LivraisonItemHistoryCriteria;
import ma.sir.rh.bean.history.LivraisonItemHistory;


public class LivraisonItemHistorySpecification extends AbstractHistorySpecification<LivraisonItemHistoryCriteria, LivraisonItemHistory> {

    public LivraisonItemHistorySpecification(LivraisonItemHistoryCriteria criteria) {
        super(criteria);
    }

    public LivraisonItemHistorySpecification(LivraisonItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
