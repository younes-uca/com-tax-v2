package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.AvoirAchatItem;
import ma.sir.rh.bean.history.AvoirAchatItemHistory;
import ma.sir.rh.dao.criteria.core.AvoirAchatItemCriteria;
import ma.sir.rh.dao.criteria.history.AvoirAchatItemHistoryCriteria;
import ma.sir.rh.dao.facade.core.AvoirAchatItemDao;
import ma.sir.rh.dao.facade.history.AvoirAchatItemHistoryDao;
import ma.sir.rh.dao.specification.core.AvoirAchatItemSpecification;
import ma.sir.rh.service.facade.admin.AvoirAchatItemAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.AvoirAchatItemDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.AvoirAchatAdminService ;
import ma.sir.rh.service.facade.admin.ProduitAdminService ;


import java.util.List;
@Service
public class AvoirAchatItemAdminServiceImpl extends AbstractServiceImpl<AvoirAchatItem,AvoirAchatItemHistory, AvoirAchatItemCriteria, AvoirAchatItemHistoryCriteria, AvoirAchatItemDao,
AvoirAchatItemHistoryDao> implements AvoirAchatItemAdminService {
    public static final String TEMPLATE = "template/avoirAchatItem.vm";
    public static final String FILE_NAME = "avoirAchatItem.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(AvoirAchatItemDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<AvoirAchatItem> findByProduitId(Long id){
        return dao.findByProduitId(id);
    }
    public int deleteByProduitId(Long id){
        return dao.deleteByProduitId(id);
    }
    public List<AvoirAchatItem> findByAvoirAchatId(Long id){
        return dao.findByAvoirAchatId(id);
    }
    public int deleteByAvoirAchatId(Long id){
        return dao.deleteByAvoirAchatId(id);
    }



    public void configure() {
        super.configure(AvoirAchatItem.class,AvoirAchatItemHistory.class, AvoirAchatItemHistoryCriteria.class, AvoirAchatItemSpecification.class);
    }

    @Autowired
    private AvoirAchatAdminService avoirAchatService ;
    @Autowired
    private ProduitAdminService produitService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public AvoirAchatItemAdminServiceImpl(AvoirAchatItemDao dao, AvoirAchatItemHistoryDao historyDao) {
        super(dao, historyDao);
    }

}