package com.exmple.hotelmanagment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StaffDTO {
    private Long id;
    private String name;
    private String role;
    private String contactInfo;

    // Getters and Setters
}