package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.EtatPaiementAchatCriteria;
import ma.sir.rh.bean.core.EtatPaiementAchat;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EtatPaiementAchatSpecification extends  AbstractSpecification<EtatPaiementAchatCriteria, EtatPaiementAchat>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("style", criteria.getStyle(),criteria.getStyleLike());
    }

    public EtatPaiementAchatSpecification(EtatPaiementAchatCriteria criteria) {
        super(criteria);
    }

    public EtatPaiementAchatSpecification(EtatPaiementAchatCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
