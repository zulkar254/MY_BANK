package com.banking.controller;

import com.banking.model.Payment;
import com.banking.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/create")
    public ResponseEntity<Map<String, Object>> createPayment(@RequestParam BigDecimal amount) {
        try {
            Map<String, Object> response = paymentService.createPayment(amount, "INR");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Map.of("error", e.getMessage()));
        }
    }

    @PostMapping("/verify")
    public ResponseEntity<Payment> verifyPayment(@RequestBody Map<String, String> payload) {
        try {
            String orderId = payload.get("orderId");
            String paymentId = payload.get("paymentId");
            String signature = payload.get("signature");

            Payment payment = paymentService.verifyPayment(orderId, paymentId, signature);
            return ResponseEntity.ok(payment);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }

}
