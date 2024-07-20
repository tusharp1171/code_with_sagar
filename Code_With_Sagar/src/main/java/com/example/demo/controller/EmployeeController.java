package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

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

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.service.EmployeeService;
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	  @Autowired
	    private EmployeeService employeeService;

	    @PostMapping
	    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
	        return new ResponseEntity<>(employeeService.createEmployee(employeeDTO), HttpStatus.CREATED);
	    }

	    @GetMapping
	    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
	        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id) {
	        Optional<EmployeeDTO> employeeDTO = employeeService.getEmployeeById(id);
	        return employeeDTO.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO) {
	        return new ResponseEntity<>(employeeService.updateEmployee(id, employeeDTO), HttpStatus.OK);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
	        employeeService.deleteEmployee(id);
	        return ResponseEntity.noContent().build();
	    }
}
