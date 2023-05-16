package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.PaiementLivraisonHistoryCriteria;
import ma.sir.rh.bean.history.PaiementLivraisonHistory;


public class PaiementLivraisonHistorySpecification extends AbstractHistorySpecification<PaiementLivraisonHistoryCriteria, PaiementLivraisonHistory> {

    public PaiementLivraisonHistorySpecification(PaiementLivraisonHistoryCriteria criteria) {
        super(criteria);
    }

    public PaiementLivraisonHistorySpecification(PaiementLivraisonHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
