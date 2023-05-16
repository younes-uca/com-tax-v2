package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.ProprietaireChequeBanque;
import ma.sir.rh.bean.history.ProprietaireChequeBanqueHistory;
import ma.sir.rh.dao.criteria.core.ProprietaireChequeBanqueCriteria;
import ma.sir.rh.dao.criteria.history.ProprietaireChequeBanqueHistoryCriteria;
import ma.sir.rh.dao.facade.core.ProprietaireChequeBanqueDao;
import ma.sir.rh.dao.facade.history.ProprietaireChequeBanqueHistoryDao;
import ma.sir.rh.dao.specification.core.ProprietaireChequeBanqueSpecification;
import ma.sir.rh.service.facade.admin.ProprietaireChequeBanqueAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.ProprietaireChequeBanqueDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.ProprietaireChequeAdminService ;
import ma.sir.rh.service.facade.admin.BanqueAdminService ;


import java.util.List;
@Service
public class ProprietaireChequeBanqueAdminServiceImpl extends AbstractServiceImpl<ProprietaireChequeBanque,ProprietaireChequeBanqueHistory, ProprietaireChequeBanqueCriteria, ProprietaireChequeBanqueHistoryCriteria, ProprietaireChequeBanqueDao,
ProprietaireChequeBanqueHistoryDao> implements ProprietaireChequeBanqueAdminService {
    public static final String TEMPLATE = "template/proprietaireChequeBanque.vm";
    public static final String FILE_NAME = "proprietaireChequeBanque.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(ProprietaireChequeBanqueDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<ProprietaireChequeBanque> findByProprietaireChequeId(Long id){
        return dao.findByProprietaireChequeId(id);
    }
    public int deleteByProprietaireChequeId(Long id){
        return dao.deleteByProprietaireChequeId(id);
    }
    public List<ProprietaireChequeBanque> findByBanqueId(Long id){
        return dao.findByBanqueId(id);
    }
    public int deleteByBanqueId(Long id){
        return dao.deleteByBanqueId(id);
    }



    public void configure() {
        super.configure(ProprietaireChequeBanque.class,ProprietaireChequeBanqueHistory.class, ProprietaireChequeBanqueHistoryCriteria.class, ProprietaireChequeBanqueSpecification.class);
    }

    @Autowired
    private ProprietaireChequeAdminService proprietaireChequeService ;
    @Autowired
    private BanqueAdminService banqueService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public ProprietaireChequeBanqueAdminServiceImpl(ProprietaireChequeBanqueDao dao, ProprietaireChequeBanqueHistoryDao historyDao) {
        super(dao, historyDao);
    }

}