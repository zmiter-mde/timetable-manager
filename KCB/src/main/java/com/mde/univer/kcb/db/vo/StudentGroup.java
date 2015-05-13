package com.mde.univer.kcb.db.vo;

public class StudentGroup {
	
	private long id;
	private String title;
	private String faculty;
	private int studCount;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public int getStudCount() {
		return studCount;
	}
	public void setStudCount(int studCount) {
		this.studCount = studCount;
	}
	public String toString(){
		return "id: " + id + 
			   " title : " + title + 
			   " faculty : " + faculty + 
			   " studCount : " + studCount;
	}
}
