package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.EtatPaiementCommande;
import ma.sir.rh.bean.history.EtatPaiementCommandeHistory;
import ma.sir.rh.dao.criteria.core.EtatPaiementCommandeCriteria;
import ma.sir.rh.dao.criteria.history.EtatPaiementCommandeHistoryCriteria;
import ma.sir.rh.dao.facade.core.EtatPaiementCommandeDao;
import ma.sir.rh.dao.facade.history.EtatPaiementCommandeHistoryDao;
import ma.sir.rh.dao.specification.core.EtatPaiementCommandeSpecification;
import ma.sir.rh.service.facade.admin.EtatPaiementCommandeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.EtatPaiementCommandeDto;





import java.util.List;
@Service
public class EtatPaiementCommandeAdminServiceImpl extends AbstractServiceImpl<EtatPaiementCommande,EtatPaiementCommandeHistory, EtatPaiementCommandeCriteria, EtatPaiementCommandeHistoryCriteria, EtatPaiementCommandeDao,
EtatPaiementCommandeHistoryDao> implements EtatPaiementCommandeAdminService {
    public static final String TEMPLATE = "template/etatPaiementCommande.vm";
    public static final String FILE_NAME = "etatPaiementCommande.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(EtatPaiementCommandeDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public EtatPaiementCommande findByReferenceEntity(EtatPaiementCommande t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatPaiementCommande.class,EtatPaiementCommandeHistory.class, EtatPaiementCommandeHistoryCriteria.class, EtatPaiementCommandeSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public EtatPaiementCommandeAdminServiceImpl(EtatPaiementCommandeDao dao, EtatPaiementCommandeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}