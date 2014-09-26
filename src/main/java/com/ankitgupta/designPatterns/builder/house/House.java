package com.ankitgupta.designPatterns.builder.house;

/**
 * This demos internal builder
 * @author ankit gupta
 *
 */
public class House {

	private String parking;
	private String drawingRoom;
	private String diningArea;
	
	private House(HouseBuilder builder){
		this.parking = builder.parking;
		this.drawingRoom = builder.drawingRoom;
		this.diningArea = builder.diningArea;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getDrawingRoom() {
		return drawingRoom;
	}

	public void setDrawingRoom(String drawingRoom) {
		this.drawingRoom = drawingRoom;
	}

	public String getDiningArea() {
		return diningArea;
	}

	public void setDiningArea(String diningArea) {
		this.diningArea = diningArea;
	}
	
	@Override
	public String toString() {
		return "House [parking=" + parking + ", drawingRoom=" + drawingRoom
				+ ", diningArea=" + diningArea + "]";
	}

	public static class HouseBuilder{
		private String parking;
		private String drawingRoom;
		private String diningArea;
		public HouseBuilder setParking(String parking) {
			this.parking = parking;
			return this;
		}
		public HouseBuilder setDrawingRoom(String drawingRoom) {
			this.drawingRoom = drawingRoom;
			return this;
		}
		public HouseBuilder setDiningArea(String diningArea) {
			this.diningArea = diningArea;
			return this;
		}
		
		public House build(){
			return new House(this);
		}
	};

}
