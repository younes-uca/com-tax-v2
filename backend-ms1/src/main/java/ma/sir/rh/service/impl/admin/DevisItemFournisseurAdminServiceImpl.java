package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.DevisItemFournisseur;
import ma.sir.rh.bean.history.DevisItemFournisseurHistory;
import ma.sir.rh.dao.criteria.core.DevisItemFournisseurCriteria;
import ma.sir.rh.dao.criteria.history.DevisItemFournisseurHistoryCriteria;
import ma.sir.rh.dao.facade.core.DevisItemFournisseurDao;
import ma.sir.rh.dao.facade.history.DevisItemFournisseurHistoryDao;
import ma.sir.rh.dao.specification.core.DevisItemFournisseurSpecification;
import ma.sir.rh.service.facade.admin.DevisItemFournisseurAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.DevisItemFournisseurDto;

import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.ProduitAdminService ;
import ma.sir.rh.service.facade.admin.DevisFournisseurAdminService ;


import java.util.List;
@Service
public class DevisItemFournisseurAdminServiceImpl extends AbstractServiceImpl<DevisItemFournisseur,DevisItemFournisseurHistory, DevisItemFournisseurCriteria, DevisItemFournisseurHistoryCriteria, DevisItemFournisseurDao,
DevisItemFournisseurHistoryDao> implements DevisItemFournisseurAdminService {
    public static final String TEMPLATE = "template/devisItemFournisseur.vm";
    public static final String FILE_NAME = "devisItemFournisseur.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(DevisItemFournisseurDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }



    public List<DevisItemFournisseur> findByProduitId(Long id){
        return dao.findByProduitId(id);
    }
    public int deleteByProduitId(Long id){
        return dao.deleteByProduitId(id);
    }
    public List<DevisItemFournisseur> findByDevisFournisseurId(Long id){
        return dao.findByDevisFournisseurId(id);
    }
    public int deleteByDevisFournisseurId(Long id){
        return dao.deleteByDevisFournisseurId(id);
    }



    public void configure() {
        super.configure(DevisItemFournisseur.class,DevisItemFournisseurHistory.class, DevisItemFournisseurHistoryCriteria.class, DevisItemFournisseurSpecification.class);
    }

    @Autowired
    private ProduitAdminService produitService ;
    @Autowired
    private DevisFournisseurAdminService devisFournisseurService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public DevisItemFournisseurAdminServiceImpl(DevisItemFournisseurDao dao, DevisItemFournisseurHistoryDao historyDao) {
        super(dao, historyDao);
    }

}