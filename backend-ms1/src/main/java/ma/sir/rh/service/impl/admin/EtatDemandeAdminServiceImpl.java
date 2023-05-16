package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.EtatDemande;
import ma.sir.rh.bean.history.EtatDemandeHistory;
import ma.sir.rh.dao.criteria.core.EtatDemandeCriteria;
import ma.sir.rh.dao.criteria.history.EtatDemandeHistoryCriteria;
import ma.sir.rh.dao.facade.core.EtatDemandeDao;
import ma.sir.rh.dao.facade.history.EtatDemandeHistoryDao;
import ma.sir.rh.dao.specification.core.EtatDemandeSpecification;
import ma.sir.rh.service.facade.admin.EtatDemandeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.EtatDemandeDto;





import java.util.List;
@Service
public class EtatDemandeAdminServiceImpl extends AbstractServiceImpl<EtatDemande,EtatDemandeHistory, EtatDemandeCriteria, EtatDemandeHistoryCriteria, EtatDemandeDao,
EtatDemandeHistoryDao> implements EtatDemandeAdminService {
    public static final String TEMPLATE = "template/etatDemande.vm";
    public static final String FILE_NAME = "etatDemande.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(EtatDemandeDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public EtatDemande findByReferenceEntity(EtatDemande t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatDemande.class,EtatDemandeHistory.class, EtatDemandeHistoryCriteria.class, EtatDemandeSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public EtatDemandeAdminServiceImpl(EtatDemandeDao dao, EtatDemandeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}