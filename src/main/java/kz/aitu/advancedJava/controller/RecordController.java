package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Record;
import kz.aitu.advancedJava.service.RecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecordController {
    private final RecordService recordService;

    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }
    @GetMapping("/api/record/{recordId}")
    public ResponseEntity<?> getRecord(@PathVariable Long recordId) {
        return ResponseEntity.ok(recordService.getById(recordId));
    }
    @GetMapping("/api/record")
    public ResponseEntity<?> getRecord(){return ResponseEntity.ok(recordService.getAll());}

    @PostMapping("/api/record")
    public ResponseEntity<?> saveRecord(@RequestBody Record record) {
        return ResponseEntity.ok(recordService.create(record));
    }

    @PutMapping("/api/record")
    public ResponseEntity<?> update(@RequestBody Record record) {
        return ResponseEntity.ok(recordService.create(record));
    }

    @DeleteMapping("/api/record/{recordhId}")
    public  void deleteStudent(@PathVariable Long recordId ) {recordService.delete(recordId);}

}
