package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.MagasinCriteria;
import ma.sir.rh.bean.core.Magasin;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class MagasinSpecification extends  AbstractSpecification<MagasinCriteria, Magasin>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("adresse", criteria.getAdresse(),criteria.getAdresseLike());
        addPredicateFk("store","id", criteria.getStore()==null?null:criteria.getStore().getId());
        addPredicateFk("store","id", criteria.getStores());
        addPredicateFk("store","reference", criteria.getStore()==null?null:criteria.getStore().getReference());
    }

    public MagasinSpecification(MagasinCriteria criteria) {
        super(criteria);
    }

    public MagasinSpecification(MagasinCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
