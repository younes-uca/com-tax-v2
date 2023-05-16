package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.FournisseurCriteria;
import ma.sir.rh.bean.core.Fournisseur;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FournisseurSpecification extends  AbstractSpecification<FournisseurCriteria, Fournisseur>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ice", criteria.getIce(),criteria.getIceLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("tel", criteria.getTel(),criteria.getTelLike());
        addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
        addPredicate("adresse", criteria.getAdresse(),criteria.getAdresseLike());
        addPredicateBigDecimal("creance", criteria.getCreance(), criteria.getCreanceMin(), criteria.getCreanceMax());
    }

    public FournisseurSpecification(FournisseurCriteria criteria) {
        super(criteria);
    }

    public FournisseurSpecification(FournisseurCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
