package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.EtatReception;
import ma.sir.rh.bean.history.EtatReceptionHistory;
import ma.sir.rh.dao.criteria.core.EtatReceptionCriteria;
import ma.sir.rh.dao.criteria.history.EtatReceptionHistoryCriteria;
import ma.sir.rh.dao.facade.core.EtatReceptionDao;
import ma.sir.rh.dao.facade.history.EtatReceptionHistoryDao;
import ma.sir.rh.dao.specification.core.EtatReceptionSpecification;
import ma.sir.rh.service.facade.admin.EtatReceptionAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.EtatReceptionDto;





import java.util.List;
@Service
public class EtatReceptionAdminServiceImpl extends AbstractServiceImpl<EtatReception,EtatReceptionHistory, EtatReceptionCriteria, EtatReceptionHistoryCriteria, EtatReceptionDao,
EtatReceptionHistoryDao> implements EtatReceptionAdminService {
    public static final String TEMPLATE = "template/etatReception.vm";
    public static final String FILE_NAME = "etatReception.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(EtatReceptionDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public EtatReception findByReferenceEntity(EtatReception t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatReception.class,EtatReceptionHistory.class, EtatReceptionHistoryCriteria.class, EtatReceptionSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public EtatReceptionAdminServiceImpl(EtatReceptionDao dao, EtatReceptionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}