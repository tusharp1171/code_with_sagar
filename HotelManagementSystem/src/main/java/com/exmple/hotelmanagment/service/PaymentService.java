package com.exmple.hotelmanagment.service;

import java.util.List;

import com.exmple.hotelmanagment.dto.PaymentDTO;

public interface PaymentService {
    PaymentDTO getPaymentById(Long id);
    List<PaymentDTO> getAllPayments();
    PaymentDTO createPayment(PaymentDTO paymentDTO);
    PaymentDTO updatePayment(Long id, PaymentDTO paymentDTO);
    void deletePayment(Long id);
}