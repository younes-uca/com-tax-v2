package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.AchatItem;
import ma.sir.rh.bean.history.AchatItemHistory;
import ma.sir.rh.dao.criteria.core.AchatItemCriteria;
import ma.sir.rh.dao.criteria.history.AchatItemHistoryCriteria;
import ma.sir.rh.dao.facade.core.AchatItemDao;
import ma.sir.rh.dao.facade.history.AchatItemHistoryDao;
import ma.sir.rh.dao.specification.core.AchatItemSpecification;
import ma.sir.rh.service.facade.admin.AchatItemAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.AchatItemDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.AchatAdminService ;
import ma.sir.rh.service.facade.admin.ProduitAdminService ;


import java.util.List;
@Service
public class AchatItemAdminServiceImpl extends AbstractServiceImpl<AchatItem,AchatItemHistory, AchatItemCriteria, AchatItemHistoryCriteria, AchatItemDao,
AchatItemHistoryDao> implements AchatItemAdminService {
    public static final String TEMPLATE = "template/achatItem.vm";
    public static final String FILE_NAME = "achatItem.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(AchatItemDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<AchatItem> findByProduitId(Long id){
        return dao.findByProduitId(id);
    }
    public int deleteByProduitId(Long id){
        return dao.deleteByProduitId(id);
    }
    public List<AchatItem> findByAchatId(Long id){
        return dao.findByAchatId(id);
    }
    public int deleteByAchatId(Long id){
        return dao.deleteByAchatId(id);
    }



    public void configure() {
        super.configure(AchatItem.class,AchatItemHistory.class, AchatItemHistoryCriteria.class, AchatItemSpecification.class);
    }

    @Autowired
    private AchatAdminService achatService ;
    @Autowired
    private ProduitAdminService produitService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public AchatItemAdminServiceImpl(AchatItemDao dao, AchatItemHistoryDao historyDao) {
        super(dao, historyDao);
    }

}