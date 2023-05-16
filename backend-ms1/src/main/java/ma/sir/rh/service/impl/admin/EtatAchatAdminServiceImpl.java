package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.EtatAchat;
import ma.sir.rh.bean.history.EtatAchatHistory;
import ma.sir.rh.dao.criteria.core.EtatAchatCriteria;
import ma.sir.rh.dao.criteria.history.EtatAchatHistoryCriteria;
import ma.sir.rh.dao.facade.core.EtatAchatDao;
import ma.sir.rh.dao.facade.history.EtatAchatHistoryDao;
import ma.sir.rh.dao.specification.core.EtatAchatSpecification;
import ma.sir.rh.service.facade.admin.EtatAchatAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.EtatAchatDto;





import java.util.List;
@Service
public class EtatAchatAdminServiceImpl extends AbstractServiceImpl<EtatAchat,EtatAchatHistory, EtatAchatCriteria, EtatAchatHistoryCriteria, EtatAchatDao,
EtatAchatHistoryDao> implements EtatAchatAdminService {
    public static final String TEMPLATE = "template/etatAchat.vm";
    public static final String FILE_NAME = "etatAchat.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(EtatAchatDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public EtatAchat findByReferenceEntity(EtatAchat t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatAchat.class,EtatAchatHistory.class, EtatAchatHistoryCriteria.class, EtatAchatSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public EtatAchatAdminServiceImpl(EtatAchatDao dao, EtatAchatHistoryDao historyDao) {
        super(dao, historyDao);
    }

}