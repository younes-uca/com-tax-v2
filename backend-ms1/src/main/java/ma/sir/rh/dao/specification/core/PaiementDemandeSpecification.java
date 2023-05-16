package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.PaiementDemandeCriteria;
import ma.sir.rh.bean.core.PaiementDemande;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PaiementDemandeSpecification extends  AbstractSpecification<PaiementDemandeCriteria, PaiementDemande>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("datePaiement", criteria.getDatePaiement(), criteria.getDatePaiementFrom(), criteria.getDatePaiementTo());
        addPredicateBigDecimal("montant", criteria.getMontant(), criteria.getMontantMin(), criteria.getMontantMax());
        addPredicateFk("demande","id", criteria.getDemande()==null?null:criteria.getDemande().getId());
        addPredicateFk("demande","id", criteria.getDemandes());
        addPredicateFk("modePaiement","id", criteria.getModePaiement()==null?null:criteria.getModePaiement().getId());
        addPredicateFk("modePaiement","id", criteria.getModePaiements());
        addPredicateFk("modePaiement","code", criteria.getModePaiement()==null?null:criteria.getModePaiement().getCode());
    }

    public PaiementDemandeSpecification(PaiementDemandeCriteria criteria) {
        super(criteria);
    }

    public PaiementDemandeSpecification(PaiementDemandeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
