package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Achat;
import ma.sir.rh.bean.history.AchatHistory;
import ma.sir.rh.dao.criteria.core.AchatCriteria;
import ma.sir.rh.dao.criteria.history.AchatHistoryCriteria;
import ma.sir.rh.dao.facade.core.AchatDao;
import ma.sir.rh.dao.facade.history.AchatHistoryDao;
import ma.sir.rh.dao.specification.core.AchatSpecification;
import ma.sir.rh.service.facade.admin.AchatAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.AchatDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.rh.bean.core.AchatItem;

import ma.sir.rh.service.facade.admin.EtatAchatAdminService ;
import ma.sir.rh.service.facade.admin.StoreAdminService ;
import ma.sir.rh.service.facade.admin.FournisseurAdminService ;
import ma.sir.rh.service.facade.admin.AchatItemAdminService ;


import java.util.List;
@Service
public class AchatAdminServiceImpl extends AbstractServiceImpl<Achat,AchatHistory, AchatCriteria, AchatHistoryCriteria, AchatDao,
AchatHistoryDao> implements AchatAdminService {
    public static final String TEMPLATE = "template/achat.vm";
    public static final String FILE_NAME = "achat.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(AchatDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Achat create(Achat t) {
        super.create(t);
        if (t.getAchatItems() != null) {
                t.getAchatItems().forEach(element-> {
                    element.setAchat(t);
                    achatItemService.create(element);
            });
        }
        return t;
    }

    public Achat findWithAssociatedLists(Long id){
        Achat result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setAchatItems(achatItemService.findByAchatId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        achatItemService.deleteByAchatId(id);
    }


    public void updateWithAssociatedLists(Achat achat){
    if(achat !=null && achat.getId() != null){
            List<List<AchatItem>> resultAchatItems= achatItemService.getToBeSavedAndToBeDeleted(achatItemService.findByAchatId(achat.getId()),achat.getAchatItems());
            achatItemService.delete(resultAchatItems.get(1));
            ListUtil.emptyIfNull(resultAchatItems.get(0)).forEach(e -> e.setAchat(achat));
            achatItemService.update(resultAchatItems.get(0),true);
    }
    }

    public Achat findByReferenceEntity(Achat t){
        return  dao.findByReference(t.getReference());
    }

    public List<Achat> findByFournisseurId(Long id){
        return dao.findByFournisseurId(id);
    }
    public int deleteByFournisseurId(Long id){
        return dao.deleteByFournisseurId(id);
    }
    public List<Achat> findByStoreId(Long id){
        return dao.findByStoreId(id);
    }
    public int deleteByStoreId(Long id){
        return dao.deleteByStoreId(id);
    }
    public List<Achat> findByEtatAchatId(Long id){
        return dao.findByEtatAchatId(id);
    }
    public int deleteByEtatAchatId(Long id){
        return dao.deleteByEtatAchatId(id);
    }



    public void configure() {
        super.configure(Achat.class,AchatHistory.class, AchatHistoryCriteria.class, AchatSpecification.class);
    }

    @Autowired
    private EtatAchatAdminService etatAchatService ;
    @Autowired
    private StoreAdminService storeService ;
    @Autowired
    private FournisseurAdminService fournisseurService ;
    @Autowired
    private AchatItemAdminService achatItemService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public AchatAdminServiceImpl(AchatDao dao, AchatHistoryDao historyDao) {
        super(dao, historyDao);
    }

}