package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "avoir_achat")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="avoir_achat_seq",sequenceName="avoir_achat_seq",allocationSize=1, initialValue = 1)
public class AvoirAchatHistory extends HistBusinessObject  {


    public AvoirAchatHistory() {
    super();
    }

    public AvoirAchatHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="avoir_achat_seq")
    public Long getId() {
    return id;
    }
}

