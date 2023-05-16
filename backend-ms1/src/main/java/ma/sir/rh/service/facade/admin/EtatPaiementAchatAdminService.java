package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.EtatPaiementAchat;
import ma.sir.rh.dao.criteria.core.EtatPaiementAchatCriteria;
import ma.sir.rh.dao.criteria.history.EtatPaiementAchatHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.EtatPaiementAchatDto;

public interface EtatPaiementAchatAdminService extends  IService<EtatPaiementAchat,EtatPaiementAchatCriteria, EtatPaiementAchatHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(EtatPaiementAchatDto dto) throws Exception;


}
