package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.TauxIsHistoryCriteria;
import ma.sir.rh.bean.history.TauxIsHistory;


public class TauxIsHistorySpecification extends AbstractHistorySpecification<TauxIsHistoryCriteria, TauxIsHistory> {

    public TauxIsHistorySpecification(TauxIsHistoryCriteria criteria) {
        super(criteria);
    }

    public TauxIsHistorySpecification(TauxIsHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
