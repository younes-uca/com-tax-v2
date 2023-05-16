package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.EtatAvoirAchatCriteria;
import ma.sir.rh.bean.core.EtatAvoirAchat;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EtatAvoirAchatSpecification extends  AbstractSpecification<EtatAvoirAchatCriteria, EtatAvoirAchat>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("style", criteria.getStyle(),criteria.getStyleLike());
    }

    public EtatAvoirAchatSpecification(EtatAvoirAchatCriteria criteria) {
        super(criteria);
    }

    public EtatAvoirAchatSpecification(EtatAvoirAchatCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
