package com.exmple.hotelmanagment.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class StaffAssignmentDTO {
    private Long id;
    private Long staffId; // Reference to the staff
    private Long departmentId; // Reference to the department
    private LocalDate startDate;
    private LocalDate endDate;

}
