package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EtatPaiementLivraisonHistoryCriteria;
import ma.sir.rh.bean.history.EtatPaiementLivraisonHistory;


public class EtatPaiementLivraisonHistorySpecification extends AbstractHistorySpecification<EtatPaiementLivraisonHistoryCriteria, EtatPaiementLivraisonHistory> {

    public EtatPaiementLivraisonHistorySpecification(EtatPaiementLivraisonHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatPaiementLivraisonHistorySpecification(EtatPaiementLivraisonHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
