package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Nomenclature;
import kz.aitu.advancedJava.service.NomenclatureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NomenclatureController {
    private final NomenclatureService nomenclatureService;

    public NomenclatureController(NomenclatureService nomenclatureService) {
        this.nomenclatureService = nomenclatureService;
    }
    @GetMapping("api/nomenclature/{nomenclatureId}")
    public ResponseEntity<?> getNomenclature(@PathVariable Long nomenclatureId) {
        return ResponseEntity.ok(nomenclatureService.getById(nomenclatureId));
    }
    @GetMapping("/api/nomenclature")
    public ResponseEntity<?> getNomenclature(){return ResponseEntity.ok(nomenclatureService.getAll());}

    @PostMapping("api/aunomenclatureth")
    public ResponseEntity<?> saveNomenclature(@RequestBody Nomenclature nomenclature) {
        return ResponseEntity.ok(nomenclatureService.create(nomenclature));
    }

    @PutMapping("/api/nomenclature")
    public ResponseEntity<?> update(@RequestBody Nomenclature nomenclature) {
        return ResponseEntity.ok(nomenclatureService.create(nomenclature));
    }

    @DeleteMapping("api/nomenclature/{nomenclatureId}")
    public  void deleteStudent(@PathVariable Long nomenclatureId ) {nomenclatureService.delete(nomenclatureId);}

}
