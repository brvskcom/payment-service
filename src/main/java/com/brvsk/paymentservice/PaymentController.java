package com.brvsk.paymentservice;

import com.brvsk.commons.clients.payment.PaymentRequest;
import com.brvsk.commons.clients.payment.PaymentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping(path = "/process")
    public PaymentResponse processPayment(@RequestBody PaymentRequest paymentRequest) {
        return paymentService.processPayment(paymentRequest);
    }
}
