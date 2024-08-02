package com.exmple.hotelmanagment.service;

import java.util.List;

import com.exmple.hotelmanagment.dto.HotelDTO;

public interface HotelService {
	  	HotelDTO getHotelById(Long id);
	    List<HotelDTO> getAllHotels();
	    HotelDTO createHotel(HotelDTO hotelDTO);
	    HotelDTO updateHotel(Long id, HotelDTO hotelDTO);
	    void deleteHotel(Long id);

}
