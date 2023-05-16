package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.LivraisonHistoryCriteria;
import ma.sir.rh.bean.history.LivraisonHistory;


public class LivraisonHistorySpecification extends AbstractHistorySpecification<LivraisonHistoryCriteria, LivraisonHistory> {

    public LivraisonHistorySpecification(LivraisonHistoryCriteria criteria) {
        super(criteria);
    }

    public LivraisonHistorySpecification(LivraisonHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
