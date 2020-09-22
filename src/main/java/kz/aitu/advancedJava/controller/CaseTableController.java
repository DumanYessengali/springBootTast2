package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Auth;
import kz.aitu.advancedJava.model.CaseTable;
import kz.aitu.advancedJava.service.CaseTableService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CaseTableController {
    private final CaseTableService caseTableService;

    public CaseTableController(CaseTableService caseTableService) {
        this.caseTableService = caseTableService;
    }
    @GetMapping("api/caseTable/{caseTable}")
    public ResponseEntity<?> getAuth(@PathVariable Long caseTableId) {
        return ResponseEntity.ok(caseTableService.getById(caseTableId));
    }
    @GetMapping("/api/caseTable")
    public ResponseEntity<?> getAuth(){return ResponseEntity.ok(caseTableService.getAll());}

    @PostMapping("api/caseTable")
    public ResponseEntity<?> saveAuth(@RequestBody CaseTable auth) {
        return ResponseEntity.ok(caseTableService.create(auth));
    }

    @PutMapping("api/caseTable")
    public ResponseEntity<?> update(@RequestBody CaseTable caseTable) {
        return ResponseEntity.ok(caseTableService.create(caseTable));
    }

    @DeleteMapping("api/caseTable/{caseTable}")
    public  void deleteStudent(@PathVariable Long caseTableId ) {caseTableService.delete(caseTableId);}
}
