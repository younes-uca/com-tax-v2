package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.PaiementAchat;
import ma.sir.rh.bean.history.PaiementAchatHistory;
import ma.sir.rh.dao.criteria.core.PaiementAchatCriteria;
import ma.sir.rh.dao.criteria.history.PaiementAchatHistoryCriteria;
import ma.sir.rh.dao.facade.core.PaiementAchatDao;
import ma.sir.rh.dao.facade.history.PaiementAchatHistoryDao;
import ma.sir.rh.dao.specification.core.PaiementAchatSpecification;
import ma.sir.rh.service.facade.admin.PaiementAchatAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.PaiementAchatDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.AchatAdminService ;
import ma.sir.rh.service.facade.admin.EtatPaiementAchatAdminService ;
import ma.sir.rh.service.facade.admin.ModePaiementAdminService ;


import java.util.List;
@Service
public class PaiementAchatAdminServiceImpl extends AbstractServiceImpl<PaiementAchat,PaiementAchatHistory, PaiementAchatCriteria, PaiementAchatHistoryCriteria, PaiementAchatDao,
PaiementAchatHistoryDao> implements PaiementAchatAdminService {
    public static final String TEMPLATE = "template/paiementAchat.vm";
    public static final String FILE_NAME = "paiementAchat.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(PaiementAchatDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public PaiementAchat findByReferenceEntity(PaiementAchat t){
        return  dao.findByReference(t.getReference());
    }

    public List<PaiementAchat> findByAchatId(Long id){
        return dao.findByAchatId(id);
    }
    public int deleteByAchatId(Long id){
        return dao.deleteByAchatId(id);
    }
    public List<PaiementAchat> findByModePaiementId(Long id){
        return dao.findByModePaiementId(id);
    }
    public int deleteByModePaiementId(Long id){
        return dao.deleteByModePaiementId(id);
    }
    public List<PaiementAchat> findByEtatPaiementAchatId(Long id){
        return dao.findByEtatPaiementAchatId(id);
    }
    public int deleteByEtatPaiementAchatId(Long id){
        return dao.deleteByEtatPaiementAchatId(id);
    }



    public void configure() {
        super.configure(PaiementAchat.class,PaiementAchatHistory.class, PaiementAchatHistoryCriteria.class, PaiementAchatSpecification.class);
    }

    @Autowired
    private AchatAdminService achatService ;
    @Autowired
    private EtatPaiementAchatAdminService etatPaiementAchatService ;
    @Autowired
    private ModePaiementAdminService modePaiementService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public PaiementAchatAdminServiceImpl(PaiementAchatDao dao, PaiementAchatHistoryDao historyDao) {
        super(dao, historyDao);
    }

}