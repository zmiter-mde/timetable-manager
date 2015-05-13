package com.mde.univer.kcb.db.vo;

public class Subject {

	private long id;
	private String title;
	private boolean needPc;
	private boolean needLab;
	
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
	public boolean isNeedPc() {
		return needPc;
	}
	public void setNeedPc(boolean needPc) {
		this.needPc = needPc;
	}
	public boolean isNeedLab() {
		return needLab;
	}
	public void setNeedLab(boolean needLab) {
		this.needLab = needLab;
	}
	public String toString(){
		return "id: " + id + 
			   " title : " + title + 
			   " needPc : " + needPc + 
			   " needLab : " + needLab;
	}
}
