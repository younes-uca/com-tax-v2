package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Client;
import ma.sir.rh.dao.criteria.core.ClientCriteria;
import ma.sir.rh.dao.criteria.history.ClientHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;

import ma.sir.rh.ws.dto.ClientDto;

public interface ClientAdminService extends  IService<Client,ClientCriteria, ClientHistoryCriteria>  {


    HttpEntity<byte[]> createPdf(ClientDto dto) throws Exception;


}
