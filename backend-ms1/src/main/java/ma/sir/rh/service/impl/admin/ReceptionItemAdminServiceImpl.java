package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.ReceptionItem;
import ma.sir.rh.bean.history.ReceptionItemHistory;
import ma.sir.rh.dao.criteria.core.ReceptionItemCriteria;
import ma.sir.rh.dao.criteria.history.ReceptionItemHistoryCriteria;
import ma.sir.rh.dao.facade.core.ReceptionItemDao;
import ma.sir.rh.dao.facade.history.ReceptionItemHistoryDao;
import ma.sir.rh.dao.specification.core.ReceptionItemSpecification;
import ma.sir.rh.service.facade.admin.ReceptionItemAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.ReceptionItemDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.MagasinAdminService ;
import ma.sir.rh.service.facade.admin.ProduitAdminService ;
import ma.sir.rh.service.facade.admin.ReceptionAdminService ;


import java.util.List;
@Service
public class ReceptionItemAdminServiceImpl extends AbstractServiceImpl<ReceptionItem,ReceptionItemHistory, ReceptionItemCriteria, ReceptionItemHistoryCriteria, ReceptionItemDao,
ReceptionItemHistoryDao> implements ReceptionItemAdminService {
    public static final String TEMPLATE = "template/receptionItem.vm";
    public static final String FILE_NAME = "receptionItem.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(ReceptionItemDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<ReceptionItem> findByProduitId(Long id){
        return dao.findByProduitId(id);
    }
    public int deleteByProduitId(Long id){
        return dao.deleteByProduitId(id);
    }
    public List<ReceptionItem> findByMagasinId(Long id){
        return dao.findByMagasinId(id);
    }
    public int deleteByMagasinId(Long id){
        return dao.deleteByMagasinId(id);
    }
    public List<ReceptionItem> findByReceptionId(Long id){
        return dao.findByReceptionId(id);
    }
    public int deleteByReceptionId(Long id){
        return dao.deleteByReceptionId(id);
    }



    public void configure() {
        super.configure(ReceptionItem.class,ReceptionItemHistory.class, ReceptionItemHistoryCriteria.class, ReceptionItemSpecification.class);
    }

    @Autowired
    private MagasinAdminService magasinService ;
    @Autowired
    private ProduitAdminService produitService ;
    @Autowired
    private ReceptionAdminService receptionService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public ReceptionItemAdminServiceImpl(ReceptionItemDao dao, ReceptionItemHistoryDao historyDao) {
        super(dao, historyDao);
    }

}