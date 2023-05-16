package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Client;
import ma.sir.rh.bean.history.ClientHistory;
import ma.sir.rh.dao.criteria.core.ClientCriteria;
import ma.sir.rh.dao.criteria.history.ClientHistoryCriteria;
import ma.sir.rh.dao.facade.core.ClientDao;
import ma.sir.rh.dao.facade.history.ClientHistoryDao;
import ma.sir.rh.dao.specification.core.ClientSpecification;
import ma.sir.rh.service.facade.admin.ClientAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.ClientDto;





import java.util.List;
@Service
public class ClientAdminServiceImpl extends AbstractServiceImpl<Client,ClientHistory, ClientCriteria, ClientHistoryCriteria, ClientDao,
ClientHistoryDao> implements ClientAdminService {
    public static final String TEMPLATE = "template/client.vm";
    public static final String FILE_NAME = "client.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(ClientDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public Client findByReferenceEntity(Client t){
        return  dao.findByCin(t.getCin());
    }




    public void configure() {
        super.configure(Client.class,ClientHistory.class, ClientHistoryCriteria.class, ClientSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public ClientAdminServiceImpl(ClientDao dao, ClientHistoryDao historyDao) {
        super(dao, historyDao);
    }

}