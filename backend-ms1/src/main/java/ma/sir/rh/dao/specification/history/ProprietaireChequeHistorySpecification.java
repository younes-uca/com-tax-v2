package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.ProprietaireChequeHistoryCriteria;
import ma.sir.rh.bean.history.ProprietaireChequeHistory;


public class ProprietaireChequeHistorySpecification extends AbstractHistorySpecification<ProprietaireChequeHistoryCriteria, ProprietaireChequeHistory> {

    public ProprietaireChequeHistorySpecification(ProprietaireChequeHistoryCriteria criteria) {
        super(criteria);
    }

    public ProprietaireChequeHistorySpecification(ProprietaireChequeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
