package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "marque")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="marque_seq",sequenceName="marque_seq",allocationSize=1, initialValue = 1)
public class MarqueHistory extends HistBusinessObject  {


    public MarqueHistory() {
    super();
    }

    public MarqueHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="marque_seq")
    public Long getId() {
    return id;
    }
}

