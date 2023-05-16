package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.PaiementAchat;
import ma.sir.rh.dao.criteria.core.PaiementAchatCriteria;
import ma.sir.rh.dao.criteria.history.PaiementAchatHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.PaiementAchatDto;

public interface PaiementAchatAdminService extends  IService<PaiementAchat,PaiementAchatCriteria, PaiementAchatHistoryCriteria>  {

    List<PaiementAchat> findByAchatId(Long id);
    int deleteByAchatId(Long id);
    List<PaiementAchat> findByModePaiementId(Long id);
    int deleteByModePaiementId(Long id);
    List<PaiementAchat> findByEtatPaiementAchatId(Long id);
    int deleteByEtatPaiementAchatId(Long id);

    HttpEntity<byte[]> createPdf(PaiementAchatDto dto) throws Exception;


}
