package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.DemandeItem;
import ma.sir.rh.bean.history.DemandeItemHistory;
import ma.sir.rh.dao.criteria.core.DemandeItemCriteria;
import ma.sir.rh.dao.criteria.history.DemandeItemHistoryCriteria;
import ma.sir.rh.dao.facade.core.DemandeItemDao;
import ma.sir.rh.dao.facade.history.DemandeItemHistoryDao;
import ma.sir.rh.dao.specification.core.DemandeItemSpecification;
import ma.sir.rh.service.facade.admin.DemandeItemAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.DemandeItemDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.DemandeAdminService ;
import ma.sir.rh.service.facade.admin.ProduitAdminService ;


import java.util.List;
@Service
public class DemandeItemAdminServiceImpl extends AbstractServiceImpl<DemandeItem,DemandeItemHistory, DemandeItemCriteria, DemandeItemHistoryCriteria, DemandeItemDao,
DemandeItemHistoryDao> implements DemandeItemAdminService {
    public static final String TEMPLATE = "template/demandeItem.vm";
    public static final String FILE_NAME = "demandeItem.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(DemandeItemDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<DemandeItem> findByProduitId(Long id){
        return dao.findByProduitId(id);
    }
    public int deleteByProduitId(Long id){
        return dao.deleteByProduitId(id);
    }
    public List<DemandeItem> findByDemandeId(Long id){
        return dao.findByDemandeId(id);
    }
    public int deleteByDemandeId(Long id){
        return dao.deleteByDemandeId(id);
    }



    public void configure() {
        super.configure(DemandeItem.class,DemandeItemHistory.class, DemandeItemHistoryCriteria.class, DemandeItemSpecification.class);
    }

    @Autowired
    private DemandeAdminService demandeService ;
    @Autowired
    private ProduitAdminService produitService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public DemandeItemAdminServiceImpl(DemandeItemDao dao, DemandeItemHistoryDao historyDao) {
        super(dao, historyDao);
    }

}