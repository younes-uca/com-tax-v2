package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Fournisseur;
import ma.sir.rh.bean.history.FournisseurHistory;
import ma.sir.rh.dao.criteria.core.FournisseurCriteria;
import ma.sir.rh.dao.criteria.history.FournisseurHistoryCriteria;
import ma.sir.rh.dao.facade.core.FournisseurDao;
import ma.sir.rh.dao.facade.history.FournisseurHistoryDao;
import ma.sir.rh.dao.specification.core.FournisseurSpecification;
import ma.sir.rh.service.facade.admin.FournisseurAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.FournisseurDto;





import java.util.List;
@Service
public class FournisseurAdminServiceImpl extends AbstractServiceImpl<Fournisseur,FournisseurHistory, FournisseurCriteria, FournisseurHistoryCriteria, FournisseurDao,
FournisseurHistoryDao> implements FournisseurAdminService {
    public static final String TEMPLATE = "template/fournisseur.vm";
    public static final String FILE_NAME = "fournisseur.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(FournisseurDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public Fournisseur findByReferenceEntity(Fournisseur t){
        return  dao.findByIce(t.getIce());
    }




    public void configure() {
        super.configure(Fournisseur.class,FournisseurHistory.class, FournisseurHistoryCriteria.class, FournisseurSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public FournisseurAdminServiceImpl(FournisseurDao dao, FournisseurHistoryDao historyDao) {
        super(dao, historyDao);
    }

}