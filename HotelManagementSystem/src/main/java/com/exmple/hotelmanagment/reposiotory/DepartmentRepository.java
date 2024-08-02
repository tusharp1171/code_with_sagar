package com.exmple.hotelmanagment.reposiotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exmple.hotelmanagment.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
