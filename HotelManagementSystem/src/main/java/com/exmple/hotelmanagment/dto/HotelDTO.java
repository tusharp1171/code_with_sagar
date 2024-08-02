package com.exmple.hotelmanagment.dto;

import lombok.Data;

@Data

public class HotelDTO {
    private Long id;
    private String name;
    private String address;
    private Integer numberOfRooms;
}
