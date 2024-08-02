package com.exmple.hotelmanagment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ServiceDTO {
	private Long id;
	private String name;
	private Double price;

}
