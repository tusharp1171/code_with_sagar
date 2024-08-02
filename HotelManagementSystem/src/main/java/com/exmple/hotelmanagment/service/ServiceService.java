package com.exmple.hotelmanagment.service;

import java.util.List;

import com.exmple.hotelmanagment.dto.ServiceDTO;

public interface ServiceService {
	ServiceDTO getServiceById(Long id);
    List<ServiceDTO> getAllServices();
    ServiceDTO createService(ServiceDTO serviceDTO);
    ServiceDTO updateService(Long id, ServiceDTO serviceDTO);
    void deleteService(Long id);
}
