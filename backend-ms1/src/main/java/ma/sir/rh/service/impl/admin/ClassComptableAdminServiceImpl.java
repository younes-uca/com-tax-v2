package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.ClassComptable;
import ma.sir.rh.bean.history.ClassComptableHistory;
import ma.sir.rh.dao.criteria.core.ClassComptableCriteria;
import ma.sir.rh.dao.criteria.history.ClassComptableHistoryCriteria;
import ma.sir.rh.dao.facade.core.ClassComptableDao;
import ma.sir.rh.dao.facade.history.ClassComptableHistoryDao;
import ma.sir.rh.dao.specification.core.ClassComptableSpecification;
import ma.sir.rh.service.facade.admin.ClassComptableAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.ClassComptableDto;





import java.util.List;
@Service
public class ClassComptableAdminServiceImpl extends AbstractServiceImpl<ClassComptable,ClassComptableHistory, ClassComptableCriteria, ClassComptableHistoryCriteria, ClassComptableDao,
ClassComptableHistoryDao> implements ClassComptableAdminService {
    public static final String TEMPLATE = "template/classComptable.vm";
    public static final String FILE_NAME = "classComptable.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(ClassComptableDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }






    public void configure() {
        super.configure(ClassComptable.class,ClassComptableHistory.class, ClassComptableHistoryCriteria.class, ClassComptableSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public ClassComptableAdminServiceImpl(ClassComptableDao dao, ClassComptableHistoryDao historyDao) {
        super(dao, historyDao);
    }

}