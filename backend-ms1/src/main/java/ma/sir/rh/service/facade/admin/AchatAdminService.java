package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Achat;
import ma.sir.rh.dao.criteria.core.AchatCriteria;
import ma.sir.rh.dao.criteria.history.AchatHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.AchatDto;

public interface AchatAdminService extends  IService<Achat,AchatCriteria, AchatHistoryCriteria>  {

    List<Achat> findByFournisseurId(Long id);
    int deleteByFournisseurId(Long id);
    List<Achat> findByStoreId(Long id);
    int deleteByStoreId(Long id);
    List<Achat> findByEtatAchatId(Long id);
    int deleteByEtatAchatId(Long id);

    HttpEntity<byte[]> createPdf(AchatDto dto) throws Exception;


}
