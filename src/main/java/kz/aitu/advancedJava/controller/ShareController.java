package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Share;
import kz.aitu.advancedJava.service.ShareService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShareController {
    private final ShareService shareService;

    public ShareController(ShareService shareService) {
        this.shareService = shareService;
    }
    @GetMapping("api/share/{shareId}")
    public ResponseEntity<?> getShare(@PathVariable Long shareId) {
        return ResponseEntity.ok(shareService.getById(shareId));
    }
    @GetMapping("/api/share")
    public ResponseEntity<?> getShare(){return ResponseEntity.ok(shareService.getAll());}

    @PostMapping("api/share")
    public ResponseEntity<?> saveShare(@RequestBody Share share) {
        return ResponseEntity.ok(shareService.create(share));
    }

    @PutMapping("/api/share")
    public ResponseEntity<?> update(@RequestBody Share share) {
        return ResponseEntity.ok(shareService.create(share));
    }

    @DeleteMapping("api/auth/{shareId}")
    public  void deleteStudent(@PathVariable Long shareId ) {shareService.delete(shareId);}

}
