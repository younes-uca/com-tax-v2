package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.ComptableValidateur;
import ma.sir.rh.bean.history.ComptableValidateurHistory;
import ma.sir.rh.dao.criteria.core.ComptableValidateurCriteria;
import ma.sir.rh.dao.criteria.history.ComptableValidateurHistoryCriteria;
import ma.sir.rh.dao.facade.core.ComptableValidateurDao;
import ma.sir.rh.dao.facade.history.ComptableValidateurHistoryDao;
import ma.sir.rh.dao.specification.core.ComptableValidateurSpecification;
import ma.sir.rh.service.facade.admin.ComptableValidateurAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.ComptableValidateurDto;





import java.util.List;
@Service
public class ComptableValidateurAdminServiceImpl extends AbstractServiceImpl<ComptableValidateur,ComptableValidateurHistory, ComptableValidateurCriteria, ComptableValidateurHistoryCriteria, ComptableValidateurDao,
ComptableValidateurHistoryDao> implements ComptableValidateurAdminService {
    public static final String TEMPLATE = "template/comptableValidateur.vm";
    public static final String FILE_NAME = "comptableValidateur.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(ComptableValidateurDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }






    public void configure() {
        super.configure(ComptableValidateur.class,ComptableValidateurHistory.class, ComptableValidateurHistoryCriteria.class, ComptableValidateurSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public ComptableValidateurAdminServiceImpl(ComptableValidateurDao dao, ComptableValidateurHistoryDao historyDao) {
        super(dao, historyDao);
    }

}