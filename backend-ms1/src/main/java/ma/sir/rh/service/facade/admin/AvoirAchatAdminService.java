package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.AvoirAchat;
import ma.sir.rh.dao.criteria.core.AvoirAchatCriteria;
import ma.sir.rh.dao.criteria.history.AvoirAchatHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.AvoirAchatDto;

public interface AvoirAchatAdminService extends  IService<AvoirAchat,AvoirAchatCriteria, AvoirAchatHistoryCriteria>  {

    List<AvoirAchat> findByAchatId(Long id);
    int deleteByAchatId(Long id);
    List<AvoirAchat> findByEtatAvoirAchatId(Long id);
    int deleteByEtatAvoirAchatId(Long id);

    HttpEntity<byte[]> createPdf(AvoirAchatDto dto) throws Exception;


}
