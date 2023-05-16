package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.PaiementAchatHistoryCriteria;
import ma.sir.rh.bean.history.PaiementAchatHistory;


public class PaiementAchatHistorySpecification extends AbstractHistorySpecification<PaiementAchatHistoryCriteria, PaiementAchatHistory> {

    public PaiementAchatHistorySpecification(PaiementAchatHistoryCriteria criteria) {
        super(criteria);
    }

    public PaiementAchatHistorySpecification(PaiementAchatHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
