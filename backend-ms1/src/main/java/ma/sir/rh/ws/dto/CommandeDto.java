package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommandeDto  extends AuditBaseDto {

    private String reference  ;
    private String dateCommande ;
    private BigDecimal total  ;
    private BigDecimal totalePaye  ;

    private ClientDto client ;
    private StoreDto store ;
    private EtatCommandeDto etatCommande ;

    private List<CommandeItemDto> commandeItems ;


    public CommandeDto(){
        super();
    }



    @Log
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateCommande(){
        return this.dateCommande;
    }
    public void setDateCommande(String dateCommande){
        this.dateCommande = dateCommande;
    }

    @Log
    public BigDecimal getTotal(){
        return this.total;
    }
    public void setTotal(BigDecimal total){
        this.total = total;
    }

    @Log
    public BigDecimal getTotalePaye(){
        return this.totalePaye;
    }
    public void setTotalePaye(BigDecimal totalePaye){
        this.totalePaye = totalePaye;
    }


    public ClientDto getClient(){
        return this.client;
    }

    public void setClient(ClientDto client){
        this.client = client;
    }
    public StoreDto getStore(){
        return this.store;
    }

    public void setStore(StoreDto store){
        this.store = store;
    }
    public EtatCommandeDto getEtatCommande(){
        return this.etatCommande;
    }

    public void setEtatCommande(EtatCommandeDto etatCommande){
        this.etatCommande = etatCommande;
    }



    public List<CommandeItemDto> getCommandeItems(){
        return this.commandeItems;
    }

    public void setCommandeItems(List<CommandeItemDto> commandeItems){
        this.commandeItems = commandeItems;
    }

}
