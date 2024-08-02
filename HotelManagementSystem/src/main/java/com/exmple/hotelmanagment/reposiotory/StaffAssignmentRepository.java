package com.exmple.hotelmanagment.reposiotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exmple.hotelmanagment.model.StaffAssignment;

@Repository
public interface StaffAssignmentRepository extends JpaRepository<StaffAssignment, Long> {
}