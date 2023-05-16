package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "demande")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="demande_seq",sequenceName="demande_seq",allocationSize=1, initialValue = 1)
public class DemandeHistory extends HistBusinessObject  {


    public DemandeHistory() {
    super();
    }

    public DemandeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="demande_seq")
    public Long getId() {
    return id;
    }
}

