package com.exmple.hotelmanagment.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ServiceRequestDTO {
    private Long id;
    private Long guestId; // Reference to the guest
    private Long serviceId; // Reference to the service
    private LocalDateTime requestDate;
    private String status;
}
