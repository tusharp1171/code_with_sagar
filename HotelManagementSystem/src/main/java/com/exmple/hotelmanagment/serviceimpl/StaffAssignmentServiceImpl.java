package com.exmple.hotelmanagment.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exmple.hotelmanagment.dto.StaffAssignmentDTO;
import com.exmple.hotelmanagment.exception.ResourceNotFoundException;
import com.exmple.hotelmanagment.model.Department;
import com.exmple.hotelmanagment.model.Staff;
import com.exmple.hotelmanagment.model.StaffAssignment;
import com.exmple.hotelmanagment.reposiotory.StaffAssignmentRepository;
import com.exmple.hotelmanagment.service.StaffAssignmentService;
@Repository
public class StaffAssignmentServiceImpl implements StaffAssignmentService {

	 @Autowired
	    private StaffAssignmentRepository staffAssignmentRepository;

	    @Autowired
	    private ModelMapper modelMapper;

	    @Override
	    public StaffAssignmentDTO getStaffAssignmentById(Long id) {
	        StaffAssignment staffAssignment = staffAssignmentRepository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("StaffAssignment not found with id " + id));
	        return modelMapper.map(staffAssignment, StaffAssignmentDTO.class);
	    }

	    @Override
	    public List<StaffAssignmentDTO> getAllStaffAssignments() {
	        List<StaffAssignment> staffAssignments = staffAssignmentRepository.findAll();
	        return staffAssignments.stream()
	                .map(staffAssignment -> modelMapper.map(staffAssignment, StaffAssignmentDTO.class))
	                .collect(Collectors.toList());
	    }

	    @Override
	    public StaffAssignmentDTO createStaffAssignment(StaffAssignmentDTO staffAssignmentDTO) {
	        StaffAssignment staffAssignment = modelMapper.map(staffAssignmentDTO, StaffAssignment.class);
	        StaffAssignment savedStaffAssignment = staffAssignmentRepository.save(staffAssignment);
	        return modelMapper.map(savedStaffAssignment, StaffAssignmentDTO.class);
	    }

	    @Override
	    public StaffAssignmentDTO updateStaffAssignment(Long id, StaffAssignmentDTO staffAssignmentDTO) {
	        StaffAssignment existingStaffAssignment = staffAssignmentRepository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("StaffAssignment not found with id " + id));
	        
	        existingStaffAssignment.setStaff(modelMapper.map(staffAssignmentDTO.getStaffId(), Staff.class));
	        existingStaffAssignment.setDepartment(modelMapper.map(staffAssignmentDTO.getDepartmentId(), Department.class));
	        existingStaffAssignment.setStartDate(staffAssignmentDTO.getStartDate());
	        existingStaffAssignment.setEndDate(staffAssignmentDTO.getEndDate());

	        StaffAssignment updatedStaffAssignment = staffAssignmentRepository.save(existingStaffAssignment);
	        return modelMapper.map(updatedStaffAssignment, StaffAssignmentDTO.class);
	    }

	    @Override
	    public void deleteStaffAssignment(Long id) {
	        StaffAssignment existingStaffAssignment = staffAssignmentRepository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("StaffAssignment not found with id " + id));
	        staffAssignmentRepository.delete(existingStaffAssignment);
	    }
	}
