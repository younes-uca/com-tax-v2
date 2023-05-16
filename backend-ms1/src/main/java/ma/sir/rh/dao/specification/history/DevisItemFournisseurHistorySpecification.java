package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.DevisItemFournisseurHistoryCriteria;
import ma.sir.rh.bean.history.DevisItemFournisseurHistory;


public class DevisItemFournisseurHistorySpecification extends AbstractHistorySpecification<DevisItemFournisseurHistoryCriteria, DevisItemFournisseurHistory> {

    public DevisItemFournisseurHistorySpecification(DevisItemFournisseurHistoryCriteria criteria) {
        super(criteria);
    }

    public DevisItemFournisseurHistorySpecification(DevisItemFournisseurHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
