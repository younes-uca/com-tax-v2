package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.CompteComptableHistoryCriteria;
import ma.sir.rh.bean.history.CompteComptableHistory;


public class CompteComptableHistorySpecification extends AbstractHistorySpecification<CompteComptableHistoryCriteria, CompteComptableHistory> {

    public CompteComptableHistorySpecification(CompteComptableHistoryCriteria criteria) {
        super(criteria);
    }

    public CompteComptableHistorySpecification(CompteComptableHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
