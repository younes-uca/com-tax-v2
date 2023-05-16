package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.EtatCommande;
import ma.sir.rh.bean.history.EtatCommandeHistory;
import ma.sir.rh.dao.criteria.core.EtatCommandeCriteria;
import ma.sir.rh.dao.criteria.history.EtatCommandeHistoryCriteria;
import ma.sir.rh.dao.facade.core.EtatCommandeDao;
import ma.sir.rh.dao.facade.history.EtatCommandeHistoryDao;
import ma.sir.rh.dao.specification.core.EtatCommandeSpecification;
import ma.sir.rh.service.facade.admin.EtatCommandeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.EtatCommandeDto;





import java.util.List;
@Service
public class EtatCommandeAdminServiceImpl extends AbstractServiceImpl<EtatCommande,EtatCommandeHistory, EtatCommandeCriteria, EtatCommandeHistoryCriteria, EtatCommandeDao,
EtatCommandeHistoryDao> implements EtatCommandeAdminService {
    public static final String TEMPLATE = "template/etatCommande.vm";
    public static final String FILE_NAME = "etatCommande.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(EtatCommandeDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public EtatCommande findByReferenceEntity(EtatCommande t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatCommande.class,EtatCommandeHistory.class, EtatCommandeHistoryCriteria.class, EtatCommandeSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public EtatCommandeAdminServiceImpl(EtatCommandeDao dao, EtatCommandeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}