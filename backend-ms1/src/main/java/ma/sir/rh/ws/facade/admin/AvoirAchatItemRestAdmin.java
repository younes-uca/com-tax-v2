package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.AvoirAchatItem;
import ma.sir.rh.bean.history.AvoirAchatItemHistory;
import ma.sir.rh.dao.criteria.core.AvoirAchatItemCriteria;
import ma.sir.rh.dao.criteria.history.AvoirAchatItemHistoryCriteria;
import ma.sir.rh.service.facade.admin.AvoirAchatItemAdminService;
import ma.sir.rh.ws.converter.AvoirAchatItemConverter;
import ma.sir.rh.ws.dto.AvoirAchatItemDto;
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

@Api("Manages avoirAchatItem services")
@RestController
@RequestMapping("/api/admin/avoirAchatItem/")
public class AvoirAchatItemRestAdmin  extends AbstractController<AvoirAchatItem, AvoirAchatItemDto, AvoirAchatItemHistory, AvoirAchatItemCriteria, AvoirAchatItemHistoryCriteria, AvoirAchatItemAdminService, AvoirAchatItemConverter> {


    @ApiOperation("Exporte pdf")
    @PostMapping("exportPdf/")
    public HttpEntity<byte[]> createPdf(@RequestBody AvoirAchatItemDto dto) throws Exception{
        return service.createPdf(dto);
    }
    @ApiOperation("upload one avoirAchatItem")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple avoirAchatItems")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all avoirAchatItems")
    @GetMapping("")
    public ResponseEntity<List<AvoirAchatItemDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a avoirAchatItem by id")
    @GetMapping("id/{id}")
    public ResponseEntity<AvoirAchatItemDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  avoirAchatItem")
    @PostMapping("")
    public ResponseEntity<AvoirAchatItemDto> save(@RequestBody AvoirAchatItemDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  avoirAchatItem")
    @PutMapping("")
    public ResponseEntity<AvoirAchatItemDto> update(@RequestBody AvoirAchatItemDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of avoirAchatItem")
    @PostMapping("multiple")
    public ResponseEntity<List<AvoirAchatItemDto>> delete(@RequestBody List<AvoirAchatItemDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified avoirAchatItem")
    @DeleteMapping("")
    public ResponseEntity<AvoirAchatItemDto> delete(@RequestBody AvoirAchatItemDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified avoirAchatItem")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple avoirAchatItems by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by produit id")
    @GetMapping("produit/id/{id}")
    public List<AvoirAchatItem> findByProduitId(@PathVariable Long id){
        return service.findByProduitId(id);
    }
    @ApiOperation("delete by produit id")
    @DeleteMapping("produit/id/{id}")
    public int deleteByProduitId(@PathVariable Long id){
        return service.deleteByProduitId(id);
    }
    @ApiOperation("find by avoirAchat id")
    @GetMapping("avoirAchat/id/{id}")
    public List<AvoirAchatItem> findByAvoirAchatId(@PathVariable Long id){
        return service.findByAvoirAchatId(id);
    }
    @ApiOperation("delete by avoirAchat id")
    @DeleteMapping("avoirAchat/id/{id}")
    public int deleteByAvoirAchatId(@PathVariable Long id){
        return service.deleteByAvoirAchatId(id);
    }
    @ApiOperation("Finds avoirAchatItems by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<AvoirAchatItemDto>> findByCriteria(@RequestBody AvoirAchatItemCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated avoirAchatItems by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody AvoirAchatItemCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports avoirAchatItems by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody AvoirAchatItemCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets avoirAchatItem data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody AvoirAchatItemCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets avoirAchatItem history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets avoirAchatItem paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody AvoirAchatItemHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports avoirAchatItem history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody AvoirAchatItemHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets avoirAchatItem history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody AvoirAchatItemHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public AvoirAchatItemRestAdmin (AvoirAchatItemAdminService service, AvoirAchatItemConverter converter) {
        super(service, converter);
    }


}