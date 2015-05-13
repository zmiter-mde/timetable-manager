package com.mde.univer.kcb.db.vo;

public class Lecture {

	private long id;
	private int number;
	private int dayOfWeek;
	
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
	public int getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	
	public String toString(){
		return "id: " + id + 
			   " Number: " + number + 
			   " Day of week : " + dayOfWeek;
	}
	
}
