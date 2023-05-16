package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.ProprietaireChequeBanque;
import ma.sir.rh.dao.criteria.core.ProprietaireChequeBanqueCriteria;
import ma.sir.rh.dao.criteria.history.ProprietaireChequeBanqueHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.ProprietaireChequeBanqueDto;

public interface ProprietaireChequeBanqueAdminService extends  IService<ProprietaireChequeBanque,ProprietaireChequeBanqueCriteria, ProprietaireChequeBanqueHistoryCriteria>  {

    List<ProprietaireChequeBanque> findByProprietaireChequeId(Long id);
    int deleteByProprietaireChequeId(Long id);
    List<ProprietaireChequeBanque> findByBanqueId(Long id);
    int deleteByBanqueId(Long id);

    HttpEntity<byte[]> createPdf(ProprietaireChequeBanqueDto dto) throws Exception;


}
