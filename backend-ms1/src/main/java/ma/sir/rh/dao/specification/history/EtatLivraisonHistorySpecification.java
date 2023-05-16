package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EtatLivraisonHistoryCriteria;
import ma.sir.rh.bean.history.EtatLivraisonHistory;


public class EtatLivraisonHistorySpecification extends AbstractHistorySpecification<EtatLivraisonHistoryCriteria, EtatLivraisonHistory> {

    public EtatLivraisonHistorySpecification(EtatLivraisonHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatLivraisonHistorySpecification(EtatLivraisonHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
