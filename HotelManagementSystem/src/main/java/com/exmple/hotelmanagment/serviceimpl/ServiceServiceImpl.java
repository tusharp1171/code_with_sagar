package com.exmple.hotelmanagment.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmple.hotelmanagment.dto.ServiceDTO;
import com.exmple.hotelmanagment.exception.ResourceNotFoundException;
import com.exmple.hotelmanagment.model.Services;
import com.exmple.hotelmanagment.reposiotory.ServiceRepository;
import com.exmple.hotelmanagment.service.ServiceService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ServiceDTO getServiceById(Long id) {
        Services serviceEntity = serviceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Service not found with id " + id));
        return modelMapper.map(serviceEntity, ServiceDTO.class);
    }

    @Override
    public List<ServiceDTO> getAllServices() {
        List<Services> services = serviceRepository.findAll();
        return services.stream()
                .map(service -> modelMapper.map(service, ServiceDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ServiceDTO createService(ServiceDTO serviceDTO) {
        Services serviceEntity = modelMapper.map(serviceDTO, Services.class);
        Services savedServiceEntity = serviceRepository.save(serviceEntity);
        return modelMapper.map(savedServiceEntity, ServiceDTO.class);
    }

    @Override
    public ServiceDTO updateService(Long id, ServiceDTO serviceDTO) {
        Services existingServiceEntity = serviceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Service not found with id " + id));
        
        existingServiceEntity.setName(serviceDTO.getName());
        existingServiceEntity.setPrice(serviceDTO.getPrice());

        Services updatedServiceEntity = serviceRepository.save(existingServiceEntity);
        return modelMapper.map(updatedServiceEntity, ServiceDTO.class);
    }

    @Override
    public void deleteService(Long id) {
        Services existingServiceEntity = serviceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Service not found with id " + id));
        serviceRepository.delete(existingServiceEntity);
    }
}