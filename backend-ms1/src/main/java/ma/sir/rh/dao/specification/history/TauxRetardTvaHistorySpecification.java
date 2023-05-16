package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.TauxRetardTvaHistoryCriteria;
import ma.sir.rh.bean.history.TauxRetardTvaHistory;


public class TauxRetardTvaHistorySpecification extends AbstractHistorySpecification<TauxRetardTvaHistoryCriteria, TauxRetardTvaHistory> {

    public TauxRetardTvaHistorySpecification(TauxRetardTvaHistoryCriteria criteria) {
        super(criteria);
    }

    public TauxRetardTvaHistorySpecification(TauxRetardTvaHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
