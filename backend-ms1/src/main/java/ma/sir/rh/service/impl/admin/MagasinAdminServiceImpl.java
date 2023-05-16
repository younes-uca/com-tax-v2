package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Magasin;
import ma.sir.rh.bean.history.MagasinHistory;
import ma.sir.rh.dao.criteria.core.MagasinCriteria;
import ma.sir.rh.dao.criteria.history.MagasinHistoryCriteria;
import ma.sir.rh.dao.facade.core.MagasinDao;
import ma.sir.rh.dao.facade.history.MagasinHistoryDao;
import ma.sir.rh.dao.specification.core.MagasinSpecification;
import ma.sir.rh.service.facade.admin.MagasinAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.MagasinDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.StoreAdminService ;


import java.util.List;
@Service
public class MagasinAdminServiceImpl extends AbstractServiceImpl<Magasin,MagasinHistory, MagasinCriteria, MagasinHistoryCriteria, MagasinDao,
MagasinHistoryDao> implements MagasinAdminService {
    public static final String TEMPLATE = "template/magasin.vm";
    public static final String FILE_NAME = "magasin.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(MagasinDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<Magasin> findByStoreId(Long id){
        return dao.findByStoreId(id);
    }
    public int deleteByStoreId(Long id){
        return dao.deleteByStoreId(id);
    }



    public void configure() {
        super.configure(Magasin.class,MagasinHistory.class, MagasinHistoryCriteria.class, MagasinSpecification.class);
    }

    @Autowired
    private StoreAdminService storeService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public MagasinAdminServiceImpl(MagasinDao dao, MagasinHistoryDao historyDao) {
        super(dao, historyDao);
    }

}