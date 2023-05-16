package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EtatAvoirAchatHistoryCriteria;
import ma.sir.rh.bean.history.EtatAvoirAchatHistory;


public class EtatAvoirAchatHistorySpecification extends AbstractHistorySpecification<EtatAvoirAchatHistoryCriteria, EtatAvoirAchatHistory> {

    public EtatAvoirAchatHistorySpecification(EtatAvoirAchatHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatAvoirAchatHistorySpecification(EtatAvoirAchatHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
