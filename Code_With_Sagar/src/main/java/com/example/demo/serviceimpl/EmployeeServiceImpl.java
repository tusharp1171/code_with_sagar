package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	 @Autowired
	    private EmployeeRepository employeeRepository;

	    @Autowired
	    private ModelMapper modelMapper;
	    
	    

	    @Override
	    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
	        Employee employee = modelMapper.map(employeeDTO, Employee.class);
	        employee = employeeRepository.save(employee);
	        return modelMapper.map(employee, EmployeeDTO.class);
	    }

	    @Override
	    public List<EmployeeDTO> getAllEmployees() {
	        return employeeRepository.findAll().stream()
	                .map(employee -> modelMapper.map(employee, EmployeeDTO.class))
	                .collect(Collectors.toList());
	    }

	    @Override
	    public Optional<EmployeeDTO> getEmployeeById(Long id) {
	        return employeeRepository.findById(id)
	                .map(employee -> modelMapper.map(employee, EmployeeDTO.class));
	    }

	    @Override
	    public EmployeeDTO updateEmployee(Long id, EmployeeDTO employeeDTO) {
	        Employee existingEmployee = employeeRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Employee not found"));
	        modelMapper.map(employeeDTO, existingEmployee);
	        existingEmployee = employeeRepository.save(existingEmployee);
	        return modelMapper.map(existingEmployee, EmployeeDTO.class);
	    }

	    @Override
	    public void deleteEmployee(Long id) {
	        employeeRepository.deleteById(id);
	    }
}
