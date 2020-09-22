package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.StatusRequestHistory;
import kz.aitu.advancedJava.service.StatusRequestHistoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StatusRequestHistoryController {
    private final StatusRequestHistoryService statusRequestHistoryService;

    public StatusRequestHistoryController(StatusRequestHistoryService statusRequestHistoryService) {
        this.statusRequestHistoryService = statusRequestHistoryService;
    }
    @GetMapping("api/statusRequestHistory/{statusRequestHistoryId}")
    public ResponseEntity<?> getStatusRequestHistory(@PathVariable Long statusRequestHistoryId) {
        return ResponseEntity.ok(statusRequestHistoryService.getById(statusRequestHistoryId));
    }
    @GetMapping("/api/statusRequestHistory")
    public ResponseEntity<?> getStatusRequestHistory(){return ResponseEntity.ok(statusRequestHistoryService.getAll());}

    @PostMapping("api/statusRequestHistory")
    public ResponseEntity<?> saveStatusRequestHistory(@RequestBody StatusRequestHistory statusRequestHistory) {
        return ResponseEntity.ok(statusRequestHistoryService.create(statusRequestHistory));
    }

    @PutMapping("/api/statusRequestHistory")
    public ResponseEntity<?> update(@RequestBody StatusRequestHistory statusRequestHistory) {
        return ResponseEntity.ok(statusRequestHistoryService.create(statusRequestHistory));
    }

    @DeleteMapping("api/statusRequestHistory/{statusRequestHistoryId}")
    public  void deleteStudent(@PathVariable Long statusRequestHistoryId ) {statusRequestHistoryService.delete(statusRequestHistoryId);}

}
