package com.mde.univer.kcb.db.vo;

public class Tutor {

	private long id;
	private String name;
	private String surname;
	private String patronymic;
	private int expierence;
	private int workload;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	public int getExpierence() {
		return expierence;
	}
	public void setExpierence(int expierence) {
		this.expierence = expierence;
	}
	public int getWorkload() {
		return workload;
	}
	public void setWorkload(int workload) {
		this.workload = workload;
	}
	public String toString(){
		return "id: " + id + 
			   " name : " + name + 
			   " surname : " + surname + 
			   " patronymic : " + patronymic + 
			   " expierence : " + expierence + 
			   " workload : " + workload;
	}
}
