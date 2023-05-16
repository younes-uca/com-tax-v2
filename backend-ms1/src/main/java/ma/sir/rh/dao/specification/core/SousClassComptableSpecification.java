package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.SousClassComptableCriteria;
import ma.sir.rh.bean.core.SousClassComptable;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SousClassComptableSpecification extends  AbstractSpecification<SousClassComptableCriteria, SousClassComptable>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateFk("classComptable","id", criteria.getClassComptable()==null?null:criteria.getClassComptable().getId());
        addPredicateFk("classComptable","id", criteria.getClassComptables());
    }

    public SousClassComptableSpecification(SousClassComptableCriteria criteria) {
        super(criteria);
    }

    public SousClassComptableSpecification(SousClassComptableCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
