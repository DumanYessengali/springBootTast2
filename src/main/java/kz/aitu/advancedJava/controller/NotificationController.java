package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Notification;
import kz.aitu.advancedJava.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotificationController {
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    @GetMapping("api/notification/{notificationId}")
    public ResponseEntity<?> getNotification(@PathVariable Long notificationId) {
        return ResponseEntity.ok(notificationService.getById(notificationId));
    }
    @GetMapping("/api/notification")
    public ResponseEntity<?> getNotification(){return ResponseEntity.ok(notificationService.getAll());}

    @PostMapping("api/notification")
    public ResponseEntity<?> saveNotification(@RequestBody Notification auth) {
        return ResponseEntity.ok(notificationService.create(auth));
    }

    @PutMapping("/api/notification")
    public ResponseEntity<?> update(@RequestBody Notification notification) {
        return ResponseEntity.ok(notificationService.create(notification));
    }

    @DeleteMapping("api/notification/{notificationId}")
    public  void deleteStudent(@PathVariable Long notificationId ) {notificationService.delete(notificationId);}


}
