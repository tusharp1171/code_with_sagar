package com.exmple.hotelmanagment.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PaymentDTO {
    private Long id;
    private Long reservationId; // Reference to the reservation
    private Double amount;
    private String paymentMethod;
    private LocalDate paymentDate;

    
}