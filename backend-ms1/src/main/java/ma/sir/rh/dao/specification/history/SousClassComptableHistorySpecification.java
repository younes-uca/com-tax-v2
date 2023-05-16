package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.SousClassComptableHistoryCriteria;
import ma.sir.rh.bean.history.SousClassComptableHistory;


public class SousClassComptableHistorySpecification extends AbstractHistorySpecification<SousClassComptableHistoryCriteria, SousClassComptableHistory> {

    public SousClassComptableHistorySpecification(SousClassComptableHistoryCriteria criteria) {
        super(criteria);
    }

    public SousClassComptableHistorySpecification(SousClassComptableHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
