package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.EtatPaiementAchat;
import ma.sir.rh.bean.history.EtatPaiementAchatHistory;
import ma.sir.rh.dao.criteria.core.EtatPaiementAchatCriteria;
import ma.sir.rh.dao.criteria.history.EtatPaiementAchatHistoryCriteria;
import ma.sir.rh.dao.facade.core.EtatPaiementAchatDao;
import ma.sir.rh.dao.facade.history.EtatPaiementAchatHistoryDao;
import ma.sir.rh.dao.specification.core.EtatPaiementAchatSpecification;
import ma.sir.rh.service.facade.admin.EtatPaiementAchatAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.EtatPaiementAchatDto;





import java.util.List;
@Service
public class EtatPaiementAchatAdminServiceImpl extends AbstractServiceImpl<EtatPaiementAchat,EtatPaiementAchatHistory, EtatPaiementAchatCriteria, EtatPaiementAchatHistoryCriteria, EtatPaiementAchatDao,
EtatPaiementAchatHistoryDao> implements EtatPaiementAchatAdminService {
    public static final String TEMPLATE = "template/etatPaiementAchat.vm";
    public static final String FILE_NAME = "etatPaiementAchat.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(EtatPaiementAchatDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public EtatPaiementAchat findByReferenceEntity(EtatPaiementAchat t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatPaiementAchat.class,EtatPaiementAchatHistory.class, EtatPaiementAchatHistoryCriteria.class, EtatPaiementAchatSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public EtatPaiementAchatAdminServiceImpl(EtatPaiementAchatDao dao, EtatPaiementAchatHistoryDao historyDao) {
        super(dao, historyDao);
    }

}