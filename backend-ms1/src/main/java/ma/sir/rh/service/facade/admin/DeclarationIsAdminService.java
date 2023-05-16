package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.DeclarationIs;
import ma.sir.rh.dao.criteria.core.DeclarationIsCriteria;
import ma.sir.rh.dao.criteria.history.DeclarationIsHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.DeclarationIsDto;

public interface DeclarationIsAdminService extends  IService<DeclarationIs,DeclarationIsCriteria, DeclarationIsHistoryCriteria>  {

    List<DeclarationIs> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    List<DeclarationIs> findByTauxIsId(Long id);
    int deleteByTauxIsId(Long id);
    List<DeclarationIs> findByComptableTraitantId(Long id);
    int deleteByComptableTraitantId(Long id);
    List<DeclarationIs> findByComptableValidateurId(Long id);
    int deleteByComptableValidateurId(Long id);

    HttpEntity<byte[]> createPdf(DeclarationIsDto dto) throws Exception;


}
