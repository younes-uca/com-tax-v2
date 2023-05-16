package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.StockProduit;
import ma.sir.rh.bean.history.StockProduitHistory;
import ma.sir.rh.dao.criteria.core.StockProduitCriteria;
import ma.sir.rh.dao.criteria.history.StockProduitHistoryCriteria;
import ma.sir.rh.dao.facade.core.StockProduitDao;
import ma.sir.rh.dao.facade.history.StockProduitHistoryDao;
import ma.sir.rh.dao.specification.core.StockProduitSpecification;
import ma.sir.rh.service.facade.admin.StockProduitAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.StockProduitDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.MagasinAdminService ;
import ma.sir.rh.service.facade.admin.ProduitAdminService ;


import java.util.List;
@Service
public class StockProduitAdminServiceImpl extends AbstractServiceImpl<StockProduit,StockProduitHistory, StockProduitCriteria, StockProduitHistoryCriteria, StockProduitDao,
StockProduitHistoryDao> implements StockProduitAdminService {
    public static final String TEMPLATE = "template/stockProduit.vm";
    public static final String FILE_NAME = "stockProduit.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(StockProduitDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<StockProduit> findByMagasinId(Long id){
        return dao.findByMagasinId(id);
    }
    public int deleteByMagasinId(Long id){
        return dao.deleteByMagasinId(id);
    }
    public List<StockProduit> findByProduitId(Long id){
        return dao.findByProduitId(id);
    }
    public int deleteByProduitId(Long id){
        return dao.deleteByProduitId(id);
    }



    public void configure() {
        super.configure(StockProduit.class,StockProduitHistory.class, StockProduitHistoryCriteria.class, StockProduitSpecification.class);
    }

    @Autowired
    private MagasinAdminService magasinService ;
    @Autowired
    private ProduitAdminService produitService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public StockProduitAdminServiceImpl(StockProduitDao dao, StockProduitHistoryDao historyDao) {
        super(dao, historyDao);
    }

}