package com.exmple.hotelmanagment.service;

import java.util.List;

import com.exmple.hotelmanagment.dto.StaffAssignmentDTO;

public interface StaffAssignmentService {
	StaffAssignmentDTO getStaffAssignmentById(Long id);
    List<StaffAssignmentDTO> getAllStaffAssignments();
    StaffAssignmentDTO createStaffAssignment(StaffAssignmentDTO staffAssignmentDTO);
    StaffAssignmentDTO updateStaffAssignment(Long id, StaffAssignmentDTO staffAssignmentDTO);
    void deleteStaffAssignment(Long id);

}
