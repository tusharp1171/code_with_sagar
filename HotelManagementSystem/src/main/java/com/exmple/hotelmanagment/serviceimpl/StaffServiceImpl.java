package com.exmple.hotelmanagment.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmple.hotelmanagment.dto.StaffDTO;
import com.exmple.hotelmanagment.exception.ResourceNotFoundException;
import com.exmple.hotelmanagment.model.Staff;
import com.exmple.hotelmanagment.reposiotory.StaffRepository;
import com.exmple.hotelmanagment.service.StaffService;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public StaffDTO getStaffById(Long id) {
        Staff staff = staffRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Staff not found with id " + id));
        return modelMapper.map(staff, StaffDTO.class);
    }

    @Override
    public List<StaffDTO> getAllStaff() {
        List<Staff> staffList = staffRepository.findAll();
        return staffList.stream()
                .map(staff -> modelMapper.map(staff, StaffDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public StaffDTO createStaff(StaffDTO staffDTO) {
        Staff staff = modelMapper.map(staffDTO, Staff.class);
        Staff savedStaff = staffRepository.save(staff);
        return modelMapper.map(savedStaff, StaffDTO.class);
    }

    @Override
    public StaffDTO updateStaff(Long id, StaffDTO staffDTO) {
        Staff existingStaff = staffRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Staff not found with id " + id));
        
        existingStaff.setName(staffDTO.getName());
       // existingStaff.setPosition(staffDTO.getPosition());
       // existingStaff.setEmail(staffDTO.getEmail());

        Staff updatedStaff = staffRepository.save(existingStaff);
        return modelMapper.map(updatedStaff, StaffDTO.class);
    }

    @Override
    public void deleteStaff(Long id) {
        Staff existingStaff = staffRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Staff not found with id " + id));
        staffRepository.delete(existingStaff);
    }
}