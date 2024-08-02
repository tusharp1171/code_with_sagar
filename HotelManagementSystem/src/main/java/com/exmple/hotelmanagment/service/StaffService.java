package com.exmple.hotelmanagment.service;

import java.util.List;

import com.exmple.hotelmanagment.dto.StaffDTO;

public interface StaffService {
    StaffDTO getStaffById(Long id);
    List<StaffDTO> getAllStaff();
    StaffDTO createStaff(StaffDTO staffDTO);
    StaffDTO updateStaff(Long id, StaffDTO staffDTO);
    void deleteStaff(Long id);
}
