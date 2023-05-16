package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "reception")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="reception_seq",sequenceName="reception_seq",allocationSize=1, initialValue = 1)
public class ReceptionHistory extends HistBusinessObject  {


    public ReceptionHistory() {
    super();
    }

    public ReceptionHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="reception_seq")
    public Long getId() {
    return id;
    }
}

