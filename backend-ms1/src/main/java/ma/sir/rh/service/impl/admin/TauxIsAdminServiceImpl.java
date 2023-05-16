package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.TauxIs;
import ma.sir.rh.bean.history.TauxIsHistory;
import ma.sir.rh.dao.criteria.core.TauxIsCriteria;
import ma.sir.rh.dao.criteria.history.TauxIsHistoryCriteria;
import ma.sir.rh.dao.facade.core.TauxIsDao;
import ma.sir.rh.dao.facade.history.TauxIsHistoryDao;
import ma.sir.rh.dao.specification.core.TauxIsSpecification;
import ma.sir.rh.service.facade.admin.TauxIsAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.TauxIsDto;





import java.util.List;
@Service
public class TauxIsAdminServiceImpl extends AbstractServiceImpl<TauxIs,TauxIsHistory, TauxIsCriteria, TauxIsHistoryCriteria, TauxIsDao,
TauxIsHistoryDao> implements TauxIsAdminService {
    public static final String TEMPLATE = "template/tauxIs.vm";
    public static final String FILE_NAME = "tauxIs.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(TauxIsDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }






    public void configure() {
        super.configure(TauxIs.class,TauxIsHistory.class, TauxIsHistoryCriteria.class, TauxIsSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public TauxIsAdminServiceImpl(TauxIsDao dao, TauxIsHistoryDao historyDao) {
        super(dao, historyDao);
    }

}