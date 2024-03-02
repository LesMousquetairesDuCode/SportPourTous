import fr.sportpourtous.application.services.PaymentService;
import fr.sportpourtous.domain.Payment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public Payment processPayment(@RequestBody Payment paymentDetails) {
        return paymentService.processPayment(paymentDetails);
    }

    @PostMapping("/validate")
    public boolean validatePaymentMethod(@RequestBody Object paymentMethod) {
        return paymentService.validatePaymentMethod(paymentMethod);
    }

    @PostMapping("/refund/{paymentId}")
    public boolean issueRefund(@PathVariable Long paymentId) {
       