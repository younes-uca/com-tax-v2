package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.EtatAvoirVente;
import ma.sir.rh.bean.history.EtatAvoirVenteHistory;
import ma.sir.rh.dao.criteria.core.EtatAvoirVenteCriteria;
import ma.sir.rh.dao.criteria.history.EtatAvoirVenteHistoryCriteria;
import ma.sir.rh.dao.facade.core.EtatAvoirVenteDao;
import ma.sir.rh.dao.facade.history.EtatAvoirVenteHistoryDao;
import ma.sir.rh.dao.specification.core.EtatAvoirVenteSpecification;
import ma.sir.rh.service.facade.admin.EtatAvoirVenteAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.EtatAvoirVenteDto;





import java.util.List;
@Service
public class EtatAvoirVenteAdminServiceImpl extends AbstractServiceImpl<EtatAvoirVente,EtatAvoirVenteHistory, EtatAvoirVenteCriteria, EtatAvoirVenteHistoryCriteria, EtatAvoirVenteDao,
EtatAvoirVenteHistoryDao> implements EtatAvoirVenteAdminService {
    public static final String TEMPLATE = "template/etatAvoirVente.vm";
    public static final String FILE_NAME = "etatAvoirVente.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(EtatAvoirVenteDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public EtatAvoirVente findByReferenceEntity(EtatAvoirVente t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatAvoirVente.class,EtatAvoirVenteHistory.class, EtatAvoirVenteHistoryCriteria.class, EtatAvoirVenteSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public EtatAvoirVenteAdminServiceImpl(EtatAvoirVenteDao dao, EtatAvoirVenteHistoryDao historyDao) {
        super(dao, historyDao);
    }

}