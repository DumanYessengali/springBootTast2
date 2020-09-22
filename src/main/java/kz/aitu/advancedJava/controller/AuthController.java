package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Auth;
import kz.aitu.advancedJava.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }
    @GetMapping("api/auth/{authId}")
    public ResponseEntity<?> getAuth(@PathVariable Long authId) {
        return ResponseEntity.ok(authService.getById(authId));
    }
    @GetMapping("/api/auth")
    public ResponseEntity<?> getAuth(){return ResponseEntity.ok(authService.getAll());}

    @PostMapping("api/auth")
    public ResponseEntity<?> saveAuth(@RequestBody Auth auth) {
        return ResponseEntity.ok(authService.create(auth));
    }

    @PutMapping("/api/auth")
    public ResponseEntity<?> update(@RequestBody Auth auth) {
        return ResponseEntity.ok(authService.create(auth));
    }

    @DeleteMapping("api/auth/{authId}")
    public  void deleteStudent(@PathVariable Long authId ) {authService.delete(authId);}
}
