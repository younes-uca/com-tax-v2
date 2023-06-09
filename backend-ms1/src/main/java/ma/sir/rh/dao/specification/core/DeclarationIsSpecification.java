package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.DeclarationIsCriteria;
import ma.sir.rh.bean.core.DeclarationIs;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class DeclarationIsSpecification extends  AbstractSpecification<DeclarationIsCriteria, DeclarationIs>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("dateDeclaration", criteria.getDateDeclaration(), criteria.getDateDeclarationFrom(), criteria.getDateDeclarationTo());
        addPredicateInt("trimistre", criteria.getTrimistre(), criteria.getTrimistreMin(), criteria.getTrimistreMax());
        addPredicateInt("annee", criteria.getAnnee(), criteria.getAnneeMin(), criteria.getAnneeMax());
        addPredicateBigDecimal("totalCharge", criteria.getTotalCharge(), criteria.getTotalChargeMin(), criteria.getTotalChargeMax());
        addPredicateBigDecimal("totalProduit", criteria.getTotalProduit(), criteria.getTotalProduitMin(), criteria.getTotalProduitMax());
        addPredicateBigDecimal("resultatAvantImpot", criteria.getResultatAvantImpot(), criteria.getResultatAvantImpotMin(), criteria.getResultatAvantImpotMax());
        addPredicateBigDecimal("montantImpot", criteria.getMontantImpot(), criteria.getMontantImpotMin(), criteria.getMontantImpotMax());
        addPredicateBigDecimal("resultatApresImpot", criteria.getResultatApresImpot(), criteria.getResultatApresImpotMin(), criteria.getResultatApresImpotMax());
        addPredicateFk("societe","id", criteria.getSociete()==null?null:criteria.getSociete().getId());
        addPredicateFk("societe","id", criteria.getSocietes());
        addPredicateFk("societe","ice", criteria.getSociete()==null?null:criteria.getSociete().getIce());
        addPredicateFk("tauxIs","id", criteria.getTauxIs()==null?null:criteria.getTauxIs().getId());
        addPredicateFk("tauxIs","id", criteria.getTauxIss());
        addPredicateFk("comptableTraitant","id", criteria.getComptableTraitant()==null?null:criteria.getComptableTraitant().getId());
        addPredicateFk("comptableTraitant","id", criteria.getComptableTraitants());
        addPredicateFk("comptableValidateur","id", criteria.getComptableValidateur()==null?null:criteria.getComptableValidateur().getId());
        addPredicateFk("comptableValidateur","id", criteria.getComptableValidateurs());
    }

    public DeclarationIsSpecification(DeclarationIsCriteria criteria) {
        super(criteria);
    }

    public DeclarationIsSpecification(DeclarationIsCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
