package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.DeclarationIs;
import ma.sir.rh.bean.history.DeclarationIsHistory;
import ma.sir.rh.dao.criteria.core.DeclarationIsCriteria;
import ma.sir.rh.dao.criteria.history.DeclarationIsHistoryCriteria;
import ma.sir.rh.dao.facade.core.DeclarationIsDao;
import ma.sir.rh.dao.facade.history.DeclarationIsHistoryDao;
import ma.sir.rh.dao.specification.core.DeclarationIsSpecification;
import ma.sir.rh.service.facade.admin.DeclarationIsAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.DeclarationIsDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.ComptableTraitantAdminService ;
import ma.sir.rh.service.facade.admin.TauxIsAdminService ;
import ma.sir.rh.service.facade.admin.SocieteAdminService ;
import ma.sir.rh.service.facade.admin.ComptableValidateurAdminService ;


import java.util.List;
@Service
public class DeclarationIsAdminServiceImpl extends AbstractServiceImpl<DeclarationIs,DeclarationIsHistory, DeclarationIsCriteria, DeclarationIsHistoryCriteria, DeclarationIsDao,
DeclarationIsHistoryDao> implements DeclarationIsAdminService {
    public static final String TEMPLATE = "template/declarationIs.vm";
    public static final String FILE_NAME = "declarationIs.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(DeclarationIsDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<DeclarationIs> findBySocieteId(Long id){
        return dao.findBySocieteId(id);
    }
    public int deleteBySocieteId(Long id){
        return dao.deleteBySocieteId(id);
    }
    public List<DeclarationIs> findByTauxIsId(Long id){
        return dao.findByTauxIsId(id);
    }
    public int deleteByTauxIsId(Long id){
        return dao.deleteByTauxIsId(id);
    }
    public List<DeclarationIs> findByComptableTraitantId(Long id){
        return dao.findByComptableTraitantId(id);
    }
    public int deleteByComptableTraitantId(Long id){
        return dao.deleteByComptableTraitantId(id);
    }
    public List<DeclarationIs> findByComptableValidateurId(Long id){
        return dao.findByComptableValidateurId(id);
    }
    public int deleteByComptableValidateurId(Long id){
        return dao.deleteByComptableValidateurId(id);
    }



    public void configure() {
        super.configure(DeclarationIs.class,DeclarationIsHistory.class, DeclarationIsHistoryCriteria.class, DeclarationIsSpecification.class);
    }

    @Autowired
    private ComptableTraitantAdminService comptableTraitantService ;
    @Autowired
    private TauxIsAdminService tauxIsService ;
    @Autowired
    private SocieteAdminService societeService ;
    @Autowired
    private ComptableValidateurAdminService comptableValidateurService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public DeclarationIsAdminServiceImpl(DeclarationIsDao dao, DeclarationIsHistoryDao historyDao) {
        super(dao, historyDao);
    }

}