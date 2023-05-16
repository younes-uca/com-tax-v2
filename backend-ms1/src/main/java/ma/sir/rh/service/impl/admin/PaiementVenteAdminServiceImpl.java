package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.PaiementVente;
import ma.sir.rh.bean.history.PaiementVenteHistory;
import ma.sir.rh.dao.criteria.core.PaiementVenteCriteria;
import ma.sir.rh.dao.criteria.history.PaiementVenteHistoryCriteria;
import ma.sir.rh.dao.facade.core.PaiementVenteDao;
import ma.sir.rh.dao.facade.history.PaiementVenteHistoryDao;
import ma.sir.rh.dao.specification.core.PaiementVenteSpecification;
import ma.sir.rh.service.facade.admin.PaiementVenteAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.PaiementVenteDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.ModePaiementAdminService ;
import ma.sir.rh.service.facade.admin.EtatPaiementVenteAdminService ;
import ma.sir.rh.service.facade.admin.VenteAdminService ;


import java.util.List;
@Service
public class PaiementVenteAdminServiceImpl extends AbstractServiceImpl<PaiementVente,PaiementVenteHistory, PaiementVenteCriteria, PaiementVenteHistoryCriteria, PaiementVenteDao,
PaiementVenteHistoryDao> implements PaiementVenteAdminService {
    public static final String TEMPLATE = "template/paiementVente.vm";
    public static final String FILE_NAME = "paiementVente.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(PaiementVenteDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public PaiementVente findByReferenceEntity(PaiementVente t){
        return  dao.findByReference(t.getReference());
    }

    public List<PaiementVente> findByVenteId(Long id){
        return dao.findByVenteId(id);
    }
    public int deleteByVenteId(Long id){
        return dao.deleteByVenteId(id);
    }
    public List<PaiementVente> findByModePaiementId(Long id){
        return dao.findByModePaiementId(id);
    }
    public int deleteByModePaiementId(Long id){
        return dao.deleteByModePaiementId(id);
    }
    public List<PaiementVente> findByEtatPaiementVenteId(Long id){
        return dao.findByEtatPaiementVenteId(id);
    }
    public int deleteByEtatPaiementVenteId(Long id){
        return dao.deleteByEtatPaiementVenteId(id);
    }



    public void configure() {
        super.configure(PaiementVente.class,PaiementVenteHistory.class, PaiementVenteHistoryCriteria.class, PaiementVenteSpecification.class);
    }

    @Autowired
    private ModePaiementAdminService modePaiementService ;
    @Autowired
    private EtatPaiementVenteAdminService etatPaiementVenteService ;
    @Autowired
    private VenteAdminService venteService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public PaiementVenteAdminServiceImpl(PaiementVenteDao dao, PaiementVenteHistoryDao historyDao) {
        super(dao, historyDao);
    }

}