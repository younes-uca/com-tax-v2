package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Societe;
import ma.sir.rh.bean.history.SocieteHistory;
import ma.sir.rh.dao.criteria.core.SocieteCriteria;
import ma.sir.rh.dao.criteria.history.SocieteHistoryCriteria;
import ma.sir.rh.dao.facade.core.SocieteDao;
import ma.sir.rh.dao.facade.history.SocieteHistoryDao;
import ma.sir.rh.dao.specification.core.SocieteSpecification;
import ma.sir.rh.service.facade.admin.SocieteAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.SocieteDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.rh.bean.core.Store;

import ma.sir.rh.service.facade.admin.StoreAdminService ;
import ma.sir.rh.service.facade.admin.AbonneAdminService ;


import java.util.List;
@Service
public class SocieteAdminServiceImpl extends AbstractServiceImpl<Societe,SocieteHistory, SocieteCriteria, SocieteHistoryCriteria, SocieteDao,
SocieteHistoryDao> implements SocieteAdminService {
    public static final String TEMPLATE = "template/societe.vm";
    public static final String FILE_NAME = "societe.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(SocieteDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Societe create(Societe t) {
        super.create(t);
        if (t.getStores() != null) {
                t.getStores().forEach(element-> {
                    element.setSociete(t);
                    storeService.create(element);
            });
        }
        return t;
    }

    public Societe findWithAssociatedLists(Long id){
        Societe result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setStores(storeService.findBySocieteId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        storeService.deleteBySocieteId(id);
    }


    public void updateWithAssociatedLists(Societe societe){
    if(societe !=null && societe.getId() != null){
            List<List<Store>> resultStores= storeService.getToBeSavedAndToBeDeleted(storeService.findBySocieteId(societe.getId()),societe.getStores());
            storeService.delete(resultStores.get(1));
            ListUtil.emptyIfNull(resultStores.get(0)).forEach(e -> e.setSociete(societe));
            storeService.update(resultStores.get(0),true);
    }
    }

    public Societe findByReferenceEntity(Societe t){
        return  dao.findByIce(t.getIce());
    }

    public List<Societe> findByAbonneId(Long id){
        return dao.findByAbonneId(id);
    }
    public int deleteByAbonneId(Long id){
        return dao.deleteByAbonneId(id);
    }



    public void configure() {
        super.configure(Societe.class,SocieteHistory.class, SocieteHistoryCriteria.class, SocieteSpecification.class);
    }

    @Autowired
    private StoreAdminService storeService ;
    @Autowired
    private AbonneAdminService abonneService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public SocieteAdminServiceImpl(SocieteDao dao, SocieteHistoryDao historyDao) {
        super(dao, historyDao);
    }

}