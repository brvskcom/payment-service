package com.brvsk.paymentservice;

import com.brvsk.commons.clients.payment.PaymentRequest;
import com.brvsk.commons.clients.payment.PaymentResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {


    public PaymentResponse processPayment(PaymentRequest paymentRequest) {
        String fakePaymentResponse = UUID.randomUUID().toString();

        return new PaymentResponse(fakePaymentResponse);
    }
}
