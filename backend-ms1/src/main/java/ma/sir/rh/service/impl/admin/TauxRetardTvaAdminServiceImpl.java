package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.TauxRetardTva;
import ma.sir.rh.bean.history.TauxRetardTvaHistory;
import ma.sir.rh.dao.criteria.core.TauxRetardTvaCriteria;
import ma.sir.rh.dao.criteria.history.TauxRetardTvaHistoryCriteria;
import ma.sir.rh.dao.facade.core.TauxRetardTvaDao;
import ma.sir.rh.dao.facade.history.TauxRetardTvaHistoryDao;
import ma.sir.rh.dao.specification.core.TauxRetardTvaSpecification;
import ma.sir.rh.service.facade.admin.TauxRetardTvaAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.TauxRetardTvaDto;





import java.util.List;
@Service
public class TauxRetardTvaAdminServiceImpl extends AbstractServiceImpl<TauxRetardTva,TauxRetardTvaHistory, TauxRetardTvaCriteria, TauxRetardTvaHistoryCriteria, TauxRetardTvaDao,
TauxRetardTvaHistoryDao> implements TauxRetardTvaAdminService {
    public static final String TEMPLATE = "template/tauxRetardTva.vm";
    public static final String FILE_NAME = "tauxRetardTva.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(TauxRetardTvaDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }






    public void configure() {
        super.configure(TauxRetardTva.class,TauxRetardTvaHistory.class, TauxRetardTvaHistoryCriteria.class, TauxRetardTvaSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public TauxRetardTvaAdminServiceImpl(TauxRetardTvaDao dao, TauxRetardTvaHistoryDao historyDao) {
        super(dao, historyDao);
    }

}