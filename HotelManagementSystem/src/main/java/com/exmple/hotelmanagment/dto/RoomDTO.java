package com.exmple.hotelmanagment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RoomDTO {
    private Long id;
    private String roomNumber;
    private String type;
    private Boolean isAvailable;
    private Long hotelId; 
   
}
