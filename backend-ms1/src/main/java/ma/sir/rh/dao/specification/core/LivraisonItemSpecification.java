package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.LivraisonItemCriteria;
import ma.sir.rh.bean.core.LivraisonItem;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class LivraisonItemSpecification extends  AbstractSpecification<LivraisonItemCriteria, LivraisonItem>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("quantite", criteria.getQuantite(), criteria.getQuantiteMin(), criteria.getQuantiteMax());
        addPredicateFk("produit","id", criteria.getProduit()==null?null:criteria.getProduit().getId());
        addPredicateFk("produit","id", criteria.getProduits());
        addPredicateFk("produit","reference", criteria.getProduit()==null?null:criteria.getProduit().getReference());
        addPredicateFk("livraison","id", criteria.getLivraison()==null?null:criteria.getLivraison().getId());
        addPredicateFk("livraison","id", criteria.getLivraisons());
    }

    public LivraisonItemSpecification(LivraisonItemCriteria criteria) {
        super(criteria);
    }

    public LivraisonItemSpecification(LivraisonItemCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
