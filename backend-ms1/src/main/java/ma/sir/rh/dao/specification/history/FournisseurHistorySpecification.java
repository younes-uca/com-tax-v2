package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.FournisseurHistoryCriteria;
import ma.sir.rh.bean.history.FournisseurHistory;


public class FournisseurHistorySpecification extends AbstractHistorySpecification<FournisseurHistoryCriteria, FournisseurHistory> {

    public FournisseurHistorySpecification(FournisseurHistoryCriteria criteria) {
        super(criteria);
    }

    public FournisseurHistorySpecification(FournisseurHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
