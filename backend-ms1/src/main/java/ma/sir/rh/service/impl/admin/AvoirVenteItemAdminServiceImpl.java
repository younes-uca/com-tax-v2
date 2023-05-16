package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.AvoirVenteItem;
import ma.sir.rh.bean.history.AvoirVenteItemHistory;
import ma.sir.rh.dao.criteria.core.AvoirVenteItemCriteria;
import ma.sir.rh.dao.criteria.history.AvoirVenteItemHistoryCriteria;
import ma.sir.rh.dao.facade.core.AvoirVenteItemDao;
import ma.sir.rh.dao.facade.history.AvoirVenteItemHistoryDao;
import ma.sir.rh.dao.specification.core.AvoirVenteItemSpecification;
import ma.sir.rh.service.facade.admin.AvoirVenteItemAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.AvoirVenteItemDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.AvoirVenteAdminService ;
import ma.sir.rh.service.facade.admin.ProduitAdminService ;


import java.util.List;
@Service
public class AvoirVenteItemAdminServiceImpl extends AbstractServiceImpl<AvoirVenteItem,AvoirVenteItemHistory, AvoirVenteItemCriteria, AvoirVenteItemHistoryCriteria, AvoirVenteItemDao,
AvoirVenteItemHistoryDao> implements AvoirVenteItemAdminService {
    public static final String TEMPLATE = "template/avoirVenteItem.vm";
    public static final String FILE_NAME = "avoirVenteItem.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(AvoirVenteItemDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<AvoirVenteItem> findByProduitId(Long id){
        return dao.findByProduitId(id);
    }
    public int deleteByProduitId(Long id){
        return dao.deleteByProduitId(id);
    }
    public List<AvoirVenteItem> findByAvoirVenteId(Long id){
        return dao.findByAvoirVenteId(id);
    }
    public int deleteByAvoirVenteId(Long id){
        return dao.deleteByAvoirVenteId(id);
    }



    public void configure() {
        super.configure(AvoirVenteItem.class,AvoirVenteItemHistory.class, AvoirVenteItemHistoryCriteria.class, AvoirVenteItemSpecification.class);
    }

    @Autowired
    private AvoirVenteAdminService avoirVenteService ;
    @Autowired
    private ProduitAdminService produitService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public AvoirVenteItemAdminServiceImpl(AvoirVenteItemDao dao, AvoirVenteItemHistoryDao historyDao) {
        super(dao, historyDao);
    }

}