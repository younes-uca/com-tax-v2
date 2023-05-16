package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.StockProduitHistoryCriteria;
import ma.sir.rh.bean.history.StockProduitHistory;


public class StockProduitHistorySpecification extends AbstractHistorySpecification<StockProduitHistoryCriteria, StockProduitHistory> {

    public StockProduitHistorySpecification(StockProduitHistoryCriteria criteria) {
        super(criteria);
    }

    public StockProduitHistorySpecification(StockProduitHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
