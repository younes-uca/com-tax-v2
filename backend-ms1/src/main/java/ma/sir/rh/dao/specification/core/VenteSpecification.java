package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.VenteCriteria;
import ma.sir.rh.bean.core.Vente;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class VenteSpecification extends  AbstractSpecification<VenteCriteria, Vente>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("dateVente", criteria.getDateVente(), criteria.getDateVenteFrom(), criteria.getDateVenteTo());
        addPredicateBigDecimal("total", criteria.getTotal(), criteria.getTotalMin(), criteria.getTotalMax());
        addPredicateBigDecimal("totalPaye", criteria.getTotalPaye(), criteria.getTotalPayeMin(), criteria.getTotalPayeMax());
        addPredicateFk("store","id", criteria.getStore()==null?null:criteria.getStore().getId());
        addPredicateFk("store","id", criteria.getStores());
        addPredicateFk("store","reference", criteria.getStore()==null?null:criteria.getStore().getReference());
        addPredicateFk("client","id", criteria.getClient()==null?null:criteria.getClient().getId());
        addPredicateFk("client","id", criteria.getClients());
        addPredicateFk("client","cin", criteria.getClient()==null?null:criteria.getClient().getCin());
        addPredicateFk("etatVente","id", criteria.getEtatVente()==null?null:criteria.getEtatVente().getId());
        addPredicateFk("etatVente","id", criteria.getEtatVentes());
        addPredicateFk("etatVente","code", criteria.getEtatVente()==null?null:criteria.getEtatVente().getCode());
    }

    public VenteSpecification(VenteCriteria criteria) {
        super(criteria);
    }

    public VenteSpecification(VenteCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
