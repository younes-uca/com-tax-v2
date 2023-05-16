package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Banque;
import ma.sir.rh.bean.history.BanqueHistory;
import ma.sir.rh.dao.criteria.core.BanqueCriteria;
import ma.sir.rh.dao.criteria.history.BanqueHistoryCriteria;
import ma.sir.rh.dao.facade.core.BanqueDao;
import ma.sir.rh.dao.facade.history.BanqueHistoryDao;
import ma.sir.rh.dao.specification.core.BanqueSpecification;
import ma.sir.rh.service.facade.admin.BanqueAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.BanqueDto;





import java.util.List;
@Service
public class BanqueAdminServiceImpl extends AbstractServiceImpl<Banque,BanqueHistory, BanqueCriteria, BanqueHistoryCriteria, BanqueDao,
BanqueHistoryDao> implements BanqueAdminService {
    public static final String TEMPLATE = "template/banque.vm";
    public static final String FILE_NAME = "banque.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(BanqueDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }






    public void configure() {
        super.configure(Banque.class,BanqueHistory.class, BanqueHistoryCriteria.class, BanqueSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public BanqueAdminServiceImpl(BanqueDao dao, BanqueHistoryDao historyDao) {
        super(dao, historyDao);
    }

}