package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.AvoirAchat;
import ma.sir.rh.bean.history.AvoirAchatHistory;
import ma.sir.rh.dao.criteria.core.AvoirAchatCriteria;
import ma.sir.rh.dao.criteria.history.AvoirAchatHistoryCriteria;
import ma.sir.rh.dao.facade.core.AvoirAchatDao;
import ma.sir.rh.dao.facade.history.AvoirAchatHistoryDao;
import ma.sir.rh.dao.specification.core.AvoirAchatSpecification;
import ma.sir.rh.service.facade.admin.AvoirAchatAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.AvoirAchatDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.rh.bean.core.AvoirAchatItem;

import ma.sir.rh.service.facade.admin.AchatAdminService ;
import ma.sir.rh.service.facade.admin.AvoirAchatItemAdminService ;
import ma.sir.rh.service.facade.admin.EtatAvoirAchatAdminService ;


import java.util.List;
@Service
public class AvoirAchatAdminServiceImpl extends AbstractServiceImpl<AvoirAchat,AvoirAchatHistory, AvoirAchatCriteria, AvoirAchatHistoryCriteria, AvoirAchatDao,
AvoirAchatHistoryDao> implements AvoirAchatAdminService {
    public static final String TEMPLATE = "template/avoirAchat.vm";
    public static final String FILE_NAME = "avoirAchat.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(AvoirAchatDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public AvoirAchat create(AvoirAchat t) {
        super.create(t);
        if (t.getAvoirAchatItems() != null) {
                t.getAvoirAchatItems().forEach(element-> {
                    element.setAvoirAchat(t);
                    avoirAchatItemService.create(element);
            });
        }
        return t;
    }

    public AvoirAchat findWithAssociatedLists(Long id){
        AvoirAchat result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setAvoirAchatItems(avoirAchatItemService.findByAvoirAchatId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        avoirAchatItemService.deleteByAvoirAchatId(id);
    }


    public void updateWithAssociatedLists(AvoirAchat avoirAchat){
    if(avoirAchat !=null && avoirAchat.getId() != null){
            List<List<AvoirAchatItem>> resultAvoirAchatItems= avoirAchatItemService.getToBeSavedAndToBeDeleted(avoirAchatItemService.findByAvoirAchatId(avoirAchat.getId()),avoirAchat.getAvoirAchatItems());
            avoirAchatItemService.delete(resultAvoirAchatItems.get(1));
            ListUtil.emptyIfNull(resultAvoirAchatItems.get(0)).forEach(e -> e.setAvoirAchat(avoirAchat));
            avoirAchatItemService.update(resultAvoirAchatItems.get(0),true);
    }
    }


    public List<AvoirAchat> findByAchatId(Long id){
        return dao.findByAchatId(id);
    }
    public int deleteByAchatId(Long id){
        return dao.deleteByAchatId(id);
    }
    public List<AvoirAchat> findByEtatAvoirAchatId(Long id){
        return dao.findByEtatAvoirAchatId(id);
    }
    public int deleteByEtatAvoirAchatId(Long id){
        return dao.deleteByEtatAvoirAchatId(id);
    }



    public void configure() {
        super.configure(AvoirAchat.class,AvoirAchatHistory.class, AvoirAchatHistoryCriteria.class, AvoirAchatSpecification.class);
    }

    @Autowired
    private AchatAdminService achatService ;
    @Autowired
    private AvoirAchatItemAdminService avoirAchatItemService ;
    @Autowired
    private EtatAvoirAchatAdminService etatAvoirAchatService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public AvoirAchatAdminServiceImpl(AvoirAchatDao dao, AvoirAchatHistoryDao historyDao) {
        super(dao, historyDao);
    }

}