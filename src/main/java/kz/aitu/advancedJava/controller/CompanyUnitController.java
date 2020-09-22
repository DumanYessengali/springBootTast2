package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.CompanyUnit;
import kz.aitu.advancedJava.service.CompanyUnitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyUnitController {
    private final CompanyUnitService companyUnitService;

    public CompanyUnitController(CompanyUnitService companyUnitService) {
        this.companyUnitService = companyUnitService;
    }
    @GetMapping("api/companyUnit/{companyUnitId}")
    public ResponseEntity<?> getAuth(@PathVariable Long companyUnitId) {
        return ResponseEntity.ok(companyUnitService.getById(companyUnitId));
    }
    @GetMapping("/api/companyUnit")
    public ResponseEntity<?> getAuth(){return ResponseEntity.ok(companyUnitService.getAll());}

    @PostMapping("api/companyUnit")
    public ResponseEntity<?> saveAuth(@RequestBody CompanyUnit companyUnit) {
        return ResponseEntity.ok(companyUnitService.create(companyUnit));
    }

    @PutMapping("/api/companyUnit")
    public ResponseEntity<?> update(@RequestBody CompanyUnit companyUnit) {
        return ResponseEntity.ok(companyUnitService.create(companyUnit));
    }

    @DeleteMapping("api/companyUnit/{companyUnitId}")
    public  void deleteStudent(@PathVariable Long companyUnitId ) {companyUnitService.delete(companyUnitId);}

}
