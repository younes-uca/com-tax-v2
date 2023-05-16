package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.EtatPaiementLivraison;
import ma.sir.rh.bean.history.EtatPaiementLivraisonHistory;
import ma.sir.rh.dao.criteria.core.EtatPaiementLivraisonCriteria;
import ma.sir.rh.dao.criteria.history.EtatPaiementLivraisonHistoryCriteria;
import ma.sir.rh.dao.facade.core.EtatPaiementLivraisonDao;
import ma.sir.rh.dao.facade.history.EtatPaiementLivraisonHistoryDao;
import ma.sir.rh.dao.specification.core.EtatPaiementLivraisonSpecification;
import ma.sir.rh.service.facade.admin.EtatPaiementLivraisonAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.EtatPaiementLivraisonDto;





import java.util.List;
@Service
public class EtatPaiementLivraisonAdminServiceImpl extends AbstractServiceImpl<EtatPaiementLivraison,EtatPaiementLivraisonHistory, EtatPaiementLivraisonCriteria, EtatPaiementLivraisonHistoryCriteria, EtatPaiementLivraisonDao,
EtatPaiementLivraisonHistoryDao> implements EtatPaiementLivraisonAdminService {
    public static final String TEMPLATE = "template/etatPaiementLivraison.vm";
    public static final String FILE_NAME = "etatPaiementLivraison.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(EtatPaiementLivraisonDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public EtatPaiementLivraison findByReferenceEntity(EtatPaiementLivraison t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatPaiementLivraison.class,EtatPaiementLivraisonHistory.class, EtatPaiementLivraisonHistoryCriteria.class, EtatPaiementLivraisonSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public EtatPaiementLivraisonAdminServiceImpl(EtatPaiementLivraisonDao dao, EtatPaiementLivraisonHistoryDao historyDao) {
        super(dao, historyDao);
    }

}