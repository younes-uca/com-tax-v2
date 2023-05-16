package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.ComptableValidateurCriteria;
import ma.sir.rh.bean.core.ComptableValidateur;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ComptableValidateurSpecification extends  AbstractSpecification<ComptableValidateurCriteria, ComptableValidateur>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
    }

    public ComptableValidateurSpecification(ComptableValidateurCriteria criteria) {
        super(criteria);
    }

    public ComptableValidateurSpecification(ComptableValidateurCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
