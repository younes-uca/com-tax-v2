package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.OperationComptableHistoryCriteria;
import ma.sir.rh.bean.history.OperationComptableHistory;


public class OperationComptableHistorySpecification extends AbstractHistorySpecification<OperationComptableHistoryCriteria, OperationComptableHistory> {

    public OperationComptableHistorySpecification(OperationComptableHistoryCriteria criteria) {
        super(criteria);
    }

    public OperationComptableHistorySpecification(OperationComptableHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
