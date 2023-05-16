package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Abonne;
import ma.sir.rh.bean.history.AbonneHistory;
import ma.sir.rh.dao.criteria.core.AbonneCriteria;
import ma.sir.rh.dao.criteria.history.AbonneHistoryCriteria;
import ma.sir.rh.dao.facade.core.AbonneDao;
import ma.sir.rh.dao.facade.history.AbonneHistoryDao;
import ma.sir.rh.dao.specification.core.AbonneSpecification;
import ma.sir.rh.service.facade.admin.AbonneAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.AbonneDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.rh.bean.core.Societe;

import ma.sir.rh.service.facade.admin.SocieteAdminService ;


import java.util.List;
@Service
public class AbonneAdminServiceImpl extends AbstractServiceImpl<Abonne,AbonneHistory, AbonneCriteria, AbonneHistoryCriteria, AbonneDao,
AbonneHistoryDao> implements AbonneAdminService {
    public static final String TEMPLATE = "template/abonne.vm";
    public static final String FILE_NAME = "abonne.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(AbonneDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Abonne create(Abonne t) {
        super.create(t);
        if (t.getSocietes() != null) {
                t.getSocietes().forEach(element-> {
                    element.setAbonne(t);
                    societeService.create(element);
            });
        }
        return t;
    }

    public Abonne findWithAssociatedLists(Long id){
        Abonne result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setSocietes(societeService.findByAbonneId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        societeService.deleteByAbonneId(id);
    }


    public void updateWithAssociatedLists(Abonne abonne){
    if(abonne !=null && abonne.getId() != null){
            List<List<Societe>> resultSocietes= societeService.getToBeSavedAndToBeDeleted(societeService.findByAbonneId(abonne.getId()),abonne.getSocietes());
            societeService.delete(resultSocietes.get(1));
            ListUtil.emptyIfNull(resultSocietes.get(0)).forEach(e -> e.setAbonne(abonne));
            societeService.update(resultSocietes.get(0),true);
    }
    }

    public Abonne findByReferenceEntity(Abonne t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Abonne.class,AbonneHistory.class, AbonneHistoryCriteria.class, AbonneSpecification.class);
    }

    @Autowired
    private SocieteAdminService societeService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public AbonneAdminServiceImpl(AbonneDao dao, AbonneHistoryDao historyDao) {
        super(dao, historyDao);
    }

}