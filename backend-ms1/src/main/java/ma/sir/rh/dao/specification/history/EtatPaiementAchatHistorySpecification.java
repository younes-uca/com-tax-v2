package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EtatPaiementAchatHistoryCriteria;
import ma.sir.rh.bean.history.EtatPaiementAchatHistory;


public class EtatPaiementAchatHistorySpecification extends AbstractHistorySpecification<EtatPaiementAchatHistoryCriteria, EtatPaiementAchatHistory> {

    public EtatPaiementAchatHistorySpecification(EtatPaiementAchatHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatPaiementAchatHistorySpecification(EtatPaiementAchatHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
