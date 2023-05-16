package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Marque;
import ma.sir.rh.bean.history.MarqueHistory;
import ma.sir.rh.dao.criteria.core.MarqueCriteria;
import ma.sir.rh.dao.criteria.history.MarqueHistoryCriteria;
import ma.sir.rh.dao.facade.core.MarqueDao;
import ma.sir.rh.dao.facade.history.MarqueHistoryDao;
import ma.sir.rh.dao.specification.core.MarqueSpecification;
import ma.sir.rh.service.facade.admin.MarqueAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.MarqueDto;





import java.util.List;
@Service
public class MarqueAdminServiceImpl extends AbstractServiceImpl<Marque,MarqueHistory, MarqueCriteria, MarqueHistoryCriteria, MarqueDao,
MarqueHistoryDao> implements MarqueAdminService {
    public static final String TEMPLATE = "template/marque.vm";
    public static final String FILE_NAME = "marque.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(MarqueDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public Marque findByReferenceEntity(Marque t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Marque.class,MarqueHistory.class, MarqueHistoryCriteria.class, MarqueSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public MarqueAdminServiceImpl(MarqueDao dao, MarqueHistoryDao historyDao) {
        super(dao, historyDao);
    }

}