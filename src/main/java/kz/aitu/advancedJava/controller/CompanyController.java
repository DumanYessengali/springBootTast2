package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Auth;
import kz.aitu.advancedJava.model.Company;
import kz.aitu.advancedJava.service.AuthService;
import kz.aitu.advancedJava.service.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
    @GetMapping("api/company/{companyId}")
    public ResponseEntity<?> getAuth(@PathVariable Long companyId) {
        return ResponseEntity.ok(companyService.getById(companyId));
    }
    @GetMapping("/api/company")
    public ResponseEntity<?> getAuth(){return ResponseEntity.ok(companyService.getAll());}

    @PostMapping("api/company")
    public ResponseEntity<?> saveAuth(@RequestBody Company company) {
        return ResponseEntity.ok(companyService.create(company));
    }

    @PutMapping("/api/company")
    public ResponseEntity<?> update(@RequestBody Company company) {
        return ResponseEntity.ok(companyService.create(company));
    }

    @DeleteMapping("api/company/{companyId}")
    public  void deleteStudent(@PathVariable Long companyId ) {companyService.delete(companyId);}

}
