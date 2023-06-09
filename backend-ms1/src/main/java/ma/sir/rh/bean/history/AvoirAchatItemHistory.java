package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "avoir_achat_item")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="avoir_achat_item_seq",sequenceName="avoir_achat_item_seq",allocationSize=1, initialValue = 1)
public class AvoirAchatItemHistory extends HistBusinessObject  {


    public AvoirAchatItemHistory() {
    super();
    }

    public AvoirAchatItemHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="avoir_achat_item_seq")
    public Long getId() {
    return id;
    }
}

