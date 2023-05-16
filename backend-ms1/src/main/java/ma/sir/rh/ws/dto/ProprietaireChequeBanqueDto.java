package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProprietaireChequeBanqueDto  extends AuditBaseDto {


    private ProprietaireChequeDto proprietaireCheque ;
    private BanqueDto banque ;



    public ProprietaireChequeBanqueDto(){
        super();
    }




    public ProprietaireChequeDto getProprietaireCheque(){
        return this.proprietaireCheque;
    }

    public void setProprietaireCheque(ProprietaireChequeDto proprietaireCheque){
        this.proprietaireCheque = proprietaireCheque;
    }
    public BanqueDto getBanque(){
        return this.banque;
    }

    public void setBanque(BanqueDto banque){
        this.banque = banque;
    }




}
