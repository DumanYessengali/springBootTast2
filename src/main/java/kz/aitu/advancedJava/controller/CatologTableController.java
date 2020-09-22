package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.CatologTable;
import kz.aitu.advancedJava.service.CatologTableService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CatologTableController {
    private final CatologTableService catologTableService;

    public CatologTableController(CatologTableService catologTableService) {
        this.catologTableService = catologTableService;
    }
    @GetMapping("api/catologTable/{catologTableId}")
    public ResponseEntity<?> getAuth(@PathVariable Long catologTableId) {
        return ResponseEntity.ok(catologTableService.getById(catologTableId));
    }
    @GetMapping("/api/catologTable")
    public ResponseEntity<?> getAuth(){return ResponseEntity.ok(catologTableService.getAll());}

    @PostMapping("api/catologTable")
    public ResponseEntity<?> saveAuth(@RequestBody CatologTable catologTable) {
        return ResponseEntity.ok(catologTableService.create(catologTable));
    }

    @PutMapping("/api/catologTable")
    public ResponseEntity<?> update(@RequestBody CatologTable catologTable) {
        return ResponseEntity.ok(catologTableService.create(catologTable));
    }

    @DeleteMapping("api/catologTable/{catologTableId}")
    public  void deleteStudent(@PathVariable Long catologTableId ) {catologTableService.delete(catologTableId);}

}
