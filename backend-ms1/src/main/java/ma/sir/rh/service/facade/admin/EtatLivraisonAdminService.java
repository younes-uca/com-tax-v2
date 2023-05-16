package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.EtatLivraison;
import ma.sir.rh.dao.criteria.core.EtatLivraisonCriteria;
import ma.sir.rh.dao.criteria.history.EtatLivraisonHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.EtatLivraisonDto;

public interface EtatLivraisonAdminService extends  IService<EtatLivraison,EtatLivraisonCriteria, EtatLivraisonHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(EtatLivraisonDto dto) throws Exception;


}
