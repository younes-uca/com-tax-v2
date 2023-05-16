package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.ModePaiement;
import ma.sir.rh.bean.history.ModePaiementHistory;
import ma.sir.rh.dao.criteria.core.ModePaiementCriteria;
import ma.sir.rh.dao.criteria.history.ModePaiementHistoryCriteria;
import ma.sir.rh.dao.facade.core.ModePaiementDao;
import ma.sir.rh.dao.facade.history.ModePaiementHistoryDao;
import ma.sir.rh.dao.specification.core.ModePaiementSpecification;
import ma.sir.rh.service.facade.admin.ModePaiementAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.ModePaiementDto;





import java.util.List;
@Service
public class ModePaiementAdminServiceImpl extends AbstractServiceImpl<ModePaiement,ModePaiementHistory, ModePaiementCriteria, ModePaiementHistoryCriteria, ModePaiementDao,
ModePaiementHistoryDao> implements ModePaiementAdminService {
    public static final String TEMPLATE = "template/modePaiement.vm";
    public static final String FILE_NAME = "modePaiement.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(ModePaiementDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public ModePaiement findByReferenceEntity(ModePaiement t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(ModePaiement.class,ModePaiementHistory.class, ModePaiementHistoryCriteria.class, ModePaiementSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public ModePaiementAdminServiceImpl(ModePaiementDao dao, ModePaiementHistoryDao historyDao) {
        super(dao, historyDao);
    }

}