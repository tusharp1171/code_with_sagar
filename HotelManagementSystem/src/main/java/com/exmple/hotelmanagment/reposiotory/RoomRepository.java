package com.exmple.hotelmanagment.reposiotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exmple.hotelmanagment.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
	
}
