package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.ProprietaireChequeBanqueHistoryCriteria;
import ma.sir.rh.bean.history.ProprietaireChequeBanqueHistory;


public class ProprietaireChequeBanqueHistorySpecification extends AbstractHistorySpecification<ProprietaireChequeBanqueHistoryCriteria, ProprietaireChequeBanqueHistory> {

    public ProprietaireChequeBanqueHistorySpecification(ProprietaireChequeBanqueHistoryCriteria criteria) {
        super(criteria);
    }

    public ProprietaireChequeBanqueHistorySpecification(ProprietaireChequeBanqueHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
