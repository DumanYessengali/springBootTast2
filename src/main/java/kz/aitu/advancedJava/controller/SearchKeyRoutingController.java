package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.SearchKeyRouting;
import kz.aitu.advancedJava.service.SearchKeyRoutingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SearchKeyRoutingController {
    private final SearchKeyRoutingService searchKeyRoutingService;

    public SearchKeyRoutingController(SearchKeyRoutingService searchKeyRoutingService) {
        this.searchKeyRoutingService = searchKeyRoutingService;
    }
    @GetMapping("api/searchKeyRouting/{searchKeyRoutingId}")
    public ResponseEntity<?> getSearchKeyRouting(@PathVariable Long searchKeyRoutingId) {
        return ResponseEntity.ok(searchKeyRoutingService.getById(searchKeyRoutingId));
    }
    @GetMapping("/api/searchKeyRouting")
    public ResponseEntity<?> getSearchKeyRouting(){return ResponseEntity.ok(searchKeyRoutingService.getAll());}

    @PostMapping("api/searchKeyRouting")
    public ResponseEntity<?> saveSearchKeyRouting(@RequestBody SearchKeyRouting searchKeyRouting) {
        return ResponseEntity.ok(searchKeyRoutingService.create(searchKeyRouting));
    }

    @PutMapping("/api/searchKeyRouting")
    public ResponseEntity<?> update(@RequestBody SearchKeyRouting searchKeyRouting) {
        return ResponseEntity.ok(searchKeyRoutingService.create(searchKeyRouting));
    }

    @DeleteMapping("api/searchKeyRouting/{searchKeyRoutingId}")
    public  void deleteStudent(@PathVariable Long searchKeyRoutingId ) {searchKeyRoutingService.delete(searchKeyRoutingId);}

}
