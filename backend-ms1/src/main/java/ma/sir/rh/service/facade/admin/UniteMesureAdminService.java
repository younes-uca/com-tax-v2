package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.UniteMesure;
import ma.sir.rh.dao.criteria.core.UniteMesureCriteria;
import ma.sir.rh.dao.criteria.history.UniteMesureHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.UniteMesureDto;

public interface UniteMesureAdminService extends  IService<UniteMesure,UniteMesureCriteria, UniteMesureHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(UniteMesureDto dto) throws Exception;


}
