package com.mde.univer.kcb.service.inter;

import java.util.List;

import com.mde.univer.kcb.db.vo.Lesson;


public interface LessonService {

	public List<Lesson> getLessons();
	public void addLesson(Lesson lesson);
	public Lesson getLessonById(int id);
	public void updateLesson(Lesson lesson);
	public void deleteLesson(int id);
	
}
