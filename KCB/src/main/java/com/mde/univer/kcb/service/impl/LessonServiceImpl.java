package com.mde.univer.kcb.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mde.univer.kcb.db.dao.LessonDAO;
import com.mde.univer.kcb.db.mybatis.MyBatisConnectionFactory;
import com.mde.univer.kcb.db.vo.Lesson;
import com.mde.univer.kcb.service.inter.LessonService;


@Service("lessonService")
public class LessonServiceImpl implements LessonService {
	
	@Override
	public List<Lesson> getLessons() {
		LessonDAO lessonDAO = new LessonDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		return lessonDAO.selectAll();
	}

	@Override
	public void addLesson(Lesson lesson) {
		LessonDAO lessonDAO = new LessonDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		lessonDAO.insert(lesson);
	}

	@Override
	public Lesson getLessonById(int id) {
		LessonDAO lessonDAO = new LessonDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		return lessonDAO.selectById(id);		
	}

	@Override
	public void updateLesson(Lesson lesson) {
		LessonDAO lessonDAO = new LessonDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		lessonDAO.update(lesson);			
	}

	@Override
	public void deleteLesson(int id) {
		LessonDAO lessonDAO = new LessonDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		lessonDAO.delete(id);		
	}

}
