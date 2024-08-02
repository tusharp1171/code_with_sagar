package com.exmple.hotelmanagment.service;

import java.util.List;

import com.exmple.hotelmanagment.dto.RoomDTO;

public interface RoomService {
	 RoomDTO getRoomById(Long id);
	    List<RoomDTO> getAllRooms();
	    RoomDTO createRoom(RoomDTO roomDTO);
	    RoomDTO updateRoom(Long id, RoomDTO roomDTO);
	    void deleteRoom(Long id);
}
