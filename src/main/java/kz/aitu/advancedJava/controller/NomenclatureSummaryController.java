package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.NomenclatureSummary;
import kz.aitu.advancedJava.service.NomenclatureSummaryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NomenclatureSummaryController {
    private final NomenclatureSummaryService nomenclatureSummaryService;

    public NomenclatureSummaryController(NomenclatureSummaryService nomenclatureSummaryService) {
        this.nomenclatureSummaryService = nomenclatureSummaryService;
    }
    @GetMapping("api/nomenclatureSummary/{nomenclatureSummaryId}")
    public ResponseEntity<?> getNomenclatureSummary(@PathVariable Long nomenclatureSummaryId) {
        return ResponseEntity.ok(nomenclatureSummaryService.getById(nomenclatureSummaryId));
    }
    @GetMapping("/api/nomenclatureSummary")
    public ResponseEntity<?> getNomenclatureSummary(){return ResponseEntity.ok(nomenclatureSummaryService.getAll());}

    @PostMapping("api/nomenclatureSummary")
    public ResponseEntity<?> saveNomenclatureSummary(@RequestBody NomenclatureSummary nomenclatureSummary) {
        return ResponseEntity.ok(nomenclatureSummaryService.create(nomenclatureSummary));
    }

    @PutMapping("/api/nomenclatureSummary")
    public ResponseEntity<?> update(@RequestBody NomenclatureSummary nomenclatureSummary) {
        return ResponseEntity.ok(nomenclatureSummaryService.create(nomenclatureSummary));
    }

    @DeleteMapping("api/nomenclatureSummary/{nomenclatureSummaryId}")
    public  void deleteStudent(@PathVariable Long nomenclatureSummaryId ) {nomenclatureSummaryService.delete(nomenclatureSummaryId);}

}
