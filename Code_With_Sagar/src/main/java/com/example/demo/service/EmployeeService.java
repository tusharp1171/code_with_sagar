package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.EmployeeDTO;

public interface EmployeeService {
	 EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
	    List<EmployeeDTO> getAllEmployees();
	    Optional<EmployeeDTO> getEmployeeById(Long id);
	    EmployeeDTO updateEmployee(Long id, EmployeeDTO employeeDTO);
	    void deleteEmployee(Long id);

}
