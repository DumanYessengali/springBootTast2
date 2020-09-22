package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Location;
import kz.aitu.advancedJava.service.LocationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationController {
    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }
    @GetMapping("api/location/{locationId}")
    public ResponseEntity<?> getLocation(@PathVariable Long locationId) {
        return ResponseEntity.ok(locationService.getById(locationId));
    }
    @GetMapping("/api/location")
    public ResponseEntity<?> getLocation(){return ResponseEntity.ok(locationService.getAll());}

    @PostMapping("api/location")
    public ResponseEntity<?> saveLocation(@RequestBody Location location) {
        return ResponseEntity.ok(locationService.create(location));
    }

    @PutMapping("/api/location")
    public ResponseEntity<?> update(@RequestBody Location location) {
        return ResponseEntity.ok(locationService.create(location));
    }

    @DeleteMapping("api/location/{locationId}")
    public  void deleteStudent(@PathVariable Long locationId ) {locationService.delete(locationId);}

}
