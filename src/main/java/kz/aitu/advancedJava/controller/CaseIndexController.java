package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.CaseIndex;
import kz.aitu.advancedJava.service.CaseIndexService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CaseIndexController {
    private final CaseIndexService caseIndexService;

    public CaseIndexController(CaseIndexService caseIndexService) {
        this.caseIndexService = caseIndexService;
    }
    @GetMapping("api/caseIndex/{caseIndexId}")
    public ResponseEntity<?> getAuth(@PathVariable Long caseIndexId) {
        return ResponseEntity.ok(caseIndexService.getById(caseIndexId));
    }
    @GetMapping("/api/caseIndex")
    public ResponseEntity<?> getAuth(){return ResponseEntity.ok(caseIndexService.getAll());}

    @PostMapping("api/caseIndex")
    public ResponseEntity<?> saveAuth(@RequestBody CaseIndex caseIndex) {
        return ResponseEntity.ok(caseIndexService.create(caseIndex));
    }

    @PutMapping("api/caseIndex")
    public ResponseEntity<?> update(@RequestBody CaseIndex caseIndex) {
        return ResponseEntity.ok(caseIndexService.create(caseIndex));
    }

    @DeleteMapping("api/caseIndex/{caseIndexId}")
    public  void deleteStudent(@PathVariable Long caseIndexId ) {caseIndexService.delete(caseIndexId);}

}
