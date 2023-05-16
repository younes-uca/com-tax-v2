package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.ModePaiementHistoryCriteria;
import ma.sir.rh.bean.history.ModePaiementHistory;


public class ModePaiementHistorySpecification extends AbstractHistorySpecification<ModePaiementHistoryCriteria, ModePaiementHistory> {

    public ModePaiementHistorySpecification(ModePaiementHistoryCriteria criteria) {
        super(criteria);
    }

    public ModePaiementHistorySpecification(ModePaiementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
