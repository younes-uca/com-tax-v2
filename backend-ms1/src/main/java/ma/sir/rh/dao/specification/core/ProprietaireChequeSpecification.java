package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.ProprietaireChequeCriteria;
import ma.sir.rh.bean.core.ProprietaireCheque;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ProprietaireChequeSpecification extends  AbstractSpecification<ProprietaireChequeCriteria, ProprietaireCheque>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public ProprietaireChequeSpecification(ProprietaireChequeCriteria criteria) {
        super(criteria);
    }

    public ProprietaireChequeSpecification(ProprietaireChequeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
