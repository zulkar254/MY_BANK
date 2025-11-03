package com.banking.service;

import com.banking.model.Payment;

import java.math.BigDecimal;
import java.util.Map;

public interface PaymentService {

    Map<String, Object> createPayment(BigDecimal amount, String currency) throws Exception;

    Payment verifyPayment(String orderId, String paymentId, String signature) throws Exception;
}
