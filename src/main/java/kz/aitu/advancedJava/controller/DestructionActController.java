package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.DestructionAct;
import kz.aitu.advancedJava.service.DestructionActService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DestructionActController {
    private final DestructionActService destructionActService;

    public DestructionActController(DestructionActService destructionActService) {
        this.destructionActService = destructionActService;
    }
    @GetMapping("api/destructionAct/{destructionActId}")
    public ResponseEntity<?> getAuth(@PathVariable Long destructionActId) {
        return ResponseEntity.ok(destructionActService.getById(destructionActId));
    }
    @GetMapping("/api/destructionAct")
    public ResponseEntity<?> getAuth(){return ResponseEntity.ok(destructionActService.getAll());}

    @PostMapping("api/destructionAct")
    public ResponseEntity<?> saveAuth(@RequestBody DestructionAct destructionAct) {
        return ResponseEntity.ok(destructionActService.create(destructionAct));
    }

    @PutMapping("/api/destructionAct")
    public ResponseEntity<?> update(@RequestBody DestructionAct destructionAct) {
        return ResponseEntity.ok(destructionActService.create(destructionAct));
    }

    @DeleteMapping("api/destructionAct/{destructionActId}")
    public  void deleteStudent(@PathVariable Long destructionActId ) {destructionActService.delete(destructionActId);}

}
