package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.ComptableTraitant;
import ma.sir.rh.bean.history.ComptableTraitantHistory;
import ma.sir.rh.dao.criteria.core.ComptableTraitantCriteria;
import ma.sir.rh.dao.criteria.history.ComptableTraitantHistoryCriteria;
import ma.sir.rh.dao.facade.core.ComptableTraitantDao;
import ma.sir.rh.dao.facade.history.ComptableTraitantHistoryDao;
import ma.sir.rh.dao.specification.core.ComptableTraitantSpecification;
import ma.sir.rh.service.facade.admin.ComptableTraitantAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.ComptableTraitantDto;





import java.util.List;
@Service
public class ComptableTraitantAdminServiceImpl extends AbstractServiceImpl<ComptableTraitant,ComptableTraitantHistory, ComptableTraitantCriteria, ComptableTraitantHistoryCriteria, ComptableTraitantDao,
ComptableTraitantHistoryDao> implements ComptableTraitantAdminService {
    public static final String TEMPLATE = "template/comptableTraitant.vm";
    public static final String FILE_NAME = "comptableTraitant.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(ComptableTraitantDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }






    public void configure() {
        super.configure(ComptableTraitant.class,ComptableTraitantHistory.class, ComptableTraitantHistoryCriteria.class, ComptableTraitantSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public ComptableTraitantAdminServiceImpl(ComptableTraitantDao dao, ComptableTraitantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}