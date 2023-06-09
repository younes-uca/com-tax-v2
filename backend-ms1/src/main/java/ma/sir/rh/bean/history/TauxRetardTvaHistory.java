package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "taux_retard_tva")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="taux_retard_tva_seq",sequenceName="taux_retard_tva_seq",allocationSize=1, initialValue = 1)
public class TauxRetardTvaHistory extends HistBusinessObject  {


    public TauxRetardTvaHistory() {
    super();
    }

    public TauxRetardTvaHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="taux_retard_tva_seq")
    public Long getId() {
    return id;
    }
}

