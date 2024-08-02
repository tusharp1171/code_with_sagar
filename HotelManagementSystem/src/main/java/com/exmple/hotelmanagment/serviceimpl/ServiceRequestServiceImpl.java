package com.exmple.hotelmanagment.serviceimpl;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmple.hotelmanagment.dto.ServiceRequestDTO;
import com.exmple.hotelmanagment.exception.ResourceNotFoundException;
import com.exmple.hotelmanagment.model.ServiceRequest;
import com.exmple.hotelmanagment.reposiotory.ServiceRequestRepository;
import com.exmple.hotelmanagment.service.ServiceRequestService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ServiceRequestServiceImpl implements ServiceRequestService {

    @Autowired
    private ServiceRequestRepository serviceRequestRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ServiceRequestDTO getServiceRequestById(Long id) {
        ServiceRequest serviceRequest = serviceRequestRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Service request not found with id " + id));
        return modelMapper.map(serviceRequest, ServiceRequestDTO.class);
    }

    @Override
    public List<ServiceRequestDTO> getAllServiceRequests() {
        List<ServiceRequest> serviceRequests = serviceRequestRepository.findAll();
        return serviceRequests.stream()
                .map(serviceRequest -> modelMapper.map(serviceRequest, ServiceRequestDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ServiceRequestDTO createServiceRequest(ServiceRequestDTO serviceRequestDTO) {
        ServiceRequest serviceRequest = modelMapper.map(serviceRequestDTO, ServiceRequest.class);

        // Ensure that guest and service are properly set if not handled by DTO mapping
        // You might need to fetch these entities from their repositories if they are not included in the DTO
        
        ServiceRequest savedServiceRequest = saveServiceRequest(serviceRequest);

        return modelMapper.map(savedServiceRequest, ServiceRequestDTO.class);
    }
    private ServiceRequest saveServiceRequest(ServiceRequest serviceRequest) {
        // Implementation of saving logic and setting relationships
        ServiceRequest savedServiceRequest = serviceRequestRepository.save(serviceRequest);
        return savedServiceRequest;
    }

    @Override
    public ServiceRequestDTO updateServiceRequest(Long id, ServiceRequestDTO serviceRequestDTO) {
        ServiceRequest existingServiceRequest = serviceRequestRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Service request not found with id " + id));

        existingServiceRequest.setStatus(serviceRequestDTO.getStatus());
        // Add logic to handle other fields if needed

        ServiceRequest updatedServiceRequest = serviceRequestRepository.save(existingServiceRequest);
        return modelMapper.map(updatedServiceRequest, ServiceRequestDTO.class);
    }

    @Override
    public void deleteServiceRequest(Long id) {
        ServiceRequest existingServiceRequest = serviceRequestRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Service request not found with id " + id));
        serviceRequestRepository.delete(existingServiceRequest);
    }
}
