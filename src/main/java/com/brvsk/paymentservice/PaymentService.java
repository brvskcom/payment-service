package com.brvsk.paymentservice;

import com.brvsk.commons.payment.PaymentRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {


    public String processPayment(PaymentRequest paymentRequest) {
        UUID fakePaymentResponse = UUID.randomUUID();

        return fakePaymentResponse.toString();
    }
}
