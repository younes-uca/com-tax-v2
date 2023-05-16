package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.OperationComptable;
import ma.sir.rh.bean.history.OperationComptableHistory;
import ma.sir.rh.dao.criteria.core.OperationComptableCriteria;
import ma.sir.rh.dao.criteria.history.OperationComptableHistoryCriteria;
import ma.sir.rh.dao.facade.core.OperationComptableDao;
import ma.sir.rh.dao.facade.history.OperationComptableHistoryDao;
import ma.sir.rh.dao.specification.core.OperationComptableSpecification;
import ma.sir.rh.service.facade.admin.OperationComptableAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.OperationComptableDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.SocieteAdminService ;
import ma.sir.rh.service.facade.admin.CompteComptableAdminService ;


import java.util.List;
@Service
public class OperationComptableAdminServiceImpl extends AbstractServiceImpl<OperationComptable,OperationComptableHistory, OperationComptableCriteria, OperationComptableHistoryCriteria, OperationComptableDao,
OperationComptableHistoryDao> implements OperationComptableAdminService {
    public static final String TEMPLATE = "template/operationComptable.vm";
    public static final String FILE_NAME = "operationComptable.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(OperationComptableDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<OperationComptable> findBySocieteId(Long id){
        return dao.findBySocieteId(id);
    }
    public int deleteBySocieteId(Long id){
        return dao.deleteBySocieteId(id);
    }
    public List<OperationComptable> findByCompteComptableId(Long id){
        return dao.findByCompteComptableId(id);
    }
    public int deleteByCompteComptableId(Long id){
        return dao.deleteByCompteComptableId(id);
    }



    public void configure() {
        super.configure(OperationComptable.class,OperationComptableHistory.class, OperationComptableHistoryCriteria.class, OperationComptableSpecification.class);
    }

    @Autowired
    private SocieteAdminService societeService ;
    @Autowired
    private CompteComptableAdminService compteComptableService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public OperationComptableAdminServiceImpl(OperationComptableDao dao, OperationComptableHistoryDao historyDao) {
        super(dao, historyDao);
    }

}