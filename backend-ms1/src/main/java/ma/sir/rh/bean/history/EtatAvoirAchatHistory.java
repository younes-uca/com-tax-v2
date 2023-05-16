package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "etat_avoir_achat")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etat_avoir_achat_seq",sequenceName="etat_avoir_achat_seq",allocationSize=1, initialValue = 1)
public class EtatAvoirAchatHistory extends HistBusinessObject  {


    public EtatAvoirAchatHistory() {
    super();
    }

    public EtatAvoirAchatHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etat_avoir_achat_seq")
    public Long getId() {
    return id;
    }
}

