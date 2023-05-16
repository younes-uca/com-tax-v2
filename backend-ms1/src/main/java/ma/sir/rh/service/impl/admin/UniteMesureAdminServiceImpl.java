package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.UniteMesure;
import ma.sir.rh.bean.history.UniteMesureHistory;
import ma.sir.rh.dao.criteria.core.UniteMesureCriteria;
import ma.sir.rh.dao.criteria.history.UniteMesureHistoryCriteria;
import ma.sir.rh.dao.facade.core.UniteMesureDao;
import ma.sir.rh.dao.facade.history.UniteMesureHistoryDao;
import ma.sir.rh.dao.specification.core.UniteMesureSpecification;
import ma.sir.rh.service.facade.admin.UniteMesureAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import ma.sir.rh.zynerator.util.VelocityPdf;
import ma.sir.rh.ws.dto.UniteMesureDto;





import java.util.List;
@Service
public class UniteMesureAdminServiceImpl extends AbstractServiceImpl<UniteMesure,UniteMesureHistory, UniteMesureCriteria, UniteMesureHistoryCriteria, UniteMesureDao,
UniteMesureHistoryDao> implements UniteMesureAdminService {
    public static final String TEMPLATE = "template/uniteMesure.vm";
    public static final String FILE_NAME = "uniteMesure.pdf";

    @Override
    public HttpEntity<byte[]> createPdf(UniteMesureDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }


    public UniteMesure findByReferenceEntity(UniteMesure t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(UniteMesure.class,UniteMesureHistory.class, UniteMesureHistoryCriteria.class, UniteMesureSpecification.class);
    }

    @Autowired
    private VelocityPdf velocityPdf;

    public UniteMesureAdminServiceImpl(UniteMesureDao dao, UniteMesureHistoryDao historyDao) {
        super(dao, historyDao);
    }

}