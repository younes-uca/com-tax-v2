package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Reception;
import ma.sir.rh.dao.criteria.core.ReceptionCriteria;
import ma.sir.rh.dao.criteria.history.ReceptionHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.ReceptionDto;

public interface ReceptionAdminService extends  IService<Reception,ReceptionCriteria, ReceptionHistoryCriteria>  {

    List<Reception> findByCommandeId(Long id);
    int deleteByCommandeId(Long id);
    List<Reception> findByEtatReceptionId(Long id);
    int deleteByEtatReceptionId(Long id);

    HttpEntity<byte[]> createPdf(ReceptionDto dto) throws Exception;


}
