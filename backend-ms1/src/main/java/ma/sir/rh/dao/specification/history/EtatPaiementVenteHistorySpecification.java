package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EtatPaiementVenteHistoryCriteria;
import ma.sir.rh.bean.history.EtatPaiementVenteHistory;


public class EtatPaiementVenteHistorySpecification extends AbstractHistorySpecification<EtatPaiementVenteHistoryCriteria, EtatPaiementVenteHistory> {

    public EtatPaiementVenteHistorySpecification(EtatPaiementVenteHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatPaiementVenteHistorySpecification(EtatPaiementVenteHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
