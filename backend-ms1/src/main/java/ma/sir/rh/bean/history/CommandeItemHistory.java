package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "commande_item")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="commande_item_seq",sequenceName="commande_item_seq",allocationSize=1, initialValue = 1)
public class CommandeItemHistory extends HistBusinessObject  {


    public CommandeItemHistory() {
    super();
    }

    public CommandeItemHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="commande_item_seq")
    public Long getId() {
    return id;
    }
}

