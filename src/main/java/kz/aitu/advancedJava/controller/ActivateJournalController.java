package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.ActivateJournal;
import kz.aitu.advancedJava.service.ActivateJournalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ActivateJournalController {
    private final ActivateJournalService activateJournalService;

    public ActivateJournalController(ActivateJournalService activateJournalService) {
        this.activateJournalService = activateJournalService;
    }

    @GetMapping("/api/activateJournal/{activateJournalId}")
    public ResponseEntity<?> getActivateJournal(@PathVariable Long studentId) {
        return ResponseEntity.ok(activateJournalService.getById(studentId));
    }

    @GetMapping("api/activateJournal")
    public ResponseEntity<?> getActivateJournals() {
        return ResponseEntity.ok(activateJournalService.getAll());
    }

    @PostMapping("/api/activateJournal")
    public ResponseEntity<?> saveActivateJournal(@RequestBody ActivateJournal activateJournal) {
        return ResponseEntity.ok(activateJournalService.create(activateJournal));
    }

    @PutMapping("/api/activateJournal")
    public ResponseEntity<?> updateActivateJournal(@RequestBody ActivateJournal activateJournal) {
        return ResponseEntity.ok(activateJournalService.create(activateJournal));
    }

    @DeleteMapping("/api/activateJournal/{activateJournalId}")
    public void deleteActivateJournal(@PathVariable Long activateJournalId) {
        activateJournalService.delete(activateJournalId);
    }
}