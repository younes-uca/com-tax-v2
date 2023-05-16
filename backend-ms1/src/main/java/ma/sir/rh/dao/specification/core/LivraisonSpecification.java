package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.LivraisonCriteria;
import ma.sir.rh.bean.core.Livraison;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class LivraisonSpecification extends  AbstractSpecification<LivraisonCriteria, Livraison>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("dateLivraison", criteria.getDateLivraison(), criteria.getDateLivraisonFrom(), criteria.getDateLivraisonTo());
        addPredicateFk("demande","id", criteria.getDemande()==null?null:criteria.getDemande().getId());
        addPredicateFk("demande","id", criteria.getDemandes());
        addPredicateFk("etatLivraison","id", criteria.getEtatLivraison()==null?null:criteria.getEtatLivraison().getId());
        addPredicateFk("etatLivraison","id", criteria.getEtatLivraisons());
        addPredicateFk("etatLivraison","code", criteria.getEtatLivraison()==null?null:criteria.getEtatLivraison().getCode());
        addPredicateFk("client","id", criteria.getClient()==null?null:criteria.getClient().getId());
        addPredicateFk("client","id", criteria.getClients());
        addPredicateFk("client","cin", criteria.getClient()==null?null:criteria.getClient().getCin());
    }

    public LivraisonSpecification(LivraisonCriteria criteria) {
        super(criteria);
    }

    public LivraisonSpecification(LivraisonCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
