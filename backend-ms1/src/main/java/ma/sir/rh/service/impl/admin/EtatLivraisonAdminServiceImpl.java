package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.EtatLivraison;
import ma.sir.rh.bean.history.EtatLivraisonHistory;
import ma.sir.rh.dao.criteria.core.EtatLivraisonCriteria;
import ma.sir.rh.dao.criteria.history.EtatLivraisonHistoryCriteria;
import ma.sir.rh.dao.facade.core.EtatLivraisonDao;
import ma.sir.rh.dao.facade.history.EtatLivraisonHistoryDao;
import ma.sir.rh.dao.specification.core.EtatLivraisonSpecification;
import ma.sir.rh.service.facade.admin.EtatLivraisonAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.EtatLivraisonDto;





import java.util.List;
@Service
public class EtatLivraisonAdminServiceImpl extends AbstractServiceImpl<EtatLivraison,EtatLivraisonHistory, EtatLivraisonCriteria, EtatLivraisonHistoryCriteria, EtatLivraisonDao,
EtatLivraisonHistoryDao> implements EtatLivraisonAdminService {
    public static final String TEMPLATE = "template/etatLivraison.vm";
    public static final String FILE_NAME = "etatLivraison.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(EtatLivraisonDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public EtatLivraison findByReferenceEntity(EtatLivraison t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatLivraison.class,EtatLivraisonHistory.class, EtatLivraisonHistoryCriteria.class, EtatLivraisonSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public EtatLivraisonAdminServiceImpl(EtatLivraisonDao dao, EtatLivraisonHistoryDao historyDao) {
        super(dao, historyDao);
    }

}