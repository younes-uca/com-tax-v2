package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "etat_paiement_commande")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etat_paiement_commande_seq",sequenceName="etat_paiement_commande_seq",allocationSize=1, initialValue = 1)
public class EtatPaiementCommandeHistory extends HistBusinessObject  {


    public EtatPaiementCommandeHistory() {
    super();
    }

    public EtatPaiementCommandeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etat_paiement_commande_seq")
    public Long getId() {
    return id;
    }
}

