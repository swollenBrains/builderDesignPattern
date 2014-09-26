package com.ankitgupta.designPatterns.builder.house;

import com.ankitgupta.designPatterns.builder.house.House.HouseBuilder;

public class HouseBuilderDemo {

	public static void main(String[] args) {
		HouseBuilder houseBuilder = new HouseBuilder();
		houseBuilder.setDiningArea("marble dining area");
		houseBuilder.setDrawingRoom("Bean bags");
		houseBuilder.setParking("Two wheeler");
		House house = houseBuilder.build();
		System.out.println(house);
	}
	
}
