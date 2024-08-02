package com.exmple.hotelmanagment.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmple.hotelmanagment.dto.HotelDTO;
import com.exmple.hotelmanagment.exception.ResourceNotFoundException;
import com.exmple.hotelmanagment.model.Hotel;
import com.exmple.hotelmanagment.reposiotory.HotelRepository;
import com.exmple.hotelmanagment.service.HotelService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public HotelDTO getHotelById(Long id) {
        Hotel hotel = hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with id " + id));
        return modelMapper.map(hotel, HotelDTO.class);
    }

    @Override
    public List<HotelDTO> getAllHotels() {
        List<Hotel> hotels = hotelRepository.findAll();
        return hotels.stream()
                .map(hotel -> modelMapper.map(hotel, HotelDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public HotelDTO createHotel(HotelDTO hotelDTO) {
        Hotel hotel = modelMapper.map(hotelDTO, Hotel.class);
        Hotel savedHotel = hotelRepository.save(hotel);
        return modelMapper.map(savedHotel, HotelDTO.class);
    }

    @Override
    public HotelDTO updateHotel(Long id, HotelDTO hotelDTO) {
        Hotel existingHotel = hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with id " + id));
        
        existingHotel.setName(hotelDTO.getName());
        existingHotel.setAddress(hotelDTO.getAddress());
        existingHotel.setNumberOfRooms(hotelDTO.getNumberOfRooms());

        Hotel updatedHotel = hotelRepository.save(existingHotel);
        return modelMapper.map(updatedHotel, HotelDTO.class);
    }

    @Override
    public void deleteHotel(Long id) {
        Hotel existingHotel = hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with id " + id));
        hotelRepository.delete(existingHotel);
    }
}