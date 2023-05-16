package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.DeclarationTva;
import ma.sir.rh.dao.criteria.core.DeclarationTvaCriteria;
import ma.sir.rh.dao.criteria.history.DeclarationTvaHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.DeclarationTvaDto;

public interface DeclarationTvaAdminService extends  IService<DeclarationTva,DeclarationTvaCriteria, DeclarationTvaHistoryCriteria>  {

    List<DeclarationTva> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    List<DeclarationTva> findByTauxRetardTvaId(Long id);
    int deleteByTauxRetardTvaId(Long id);
    List<DeclarationTva> findByComptableTraitantId(Long id);
    int deleteByComptableTraitantId(Long id);
    List<DeclarationTva> findByComptableValidateurId(Long id);
    int deleteByComptableValidateurId(Long id);

    HttpEntity<byte[]> createPdf(DeclarationTvaDto dto) throws Exception;


}
