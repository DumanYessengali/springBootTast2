package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.File;
import kz.aitu.advancedJava.service.FileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class FileController {
    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }
    @GetMapping("api/file/{fileId}")
    public ResponseEntity<?> getAuth(@PathVariable Long fileId) {
        return ResponseEntity.ok(fileService.getById(fileId));
    }
    @GetMapping("/api/file")
    public ResponseEntity<?> getAuth(){return ResponseEntity.ok(fileService.getAll());}

    @PostMapping("api/file")
    public ResponseEntity<?> saveAuth(@RequestBody File file) {
        return ResponseEntity.ok(fileService.create(file));
    }

    @PutMapping("/api/file")
    public ResponseEntity<?> update(@RequestBody File file) {
        return ResponseEntity.ok(fileService.create(file));
    }

    @DeleteMapping("api/file/{fileId}")
    public  void deleteStudent(@PathVariable Long fileId ) {fileService.delete(fileId);}

}
