package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Request;
import kz.aitu.advancedJava.service.RequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RequestController {
    private final RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }
    @GetMapping("api/request/{requestId}")
    public ResponseEntity<?> getRequest(@PathVariable Long requestId) {
        return ResponseEntity.ok(requestService.getById(requestId));
    }
    @GetMapping("/api/request")
    public ResponseEntity<?> getRequest(){return ResponseEntity.ok(requestService.getAll());}

    @PostMapping("api/request")
    public ResponseEntity<?> saveRequest(@RequestBody Request request) {
        return ResponseEntity.ok(requestService.create(request));
    }

    @PutMapping("/api/request")
    public ResponseEntity<?> update(@RequestBody Request request) {
        return ResponseEntity.ok(requestService.create(request));
    }

    @DeleteMapping("api/request/{requestId}")
    public  void deleteStudent(@PathVariable Long requestId ) {requestService.delete(requestId);}

}
