package com.exmple.hotelmanagment.reposiotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exmple.hotelmanagment.model.Services;

@Repository
public interface ServiceRepository extends JpaRepository<Services, Long> {
}