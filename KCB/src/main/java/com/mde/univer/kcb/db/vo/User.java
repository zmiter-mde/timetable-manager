package com.mde.univer.kcb.db.vo;

public class User  {

	private int id;
	private String surname;
	private String patronymic;
	private String username;
	private String pass;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPassword(String pass) {
		this.pass = pass;
	}
	
	public String toString(){
		return "id: " + id + " Surname: " + surname;
	}
	
}
