package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Store;
import ma.sir.rh.bean.history.StoreHistory;
import ma.sir.rh.dao.criteria.core.StoreCriteria;
import ma.sir.rh.dao.criteria.history.StoreHistoryCriteria;
import ma.sir.rh.dao.facade.core.StoreDao;
import ma.sir.rh.dao.facade.history.StoreHistoryDao;
import ma.sir.rh.dao.specification.core.StoreSpecification;
import ma.sir.rh.service.facade.admin.StoreAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.StoreDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.SocieteAdminService ;


import java.util.List;
@Service
public class StoreAdminServiceImpl extends AbstractServiceImpl<Store,StoreHistory, StoreCriteria, StoreHistoryCriteria, StoreDao,
StoreHistoryDao> implements StoreAdminService {
    public static final String TEMPLATE = "template/store.vm";
    public static final String FILE_NAME = "store.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(StoreDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public Store findByReferenceEntity(Store t){
        return  dao.findByReference(t.getReference());
    }

    public List<Store> findBySocieteId(Long id){
        return dao.findBySocieteId(id);
    }
    public int deleteBySocieteId(Long id){
        return dao.deleteBySocieteId(id);
    }



    public void configure() {
        super.configure(Store.class,StoreHistory.class, StoreHistoryCriteria.class, StoreSpecification.class);
    }

    @Autowired
    private SocieteAdminService societeService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public StoreAdminServiceImpl(StoreDao dao, StoreHistoryDao historyDao) {
        super(dao, historyDao);
    }

}