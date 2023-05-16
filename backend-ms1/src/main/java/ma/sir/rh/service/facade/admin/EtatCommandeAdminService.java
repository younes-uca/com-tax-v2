package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.EtatCommande;
import ma.sir.rh.dao.criteria.core.EtatCommandeCriteria;
import ma.sir.rh.dao.criteria.history.EtatCommandeHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.EtatCommandeDto;

public interface EtatCommandeAdminService extends  IService<EtatCommande,EtatCommandeCriteria, EtatCommandeHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(EtatCommandeDto dto) throws Exception;


}
