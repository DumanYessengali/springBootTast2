package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Tepfiles;
import kz.aitu.advancedJava.service.TepfilesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TepfilesController {
    private final TepfilesService tepfilesService;

    public TepfilesController(TepfilesService tepfilesService) {
        this.tepfilesService = tepfilesService;
    }
    @GetMapping("api/tepfilesService/{tepfilesId}")
    public ResponseEntity<?> getTepfiles(@PathVariable Long tepfilesId) {
        return ResponseEntity.ok(tepfilesService.getById(tepfilesId));
    }
    @GetMapping("/api/tepfilesService")
    public ResponseEntity<?> getTepfiles(){return ResponseEntity.ok(tepfilesService.getAll());}

    @PostMapping("api/tepfilesService")
    public ResponseEntity<?> saveTepfiles(@RequestBody Tepfiles tepfiles) {
        return ResponseEntity.ok(tepfilesService.create(tepfiles));
    }

    @PutMapping("/api/tepfilesService")
    public ResponseEntity<?> update(@RequestBody Tepfiles tepfiles) {
        return ResponseEntity.ok(tepfilesService.create(tepfiles));
    }

    @DeleteMapping("api/tepfiles/{tepfilesId}")
    public  void deleteStudent(@PathVariable Long tepfilesId ) {tepfilesService.delete(tepfilesId);}
}
