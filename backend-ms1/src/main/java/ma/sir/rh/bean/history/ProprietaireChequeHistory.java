package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "proprietaire_cheque")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="proprietaire_cheque_seq",sequenceName="proprietaire_cheque_seq",allocationSize=1, initialValue = 1)
public class ProprietaireChequeHistory extends HistBusinessObject  {


    public ProprietaireChequeHistory() {
    super();
    }

    public ProprietaireChequeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="proprietaire_cheque_seq")
    public Long getId() {
    return id;
    }
}

