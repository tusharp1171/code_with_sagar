package com.exmple.hotelmanagment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class GuestDTO {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;

   
}