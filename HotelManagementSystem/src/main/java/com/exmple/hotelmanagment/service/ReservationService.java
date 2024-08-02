package com.exmple.hotelmanagment.service;

import java.util.List;

import com.exmple.hotelmanagment.dto.ReservationDTO;

public interface ReservationService {
    ReservationDTO getReservationById(Long id);
    List<ReservationDTO> getAllReservations();
    ReservationDTO createReservation(ReservationDTO reservationDTO);
    ReservationDTO updateReservation(Long id, ReservationDTO reservationDTO);
    void deleteReservation(Long id);
}