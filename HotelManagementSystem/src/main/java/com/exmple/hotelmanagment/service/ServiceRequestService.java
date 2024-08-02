package com.exmple.hotelmanagment.service;

import java.util.List;

import com.exmple.hotelmanagment.dto.ServiceRequestDTO;

public interface ServiceRequestService {
	ServiceRequestDTO getServiceRequestById(Long id);
    List<ServiceRequestDTO> getAllServiceRequests();
    ServiceRequestDTO createServiceRequest(ServiceRequestDTO serviceRequestDTO);
    ServiceRequestDTO updateServiceRequest(Long id, ServiceRequestDTO serviceRequestDTO);
    void deleteServiceRequest(Long id);

}
