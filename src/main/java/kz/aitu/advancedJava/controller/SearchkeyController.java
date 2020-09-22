package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Searchkey;
import kz.aitu.advancedJava.service.SearchkeyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SearchkeyController {
    private final SearchkeyService searchkeyService;

    public SearchkeyController(SearchkeyService searchkeyService) {
        this.searchkeyService = searchkeyService;
    }
    @GetMapping("api/searchkey/{searchkeyId}")
    public ResponseEntity<?> getSearchkey(@PathVariable Long searchkeyId) {
        return ResponseEntity.ok(searchkeyService.getById(searchkeyId));
    }
    @GetMapping("/api/searchkey")
    public ResponseEntity<?> getSearchkey(){return ResponseEntity.ok(searchkeyService.getAll());}

    @PostMapping("api/searchkey")
    public ResponseEntity<?> saveSearchkey(@RequestBody Searchkey searchkey) {
        return ResponseEntity.ok(searchkeyService.create(searchkey));
    }

    @PutMapping("/api/searchkey")
    public ResponseEntity<?> update(@RequestBody Searchkey searchkey) {
        return ResponseEntity.ok(searchkeyService.create(searchkey));
    }

    @DeleteMapping("api/searchkey/{searchkeyId}")
    public  void deleteStudent(@PathVariable Long searchkeyId ) {searchkeyService.delete(searchkeyId);}

}
