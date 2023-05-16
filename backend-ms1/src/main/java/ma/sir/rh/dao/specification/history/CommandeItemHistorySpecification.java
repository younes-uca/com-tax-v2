package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.CommandeItemHistoryCriteria;
import ma.sir.rh.bean.history.CommandeItemHistory;


public class CommandeItemHistorySpecification extends AbstractHistorySpecification<CommandeItemHistoryCriteria, CommandeItemHistory> {

    public CommandeItemHistorySpecification(CommandeItemHistoryCriteria criteria) {
        super(criteria);
    }

    public CommandeItemHistorySpecification(CommandeItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
