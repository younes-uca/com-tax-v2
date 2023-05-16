package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.ProprietaireCheque;
import ma.sir.rh.bean.history.ProprietaireChequeHistory;
import ma.sir.rh.dao.criteria.core.ProprietaireChequeCriteria;
import ma.sir.rh.dao.criteria.history.ProprietaireChequeHistoryCriteria;
import ma.sir.rh.dao.facade.core.ProprietaireChequeDao;
import ma.sir.rh.dao.facade.history.ProprietaireChequeHistoryDao;
import ma.sir.rh.dao.specification.core.ProprietaireChequeSpecification;
import ma.sir.rh.service.facade.admin.ProprietaireChequeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.ProprietaireChequeDto;





import java.util.List;
@Service
public class ProprietaireChequeAdminServiceImpl extends AbstractServiceImpl<ProprietaireCheque,ProprietaireChequeHistory, ProprietaireChequeCriteria, ProprietaireChequeHistoryCriteria, ProprietaireChequeDao,
ProprietaireChequeHistoryDao> implements ProprietaireChequeAdminService {
    public static final String TEMPLATE = "template/proprietaireCheque.vm";
    public static final String FILE_NAME = "proprietaireCheque.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(ProprietaireChequeDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }






    public void configure() {
        super.configure(ProprietaireCheque.class,ProprietaireChequeHistory.class, ProprietaireChequeHistoryCriteria.class, ProprietaireChequeSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public ProprietaireChequeAdminServiceImpl(ProprietaireChequeDao dao, ProprietaireChequeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}