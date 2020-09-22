package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.FileRouting;
import kz.aitu.advancedJava.service.FileRoutingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FileRoutingController {
    private final FileRoutingService fileRoutingService;

    public FileRoutingController(FileRoutingService fileRoutingService) {
        this.fileRoutingService = fileRoutingService;
    }
    @GetMapping("api/fileRouting/{fileRoutingId}")
    public ResponseEntity<?> getAuth(@PathVariable Long fileRoutingId) {
        return ResponseEntity.ok(fileRoutingService.getById(fileRoutingId));
    }
    @GetMapping("/api/fileRouting")
    public ResponseEntity<?> getAuth(){return ResponseEntity.ok(fileRoutingService.getAll());}

    @PostMapping("api/fileRouting")
    public ResponseEntity<?> saveAuth(@RequestBody FileRouting fileRouting) {
        return ResponseEntity.ok(fileRoutingService.create(fileRouting));
    }

    @PutMapping("/api/fileRouting")
    public ResponseEntity<?> update(@RequestBody FileRouting fileRouting) {
        return ResponseEntity.ok(fileRoutingService.create(fileRouting));
    }

    @DeleteMapping("api/fileRouting/{fileRoutingId}")
    public  void deleteStudent(@PathVariable Long fileRoutingId ) {fileRoutingService.delete(fileRoutingId);}

}
