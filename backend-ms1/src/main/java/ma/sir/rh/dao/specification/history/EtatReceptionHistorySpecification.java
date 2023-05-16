package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EtatReceptionHistoryCriteria;
import ma.sir.rh.bean.history.EtatReceptionHistory;


public class EtatReceptionHistorySpecification extends AbstractHistorySpecification<EtatReceptionHistoryCriteria, EtatReceptionHistory> {

    public EtatReceptionHistorySpecification(EtatReceptionHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatReceptionHistorySpecification(EtatReceptionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
