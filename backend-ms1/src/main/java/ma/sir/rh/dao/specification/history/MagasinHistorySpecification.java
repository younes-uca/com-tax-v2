package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.MagasinHistoryCriteria;
import ma.sir.rh.bean.history.MagasinHistory;


public class MagasinHistorySpecification extends AbstractHistorySpecification<MagasinHistoryCriteria, MagasinHistory> {

    public MagasinHistorySpecification(MagasinHistoryCriteria criteria) {
        super(criteria);
    }

    public MagasinHistorySpecification(MagasinHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
