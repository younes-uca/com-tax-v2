package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.DeclarationTva;
import ma.sir.rh.bean.history.DeclarationTvaHistory;
import ma.sir.rh.dao.criteria.core.DeclarationTvaCriteria;
import ma.sir.rh.dao.criteria.history.DeclarationTvaHistoryCriteria;
import ma.sir.rh.dao.facade.core.DeclarationTvaDao;
import ma.sir.rh.dao.facade.history.DeclarationTvaHistoryDao;
import ma.sir.rh.dao.specification.core.DeclarationTvaSpecification;
import ma.sir.rh.service.facade.admin.DeclarationTvaAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.DeclarationTvaDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.ComptableTraitantAdminService ;
import ma.sir.rh.service.facade.admin.SocieteAdminService ;
import ma.sir.rh.service.facade.admin.ComptableValidateurAdminService ;
import ma.sir.rh.service.facade.admin.TauxRetardTvaAdminService ;


import java.util.List;
@Service
public class DeclarationTvaAdminServiceImpl extends AbstractServiceImpl<DeclarationTva,DeclarationTvaHistory, DeclarationTvaCriteria, DeclarationTvaHistoryCriteria, DeclarationTvaDao,
DeclarationTvaHistoryDao> implements DeclarationTvaAdminService {
    public static final String TEMPLATE = "template/declarationTva.vm";
    public static final String FILE_NAME = "declarationTva.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(DeclarationTvaDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<DeclarationTva> findBySocieteId(Long id){
        return dao.findBySocieteId(id);
    }
    public int deleteBySocieteId(Long id){
        return dao.deleteBySocieteId(id);
    }
    public List<DeclarationTva> findByTauxRetardTvaId(Long id){
        return dao.findByTauxRetardTvaId(id);
    }
    public int deleteByTauxRetardTvaId(Long id){
        return dao.deleteByTauxRetardTvaId(id);
    }
    public List<DeclarationTva> findByComptableTraitantId(Long id){
        return dao.findByComptableTraitantId(id);
    }
    public int deleteByComptableTraitantId(Long id){
        return dao.deleteByComptableTraitantId(id);
    }
    public List<DeclarationTva> findByComptableValidateurId(Long id){
        return dao.findByComptableValidateurId(id);
    }
    public int deleteByComptableValidateurId(Long id){
        return dao.deleteByComptableValidateurId(id);
    }



    public void configure() {
        super.configure(DeclarationTva.class,DeclarationTvaHistory.class, DeclarationTvaHistoryCriteria.class, DeclarationTvaSpecification.class);
    }

    @Autowired
    private ComptableTraitantAdminService comptableTraitantService ;
    @Autowired
    private SocieteAdminService societeService ;
    @Autowired
    private ComptableValidateurAdminService comptableValidateurService ;
    @Autowired
    private TauxRetardTvaAdminService tauxRetardTvaService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public DeclarationTvaAdminServiceImpl(DeclarationTvaDao dao, DeclarationTvaHistoryDao historyDao) {
        super(dao, historyDao);
    }

}