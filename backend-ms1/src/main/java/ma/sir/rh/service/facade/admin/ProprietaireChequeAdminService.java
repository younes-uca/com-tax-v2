package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.ProprietaireCheque;
import ma.sir.rh.dao.criteria.core.ProprietaireChequeCriteria;
import ma.sir.rh.dao.criteria.history.ProprietaireChequeHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.ProprietaireChequeDto;

public interface ProprietaireChequeAdminService extends  IService<ProprietaireCheque,ProprietaireChequeCriteria, ProprietaireChequeHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(ProprietaireChequeDto dto) throws Exception;


}
