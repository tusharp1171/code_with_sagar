package com.exmple.hotelmanagment.reposiotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exmple.hotelmanagment.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
    // You can define custom query methods here if needed
}