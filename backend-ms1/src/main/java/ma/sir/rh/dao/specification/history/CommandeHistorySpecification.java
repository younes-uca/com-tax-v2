package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.CommandeHistoryCriteria;
import ma.sir.rh.bean.history.CommandeHistory;


public class CommandeHistorySpecification extends AbstractHistorySpecification<CommandeHistoryCriteria, CommandeHistory> {

    public CommandeHistorySpecification(CommandeHistoryCriteria criteria) {
        super(criteria);
    }

    public CommandeHistorySpecification(CommandeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
