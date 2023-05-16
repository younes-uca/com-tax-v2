package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.DevisFournisseur;
import ma.sir.rh.bean.history.DevisFournisseurHistory;
import ma.sir.rh.dao.criteria.core.DevisFournisseurCriteria;
import ma.sir.rh.dao.criteria.history.DevisFournisseurHistoryCriteria;
import ma.sir.rh.dao.facade.core.DevisFournisseurDao;
import ma.sir.rh.dao.facade.history.DevisFournisseurHistoryDao;
import ma.sir.rh.dao.specification.core.DevisFournisseurSpecification;
import ma.sir.rh.service.facade.admin.DevisFournisseurAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.DevisFournisseurDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.rh.bean.core.DevisItemFournisseur;

import ma.sir.rh.service.facade.admin.DevisItemFournisseurAdminService ;
import ma.sir.rh.service.facade.admin.FournisseurAdminService ;


import java.util.List;
@Service
public class DevisFournisseurAdminServiceImpl extends AbstractServiceImpl<DevisFournisseur,DevisFournisseurHistory, DevisFournisseurCriteria, DevisFournisseurHistoryCriteria, DevisFournisseurDao,
DevisFournisseurHistoryDao> implements DevisFournisseurAdminService {
    public static final String TEMPLATE = "template/devisFournisseur.vm";
    public static final String FILE_NAME = "devisFournisseur.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(DevisFournisseurDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public DevisFournisseur create(DevisFournisseur t) {
        super.create(t);
        if (t.getDevisItemFournisseurs() != null) {
                t.getDevisItemFournisseurs().forEach(element-> {
                    element.setDevisFournisseur(t);
                    devisItemFournisseurService.create(element);
            });
        }
        return t;
    }

    public DevisFournisseur findWithAssociatedLists(Long id){
        DevisFournisseur result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setDevisItemFournisseurs(devisItemFournisseurService.findByDevisFournisseurId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        devisItemFournisseurService.deleteByDevisFournisseurId(id);
    }


    public void updateWithAssociatedLists(DevisFournisseur devisFournisseur){
    if(devisFournisseur !=null && devisFournisseur.getId() != null){
            List<List<DevisItemFournisseur>> resultDevisItemFournisseurs= devisItemFournisseurService.getToBeSavedAndToBeDeleted(devisItemFournisseurService.findByDevisFournisseurId(devisFournisseur.getId()),devisFournisseur.getDevisItemFournisseurs());
            devisItemFournisseurService.delete(resultDevisItemFournisseurs.get(1));
            ListUtil.emptyIfNull(resultDevisItemFournisseurs.get(0)).forEach(e -> e.setDevisFournisseur(devisFournisseur));
            devisItemFournisseurService.update(resultDevisItemFournisseurs.get(0),true);
    }
    }

    public DevisFournisseur findByReferenceEntity(DevisFournisseur t){
        return  dao.findByReference(t.getReference());
    }

    public List<DevisFournisseur> findByFournisseurId(Long id){
        return dao.findByFournisseurId(id);
    }
    public int deleteByFournisseurId(Long id){
        return dao.deleteByFournisseurId(id);
    }



    public void configure() {
        super.configure(DevisFournisseur.class,DevisFournisseurHistory.class, DevisFournisseurHistoryCriteria.class, DevisFournisseurSpecification.class);
    }

    @Autowired
    private DevisItemFournisseurAdminService devisItemFournisseurService ;
    @Autowired
    private FournisseurAdminService fournisseurService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public DevisFournisseurAdminServiceImpl(DevisFournisseurDao dao, DevisFournisseurHistoryDao historyDao) {
        super(dao, historyDao);
    }

}