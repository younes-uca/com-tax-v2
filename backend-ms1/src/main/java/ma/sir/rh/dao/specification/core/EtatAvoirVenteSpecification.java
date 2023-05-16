package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.EtatAvoirVenteCriteria;
import ma.sir.rh.bean.core.EtatAvoirVente;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EtatAvoirVenteSpecification extends  AbstractSpecification<EtatAvoirVenteCriteria, EtatAvoirVente>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("style", criteria.getStyle(),criteria.getStyleLike());
    }

    public EtatAvoirVenteSpecification(EtatAvoirVenteCriteria criteria) {
        super(criteria);
    }

    public EtatAvoirVenteSpecification(EtatAvoirVenteCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
