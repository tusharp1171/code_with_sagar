package com.exmple.hotelmanagment.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ReservationDTO {
    private Long id;
    private Long guestId; // Reference to the guest
    private Long roomId;  // Reference to the room
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String status;

   
}
