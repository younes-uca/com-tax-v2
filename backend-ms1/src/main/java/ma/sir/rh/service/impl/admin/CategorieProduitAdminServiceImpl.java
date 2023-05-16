package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.CategorieProduit;
import ma.sir.rh.bean.history.CategorieProduitHistory;
import ma.sir.rh.dao.criteria.core.CategorieProduitCriteria;
import ma.sir.rh.dao.criteria.history.CategorieProduitHistoryCriteria;
import ma.sir.rh.dao.facade.core.CategorieProduitDao;
import ma.sir.rh.dao.facade.history.CategorieProduitHistoryDao;
import ma.sir.rh.dao.specification.core.CategorieProduitSpecification;
import ma.sir.rh.service.facade.admin.CategorieProduitAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.CategorieProduitDto;





import java.util.List;
@Service
public class CategorieProduitAdminServiceImpl extends AbstractServiceImpl<CategorieProduit,CategorieProduitHistory, CategorieProduitCriteria, CategorieProduitHistoryCriteria, CategorieProduitDao,
CategorieProduitHistoryDao> implements CategorieProduitAdminService {
    public static final String TEMPLATE = "template/categorieProduit.vm";
    public static final String FILE_NAME = "categorieProduit.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(CategorieProduitDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public CategorieProduit findByReferenceEntity(CategorieProduit t){
        return  dao.findByReference(t.getReference());
    }




    public void configure() {
        super.configure(CategorieProduit.class,CategorieProduitHistory.class, CategorieProduitHistoryCriteria.class, CategorieProduitSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public CategorieProduitAdminServiceImpl(CategorieProduitDao dao, CategorieProduitHistoryDao historyDao) {
        super(dao, historyDao);
    }

}