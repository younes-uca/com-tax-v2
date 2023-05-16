package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.EtatVente;
import ma.sir.rh.bean.history.EtatVenteHistory;
import ma.sir.rh.dao.criteria.core.EtatVenteCriteria;
import ma.sir.rh.dao.criteria.history.EtatVenteHistoryCriteria;
import ma.sir.rh.dao.facade.core.EtatVenteDao;
import ma.sir.rh.dao.facade.history.EtatVenteHistoryDao;
import ma.sir.rh.dao.specification.core.EtatVenteSpecification;
import ma.sir.rh.service.facade.admin.EtatVenteAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.EtatVenteDto;





import java.util.List;
@Service
public class EtatVenteAdminServiceImpl extends AbstractServiceImpl<EtatVente,EtatVenteHistory, EtatVenteCriteria, EtatVenteHistoryCriteria, EtatVenteDao,
EtatVenteHistoryDao> implements EtatVenteAdminService {
    public static final String TEMPLATE = "template/etatVente.vm";
    public static final String FILE_NAME = "etatVente.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(EtatVenteDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public EtatVente findByReferenceEntity(EtatVente t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatVente.class,EtatVenteHistory.class, EtatVenteHistoryCriteria.class, EtatVenteSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public EtatVenteAdminServiceImpl(EtatVenteDao dao, EtatVenteHistoryDao historyDao) {
        super(dao, historyDao);
    }

}