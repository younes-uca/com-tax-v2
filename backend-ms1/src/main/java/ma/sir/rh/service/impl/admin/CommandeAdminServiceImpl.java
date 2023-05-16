package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Commande;
import ma.sir.rh.bean.history.CommandeHistory;
import ma.sir.rh.dao.criteria.core.CommandeCriteria;
import ma.sir.rh.dao.criteria.history.CommandeHistoryCriteria;
import ma.sir.rh.dao.facade.core.CommandeDao;
import ma.sir.rh.dao.facade.history.CommandeHistoryDao;
import ma.sir.rh.dao.specification.core.CommandeSpecification;
import ma.sir.rh.service.facade.admin.CommandeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.CommandeDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.rh.bean.core.CommandeItem;

import ma.sir.rh.service.facade.admin.CommandeItemAdminService ;
import ma.sir.rh.service.facade.admin.EtatCommandeAdminService ;
import ma.sir.rh.service.facade.admin.ClientAdminService ;
import ma.sir.rh.service.facade.admin.StoreAdminService ;


import java.util.List;
@Service
public class CommandeAdminServiceImpl extends AbstractServiceImpl<Commande,CommandeHistory, CommandeCriteria, CommandeHistoryCriteria, CommandeDao,
CommandeHistoryDao> implements CommandeAdminService {
    public static final String TEMPLATE = "template/commande.vm";
    public static final String FILE_NAME = "commande.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(CommandeDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Commande create(Commande t) {
        super.create(t);
        if (t.getCommandeItems() != null) {
                t.getCommandeItems().forEach(element-> {
                    element.setCommande(t);
                    commandeItemService.create(element);
            });
        }
        return t;
    }

    public Commande findWithAssociatedLists(Long id){
        Commande result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setCommandeItems(commandeItemService.findByCommandeId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        commandeItemService.deleteByCommandeId(id);
    }


    public void updateWithAssociatedLists(Commande commande){
    if(commande !=null && commande.getId() != null){
            List<List<CommandeItem>> resultCommandeItems= commandeItemService.getToBeSavedAndToBeDeleted(commandeItemService.findByCommandeId(commande.getId()),commande.getCommandeItems());
            commandeItemService.delete(resultCommandeItems.get(1));
            ListUtil.emptyIfNull(resultCommandeItems.get(0)).forEach(e -> e.setCommande(commande));
            commandeItemService.update(resultCommandeItems.get(0),true);
    }
    }

    public Commande findByReferenceEntity(Commande t){
        return  dao.findByReference(t.getReference());
    }

    public List<Commande> findByClientId(Long id){
        return dao.findByClientId(id);
    }
    public int deleteByClientId(Long id){
        return dao.deleteByClientId(id);
    }
    public List<Commande> findByStoreId(Long id){
        return dao.findByStoreId(id);
    }
    public int deleteByStoreId(Long id){
        return dao.deleteByStoreId(id);
    }
    public List<Commande> findByEtatCommandeId(Long id){
        return dao.findByEtatCommandeId(id);
    }
    public int deleteByEtatCommandeId(Long id){
        return dao.deleteByEtatCommandeId(id);
    }



    public void configure() {
        super.configure(Commande.class,CommandeHistory.class, CommandeHistoryCriteria.class, CommandeSpecification.class);
    }

    @Autowired
    private CommandeItemAdminService commandeItemService ;
    @Autowired
    private EtatCommandeAdminService etatCommandeService ;
    @Autowired
    private ClientAdminService clientService ;
    @Autowired
    private StoreAdminService storeService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public CommandeAdminServiceImpl(CommandeDao dao, CommandeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}