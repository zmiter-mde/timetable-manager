package com.mde.univer.kcb.db.vo;

public class Room {

	private long id;
	private int number;
	private int floor;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String toString(){
		return "id: " + id + 
			   " number : " + number + 
			   " floor : " + floor;
	}
}
