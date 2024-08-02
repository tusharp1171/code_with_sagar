package com.exmple.hotelmanagment.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exmple.hotelmanagment.dto.ReservationDTO;
import com.exmple.hotelmanagment.exception.ResourceNotFoundException;
import com.exmple.hotelmanagment.model.Guest;
import com.exmple.hotelmanagment.model.Reservation;
import com.exmple.hotelmanagment.model.Room;
import com.exmple.hotelmanagment.reposiotory.ReservationRepository;
import com.exmple.hotelmanagment.service.ReservationService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ReservationDTO getReservationById(Long id) {
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reservation not found with id " + id));
        return modelMapper.map(reservation, ReservationDTO.class);
    }

    @Override
    public List<ReservationDTO> getAllReservations() {
        List<Reservation> reservations = reservationRepository.findAll();
        return reservations.stream()
                .map(reservation -> modelMapper.map(reservation, ReservationDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ReservationDTO createReservation(ReservationDTO reservationDTO) {
        Reservation reservation = modelMapper.map(reservationDTO, Reservation.class);
        Reservation savedReservation = reservationRepository.save(reservation);
        return modelMapper.map(savedReservation, ReservationDTO.class);
    }

    @Override
    public ReservationDTO updateReservation(Long id, ReservationDTO reservationDTO) {
        Reservation existingReservation = reservationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reservation not found with id " + id));
        
        existingReservation.setGuest(modelMapper.map(reservationDTO.getGuestId(), Guest.class));
        existingReservation.setRoom(modelMapper.map(reservationDTO.getRoomId(), Room.class));
        existingReservation.setCheckInDate(reservationDTO.getCheckInDate());
        existingReservation.setCheckOutDate(reservationDTO.getCheckOutDate());
        existingReservation.setStatus(reservationDTO.getStatus());

        Reservation updatedReservation = reservationRepository.save(existingReservation);
        return modelMapper.map(updatedReservation, ReservationDTO.class);
    }

    @Override
    public void deleteReservation(Long id) {
        Reservation existingReservation = reservationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reservation not found with id " + id));
        reservationRepository.delete(existingReservation);
    }
}