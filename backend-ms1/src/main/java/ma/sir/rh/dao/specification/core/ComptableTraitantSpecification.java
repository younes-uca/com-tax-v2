package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.ComptableTraitantCriteria;
import ma.sir.rh.bean.core.ComptableTraitant;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ComptableTraitantSpecification extends  AbstractSpecification<ComptableTraitantCriteria, ComptableTraitant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
    }

    public ComptableTraitantSpecification(ComptableTraitantCriteria criteria) {
        super(criteria);
    }

    public ComptableTraitantSpecification(ComptableTraitantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
