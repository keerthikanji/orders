package com.fashion.gtest.comparator;

import java.util.Comparator;

import com.fashion.gtest.entity.Order;

public class sortingBasedOnorderDateLowtoHigh implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		// TODO Auto-generated method stub
		return o1.getOrderDate().compareTo(o2.getOrderDate());
	}

}
