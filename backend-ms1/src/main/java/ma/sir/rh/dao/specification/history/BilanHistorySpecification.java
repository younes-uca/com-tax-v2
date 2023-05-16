package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.BilanHistoryCriteria;
import ma.sir.rh.bean.history.BilanHistory;


public class BilanHistorySpecification extends AbstractHistorySpecification<BilanHistoryCriteria, BilanHistory> {

    public BilanHistorySpecification(BilanHistoryCriteria criteria) {
        super(criteria);
    }

    public BilanHistorySpecification(BilanHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
