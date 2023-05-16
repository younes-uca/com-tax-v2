package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.CommandeItem;
import ma.sir.rh.bean.history.CommandeItemHistory;
import ma.sir.rh.dao.criteria.core.CommandeItemCriteria;
import ma.sir.rh.dao.criteria.history.CommandeItemHistoryCriteria;
import ma.sir.rh.dao.facade.core.CommandeItemDao;
import ma.sir.rh.dao.facade.history.CommandeItemHistoryDao;
import ma.sir.rh.dao.specification.core.CommandeItemSpecification;
import ma.sir.rh.service.facade.admin.CommandeItemAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.CommandeItemDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.CommandeAdminService ;
import ma.sir.rh.service.facade.admin.EtatCommandeAdminService ;
import ma.sir.rh.service.facade.admin.ProduitAdminService ;


import java.util.List;
@Service
public class CommandeItemAdminServiceImpl extends AbstractServiceImpl<CommandeItem,CommandeItemHistory, CommandeItemCriteria, CommandeItemHistoryCriteria, CommandeItemDao,
CommandeItemHistoryDao> implements CommandeItemAdminService {
    public static final String TEMPLATE = "template/commandeItem.vm";
    public static final String FILE_NAME = "commandeItem.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(CommandeItemDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<CommandeItem> findByProduitId(Long id){
        return dao.findByProduitId(id);
    }
    public int deleteByProduitId(Long id){
        return dao.deleteByProduitId(id);
    }
    public List<CommandeItem> findByCommandeId(Long id){
        return dao.findByCommandeId(id);
    }
    public int deleteByCommandeId(Long id){
        return dao.deleteByCommandeId(id);
    }
    public List<CommandeItem> findByEtatCommandeId(Long id){
        return dao.findByEtatCommandeId(id);
    }
    public int deleteByEtatCommandeId(Long id){
        return dao.deleteByEtatCommandeId(id);
    }



    public void configure() {
        super.configure(CommandeItem.class,CommandeItemHistory.class, CommandeItemHistoryCriteria.class, CommandeItemSpecification.class);
    }

    @Autowired
    private CommandeAdminService commandeService ;
    @Autowired
    private EtatCommandeAdminService etatCommandeService ;
    @Autowired
    private ProduitAdminService produitService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public CommandeItemAdminServiceImpl(CommandeItemDao dao, CommandeItemHistoryDao historyDao) {
        super(dao, historyDao);
    }

}