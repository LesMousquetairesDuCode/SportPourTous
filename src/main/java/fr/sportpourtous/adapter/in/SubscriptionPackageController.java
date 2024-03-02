package fr.sportpourtous.adapter.in;

@RestController
@RequestMapping("/subscription")
public class SubscriptionPackageController {

    private final SubscriptionPackageService subscriptionPackageService;

    public SubscriptionPackageController(SubscriptionPackageService subscriptionPackageService) {
        this.subscriptionPackageService = subscriptionPackageService;
    }

    //@PostMapping
    public ResponseEntity<SubscriptionPackage> create(@RequestBody SubscriptionPackage subscriptionPackage) {
        SubscriptionPackage createdSubscriptionPackage = subscriptionPackageService.create(subscriptionPackage);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSubscriptionPackage);
    }

    //@GetMapping("/{id}")
    public ResponseEntity<SubscriptionPackage> get(@PathVariable Long id) {
        SubscriptionPackage subscriptionPackage = subscriptionPackageService.findById(id);
        return ResponseEntity.ok(subscriptionPackage);
    }

    //@PutMapping("/{id}")
    public ResponseEntity<SubscriptionPackage> update(Long id,
                                                      @RequestBody SubscriptionPackage subscriptionPackage) {
        SubscriptionPackage updatedSubscriptionPackage = subscriptionPackageService.update(id, subscriptionPackage);
        return ResponseEntity.ok(updatedSubscriptionPackage);
    }

    //@DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(Long id) {
        subscriptionPackageService.delete(id);
        return ResponseEntity.noContent().build();
    }

