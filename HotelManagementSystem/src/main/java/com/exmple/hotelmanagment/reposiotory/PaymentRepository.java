package com.exmple.hotelmanagment.reposiotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exmple.hotelmanagment.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
