package com.fashion.gtest.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component

public class OrderDefaultResponseDTO {

	private String userName;
	private String orderDate;
	private int totalOrderCost;
	private String status;

}
