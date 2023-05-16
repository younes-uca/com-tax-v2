package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.PaiementDemande;
import ma.sir.rh.bean.history.PaiementDemandeHistory;
import ma.sir.rh.dao.criteria.core.PaiementDemandeCriteria;
import ma.sir.rh.dao.criteria.history.PaiementDemandeHistoryCriteria;
import ma.sir.rh.dao.facade.core.PaiementDemandeDao;
import ma.sir.rh.dao.facade.history.PaiementDemandeHistoryDao;
import ma.sir.rh.dao.specification.core.PaiementDemandeSpecification;
import ma.sir.rh.service.facade.admin.PaiementDemandeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.PaiementDemandeDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.DemandeAdminService ;
import ma.sir.rh.service.facade.admin.ModePaiementAdminService ;


import java.util.List;
@Service
public class PaiementDemandeAdminServiceImpl extends AbstractServiceImpl<PaiementDemande,PaiementDemandeHistory, PaiementDemandeCriteria, PaiementDemandeHistoryCriteria, PaiementDemandeDao,
PaiementDemandeHistoryDao> implements PaiementDemandeAdminService {
    public static final String TEMPLATE = "template/paiementDemande.vm";
    public static final String FILE_NAME = "paiementDemande.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(PaiementDemandeDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public PaiementDemande findByReferenceEntity(PaiementDemande t){
        return  dao.findByReference(t.getReference());
    }

    public List<PaiementDemande> findByDemandeId(Long id){
        return dao.findByDemandeId(id);
    }
    public int deleteByDemandeId(Long id){
        return dao.deleteByDemandeId(id);
    }
    public List<PaiementDemande> findByModePaiementId(Long id){
        return dao.findByModePaiementId(id);
    }
    public int deleteByModePaiementId(Long id){
        return dao.deleteByModePaiementId(id);
    }



    public void configure() {
        super.configure(PaiementDemande.class,PaiementDemandeHistory.class, PaiementDemandeHistoryCriteria.class, PaiementDemandeSpecification.class);
    }

    @Autowired
    private DemandeAdminService demandeService ;
    @Autowired
    private ModePaiementAdminService modePaiementService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public PaiementDemandeAdminServiceImpl(PaiementDemandeDao dao, PaiementDemandeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}