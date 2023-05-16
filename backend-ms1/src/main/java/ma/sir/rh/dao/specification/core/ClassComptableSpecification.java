package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.ClassComptableCriteria;
import ma.sir.rh.bean.core.ClassComptable;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ClassComptableSpecification extends  AbstractSpecification<ClassComptableCriteria, ClassComptable>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public ClassComptableSpecification(ClassComptableCriteria criteria) {
        super(criteria);
    }

    public ClassComptableSpecification(ClassComptableCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
