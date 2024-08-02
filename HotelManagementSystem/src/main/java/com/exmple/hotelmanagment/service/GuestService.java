package com.exmple.hotelmanagment.service;

import java.util.List;

import com.exmple.hotelmanagment.dto.GuestDTO;

public interface GuestService {
	GuestDTO getGuestById(Long id);
    List<GuestDTO> getAllGuests();
    GuestDTO createGuest(GuestDTO guestDTO);
    GuestDTO updateGuest(Long id, GuestDTO guestDTO);
    void deleteGuest(Long id);
}
