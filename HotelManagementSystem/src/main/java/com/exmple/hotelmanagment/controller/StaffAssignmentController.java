package com.exmple.hotelmanagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exmple.hotelmanagment.dto.StaffAssignmentDTO;
import com.exmple.hotelmanagment.service.StaffAssignmentService;

@RestController
@RequestMapping("/api/staff-assignments")
public class StaffAssignmentController {

    @Autowired
    private StaffAssignmentService staffAssignmentService;

    @PostMapping
    public ResponseEntity<StaffAssignmentDTO> createStaffAssignment(@RequestBody StaffAssignmentDTO staffAssignmentDTO) {
        StaffAssignmentDTO createdStaffAssignment = staffAssignmentService.createStaffAssignment(staffAssignmentDTO);
        return new ResponseEntity<>(createdStaffAssignment, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StaffAssignmentDTO> getStaffAssignmentById(@PathVariable Long id) {
        StaffAssignmentDTO staffAssignmentDTO = staffAssignmentService.getStaffAssignmentById(id);
        return ResponseEntity.ok(staffAssignmentDTO);
    }

    @GetMapping
    public ResponseEntity<List<StaffAssignmentDTO>> getAllStaffAssignments() {
        List<StaffAssignmentDTO> staffAssignments = staffAssignmentService.getAllStaffAssignments();
        return ResponseEntity.ok(staffAssignments);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StaffAssignmentDTO> updateStaffAssignment(@PathVariable Long id, @RequestBody StaffAssignmentDTO staffAssignmentDTO) {
        StaffAssignmentDTO updatedStaffAssignment = staffAssignmentService.updateStaffAssignment(id, staffAssignmentDTO);
        return ResponseEntity.ok(updatedStaffAssignment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStaffAssignment(@PathVariable Long id) {
        staffAssignmentService.deleteStaffAssignment(id);
        return ResponseEntity.noContent().build();
    }
}