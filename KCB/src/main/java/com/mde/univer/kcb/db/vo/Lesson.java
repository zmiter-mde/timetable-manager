package com.mde.univer.kcb.db.vo;

public class Lesson {

	private long id;
	private long groupId;
	private long roomId;
	private long tutorId;
	private long subjectId;
	private long lectureId;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public long getTutorId() {
		return tutorId;
	}
	public void setTutorId(long tutorId) {
		this.tutorId = tutorId;
	}
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public long getLectureId() {
		return lectureId;
	}
	public void setLectureId(long lectureId) {
		this.lectureId = lectureId;
	}
	
	public String toString(){
		return "Group id : " + groupId + 
			   " Room id : " + roomId + 
			   " Tutor id : " + tutorId +
			   " Subject id : " + subjectId + 
			   " Lecture id : " + lectureId;
	}
}
