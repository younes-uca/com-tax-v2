package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.EtatPaiementVente;
import ma.sir.rh.bean.history.EtatPaiementVenteHistory;
import ma.sir.rh.dao.criteria.core.EtatPaiementVenteCriteria;
import ma.sir.rh.dao.criteria.history.EtatPaiementVenteHistoryCriteria;
import ma.sir.rh.dao.facade.core.EtatPaiementVenteDao;
import ma.sir.rh.dao.facade.history.EtatPaiementVenteHistoryDao;
import ma.sir.rh.dao.specification.core.EtatPaiementVenteSpecification;
import ma.sir.rh.service.facade.admin.EtatPaiementVenteAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.EtatPaiementVenteDto;





import java.util.List;
@Service
public class EtatPaiementVenteAdminServiceImpl extends AbstractServiceImpl<EtatPaiementVente,EtatPaiementVenteHistory, EtatPaiementVenteCriteria, EtatPaiementVenteHistoryCriteria, EtatPaiementVenteDao,
EtatPaiementVenteHistoryDao> implements EtatPaiementVenteAdminService {
    public static final String TEMPLATE = "template/etatPaiementVente.vm";
    public static final String FILE_NAME = "etatPaiementVente.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(EtatPaiementVenteDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public EtatPaiementVente findByReferenceEntity(EtatPaiementVente t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatPaiementVente.class,EtatPaiementVenteHistory.class, EtatPaiementVenteHistoryCriteria.class, EtatPaiementVenteSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public EtatPaiementVenteAdminServiceImpl(EtatPaiementVenteDao dao, EtatPaiementVenteHistoryDao historyDao) {
        super(dao, historyDao);
    }

}