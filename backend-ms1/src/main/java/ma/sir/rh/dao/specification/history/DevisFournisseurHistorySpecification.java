package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.DevisFournisseurHistoryCriteria;
import ma.sir.rh.bean.history.DevisFournisseurHistory;


public class DevisFournisseurHistorySpecification extends AbstractHistorySpecification<DevisFournisseurHistoryCriteria, DevisFournisseurHistory> {

    public DevisFournisseurHistorySpecification(DevisFournisseurHistoryCriteria criteria) {
        super(criteria);
    }

    public DevisFournisseurHistorySpecification(DevisFournisseurHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
