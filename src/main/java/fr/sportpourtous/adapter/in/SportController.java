package fr.sportpourtous.adapter.in;

public class SportController {
}
package fr.sportpourtous.adapter.in;

import fr.sportpourtous.domain.Sport;
import fr.sportpourtous.application.SportControllerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sports")
public class SportController {
    private final SportControllerService sportControllerService;

    public SportController(SportControllerService sportControllerService) {
        this.sportControllerService = sportControllerService;
    }

    @PostMapping
    public ResponseEntity<Sport> create(@RequestBody Sport sport) {
        Sport createdSport = sportControllerService.create(sport);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSport);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sport> get(@PathVariable Long id) {
        Sport sport = sportControllerService.findById(id);
        return ResponseEntity.ok(sport);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sport> update(@PathVariable Long id, @RequestBody Sport sport) {
        Sport updatedSport = sportControllerService.update(id, sport);
        return ResponseEntity.ok(updatedSport);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

    }
}