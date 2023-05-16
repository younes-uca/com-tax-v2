package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EtatAchatHistoryCriteria;
import ma.sir.rh.bean.history.EtatAchatHistory;


public class EtatAchatHistorySpecification extends AbstractHistorySpecification<EtatAchatHistoryCriteria, EtatAchatHistory> {

    public EtatAchatHistorySpecification(EtatAchatHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatAchatHistorySpecification(EtatAchatHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
