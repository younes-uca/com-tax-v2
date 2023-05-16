package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.EtatReception;
import ma.sir.rh.bean.history.EtatReceptionHistory;
import ma.sir.rh.dao.criteria.core.EtatReceptionCriteria;
import ma.sir.rh.dao.criteria.history.EtatReceptionHistoryCriteria;
import ma.sir.rh.service.facade.admin.EtatReceptionAdminService;
import ma.sir.rh.ws.converter.EtatReceptionConverter;
import ma.sir.rh.ws.dto.EtatReceptionDto;
import ma.sir.rh.zynerator.controller.AbstractController;
import ma.sir.rh.zynerator.dto.AuditEntityDto;
import ma.sir.rh.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.rh.zynerator.process.Result;

import org.springframework.web.multipart.MultipartFile;
import ma.sir.rh.zynerator.dto.FileTempDto;

@Api("Manages etatReception services")
@RestController
@RequestMapping("/api/admin/etatReception/")
public class EtatReceptionRestAdmin  extends AbstractController<EtatReception, EtatReceptionDto, EtatReceptionHistory, EtatReceptionCriteria, EtatReceptionHistoryCriteria, EtatReceptionAdminService, EtatReceptionConverter> {


    @ApiOperation("Exporte pdf")
    @PostMapping("exportPdf/")
    public HttpEntity<byte[]> createPdf(@RequestBody EtatReceptionDto dto) throws Exception{
        return service.createPdf(dto);
    }
    @ApiOperation("upload one etatReception")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple etatReceptions")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etatReceptions")
    @GetMapping("")
    public ResponseEntity<List<EtatReceptionDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all etatReceptions")
    @GetMapping("optimized")
    public ResponseEntity<List<EtatReceptionDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a etatReception by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtatReceptionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etatReception")
    @PostMapping("")
    public ResponseEntity<EtatReceptionDto> save(@RequestBody EtatReceptionDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  etatReception")
    @PutMapping("")
    public ResponseEntity<EtatReceptionDto> update(@RequestBody EtatReceptionDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of etatReception")
    @PostMapping("multiple")
    public ResponseEntity<List<EtatReceptionDto>> delete(@RequestBody List<EtatReceptionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etatReception")
    @DeleteMapping("")
    public ResponseEntity<EtatReceptionDto> delete(@RequestBody EtatReceptionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etatReception")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etatReceptions by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds etatReceptions by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EtatReceptionDto>> findByCriteria(@RequestBody EtatReceptionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etatReceptions by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtatReceptionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatReceptions by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EtatReceptionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etatReception data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EtatReceptionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etatReception history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etatReception paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtatReceptionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatReception history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtatReceptionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etatReception history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtatReceptionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtatReceptionRestAdmin (EtatReceptionAdminService service, EtatReceptionConverter converter) {
        super(service, converter);
    }


}