package com.exmple.hotelmanagment.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmple.hotelmanagment.dto.RoomDTO;
import com.exmple.hotelmanagment.exception.ResourceNotFoundException;
import com.exmple.hotelmanagment.model.Room;
import com.exmple.hotelmanagment.reposiotory.RoomRepository;
import com.exmple.hotelmanagment.service.RoomService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public RoomDTO getRoomById(Long id) {
        Room room = roomRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Room not found with id " + id));
        return modelMapper.map(room, RoomDTO.class);
    }

    @Override
    public List<RoomDTO> getAllRooms() {
        List<Room> rooms = roomRepository.findAll();
        return rooms.stream()
                .map(room -> modelMapper.map(room, RoomDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public RoomDTO createRoom(RoomDTO roomDTO) {
        Room room = modelMapper.map(roomDTO, Room.class);
        Room savedRoom = roomRepository.save(room);
        return modelMapper.map(savedRoom, RoomDTO.class);
    }

    @Override
    public RoomDTO updateRoom(Long id, RoomDTO roomDTO) {
        Room existingRoom = roomRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Room not found with id " + id));
        
        existingRoom.setRoomNumber(roomDTO.getRoomNumber());
        existingRoom.setType(roomDTO.getType());
        existingRoom.setIsAvailable(roomDTO.getIsAvailable());

        Room updatedRoom = roomRepository.save(existingRoom);
        return modelMapper.map(updatedRoom, RoomDTO.class);
    }

    @Override
    public void deleteRoom(Long id) {
        Room existingRoom = roomRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Room not found with id " + id));
        roomRepository.delete(existingRoom);
    }
}
