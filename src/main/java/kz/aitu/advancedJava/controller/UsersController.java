package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Users;
import kz.aitu.advancedJava.service.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }
    @GetMapping("/api/users/{usersId}")
    public ResponseEntity<?> getUsers(@PathVariable Long usersId) {
        return ResponseEntity.ok(usersService.getById(usersId));
    }
    @GetMapping("/api/users")
    public ResponseEntity<?> getUsers(){return ResponseEntity.ok(usersService.getAll());}

    @PostMapping("/api/users")
    public ResponseEntity<?> saveUsers(@RequestBody Users users) {
        return ResponseEntity.ok(usersService.create(users));
    }

    @PutMapping("/api/users")
    public ResponseEntity<?> update(@RequestBody Users users) {
        return ResponseEntity.ok(usersService.create(users));
    }

    @DeleteMapping("/api/users/{usersId}")
    public  void deleteStudent(@PathVariable Long usersId ) {usersService.delete(usersId);}

}
