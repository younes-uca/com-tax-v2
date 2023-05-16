package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.ClassComptableHistoryCriteria;
import ma.sir.rh.bean.history.ClassComptableHistory;


public class ClassComptableHistorySpecification extends AbstractHistorySpecification<ClassComptableHistoryCriteria, ClassComptableHistory> {

    public ClassComptableHistorySpecification(ClassComptableHistoryCriteria criteria) {
        super(criteria);
    }

    public ClassComptableHistorySpecification(ClassComptableHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
