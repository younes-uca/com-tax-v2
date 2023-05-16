package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.EtatCommandeCriteria;
import ma.sir.rh.bean.core.EtatCommande;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EtatCommandeSpecification extends  AbstractSpecification<EtatCommandeCriteria, EtatCommande>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("style", criteria.getStyle(),criteria.getStyleLike());
    }

    public EtatCommandeSpecification(EtatCommandeCriteria criteria) {
        super(criteria);
    }

    public EtatCommandeSpecification(EtatCommandeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
