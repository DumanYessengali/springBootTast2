package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.CatalogCase;
import kz.aitu.advancedJava.service.CatalogCaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CatalogCaseController {
    private final CatalogCaseService catalogCaseService;

    public CatalogCaseController(CatalogCaseService catalogCaseService) {
        this.catalogCaseService = catalogCaseService;
    }
    @GetMapping("api/catalogCase/{catalogCaseId}")
    public ResponseEntity<?> getAuth(@PathVariable Long catalogCaseId) {
        return ResponseEntity.ok(catalogCaseService.getById(catalogCaseId));
    }
    @GetMapping("/api/catalogCase")
    public ResponseEntity<?> getAuth(){return ResponseEntity.ok(catalogCaseService.getAll());}

    @PostMapping("api/catalogCase")
    public ResponseEntity<?> saveAuth(@RequestBody CatalogCase catalogCase) {
        return ResponseEntity.ok(catalogCaseService.create(catalogCase));
    }

    @PutMapping("api/catalogCase")
    public ResponseEntity<?> update(@RequestBody CatalogCase catalogCase) {
        return ResponseEntity.ok(catalogCaseService.create(catalogCase));
    }

    @DeleteMapping("api/catalogCase/{catalogCaseId}")
    public  void deleteStudent(@PathVariable Long catalogCaseId ) {catalogCaseService.delete(catalogCaseId);}

}
