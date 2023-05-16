package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Societe;
import ma.sir.rh.dao.criteria.core.SocieteCriteria;
import ma.sir.rh.dao.criteria.history.SocieteHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.SocieteDto;

public interface SocieteAdminService extends  IService<Societe,SocieteCriteria, SocieteHistoryCriteria>  {

    List<Societe> findByAbonneId(Long id);
    int deleteByAbonneId(Long id);

    HttpEntity<byte[]> createPdf(SocieteDto dto) throws Exception;


}
