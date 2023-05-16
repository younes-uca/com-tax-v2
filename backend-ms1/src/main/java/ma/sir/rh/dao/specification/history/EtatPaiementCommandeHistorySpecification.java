package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EtatPaiementCommandeHistoryCriteria;
import ma.sir.rh.bean.history.EtatPaiementCommandeHistory;


public class EtatPaiementCommandeHistorySpecification extends AbstractHistorySpecification<EtatPaiementCommandeHistoryCriteria, EtatPaiementCommandeHistory> {

    public EtatPaiementCommandeHistorySpecification(EtatPaiementCommandeHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatPaiementCommandeHistorySpecification(EtatPaiementCommandeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
