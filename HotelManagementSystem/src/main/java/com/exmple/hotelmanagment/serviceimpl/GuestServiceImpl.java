package com.exmple.hotelmanagment.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exmple.hotelmanagment.dto.GuestDTO;
import com.exmple.hotelmanagment.exception.ResourceNotFoundException;
import com.exmple.hotelmanagment.model.Guest;
import com.exmple.hotelmanagment.reposiotory.GuestRepository;
import com.exmple.hotelmanagment.service.GuestService;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public GuestDTO getGuestById(Long id) {
        Guest guest = guestRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Guest not found with id " + id));
        return modelMapper.map(guest, GuestDTO.class);
    }

    @Override
    public List<GuestDTO> getAllGuests() {
        List<Guest> guests = guestRepository.findAll();
        return guests.stream()
                .map(guest -> modelMapper.map(guest, GuestDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public GuestDTO createGuest(GuestDTO guestDTO) {
        Guest guest = modelMapper.map(guestDTO, Guest.class);
        Guest savedGuest = guestRepository.save(guest);
        return modelMapper.map(savedGuest, GuestDTO.class);
    }

    @Override
    public GuestDTO updateGuest(Long id, GuestDTO guestDTO) {
        Guest existingGuest = guestRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Guest not found with id " + id));
        
        existingGuest.setName(guestDTO.getName());
        existingGuest.setEmail(guestDTO.getEmail());
        existingGuest.setPhoneNumber(guestDTO.getPhoneNumber());

        Guest updatedGuest = guestRepository.save(existingGuest);
        return modelMapper.map(updatedGuest, GuestDTO.class);
    }

    @Override
    public void deleteGuest(Long id) {
        Guest existingGuest = guestRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Guest not found with id " + id));
        guestRepository.delete(existingGuest);
    }
}