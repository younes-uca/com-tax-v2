package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.EtatAvoirAchat;
import ma.sir.rh.bean.history.EtatAvoirAchatHistory;
import ma.sir.rh.dao.criteria.core.EtatAvoirAchatCriteria;
import ma.sir.rh.dao.criteria.history.EtatAvoirAchatHistoryCriteria;
import ma.sir.rh.dao.facade.core.EtatAvoirAchatDao;
import ma.sir.rh.dao.facade.history.EtatAvoirAchatHistoryDao;
import ma.sir.rh.dao.specification.core.EtatAvoirAchatSpecification;
import ma.sir.rh.service.facade.admin.EtatAvoirAchatAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.EtatAvoirAchatDto;





import java.util.List;
@Service
public class EtatAvoirAchatAdminServiceImpl extends AbstractServiceImpl<EtatAvoirAchat,EtatAvoirAchatHistory, EtatAvoirAchatCriteria, EtatAvoirAchatHistoryCriteria, EtatAvoirAchatDao,
EtatAvoirAchatHistoryDao> implements EtatAvoirAchatAdminService {
    public static final String TEMPLATE = "template/etatAvoirAchat.vm";
    public static final String FILE_NAME = "etatAvoirAchat.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(EtatAvoirAchatDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public EtatAvoirAchat findByReferenceEntity(EtatAvoirAchat t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatAvoirAchat.class,EtatAvoirAchatHistory.class, EtatAvoirAchatHistoryCriteria.class, EtatAvoirAchatSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public EtatAvoirAchatAdminServiceImpl(EtatAvoirAchatDao dao, EtatAvoirAchatHistoryDao historyDao) {
        super(dao, historyDao);
    }

}