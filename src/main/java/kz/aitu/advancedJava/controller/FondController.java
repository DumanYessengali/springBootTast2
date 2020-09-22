package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Fond;
import kz.aitu.advancedJava.service.FondService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FondController {
    private final FondService fondService;

    public FondController(FondService fondService) {
        this.fondService = fondService;
    }
    @GetMapping("api/fond/{id}")
    public ResponseEntity<?> getFond(@PathVariable Long fondId) {
        return ResponseEntity.ok(fondService.getById(fondId));
    }
    @GetMapping("/api/fond")
    public ResponseEntity<?> getFond(){return ResponseEntity.ok(fondService.getAll());}

    @PostMapping("api/fond")
    public ResponseEntity<?> saveFond(@RequestBody Fond fond) {
        return ResponseEntity.ok(fondService.create(fond));
    }

    @PutMapping("/api/fond")
    public ResponseEntity<?> update(@RequestBody Fond fond) {
        return ResponseEntity.ok(fondService.create(fond));
    }

    @DeleteMapping("api/fond/{id}")
    public  void deleteStudent(@PathVariable Long fondId ) {fondService.delete(fondId);}

}
