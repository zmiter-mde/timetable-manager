package com.mde.univer.kcb.db;

import java.util.List;

import com.mde.univer.kcb.db.dao.*;
import com.mde.univer.kcb.db.mybatis.MyBatisConnectionFactory;
import com.mde.univer.kcb.db.vo.*;

public class Main {

	public static void main(String args[]){
		
		// Laod spring-config.xml file
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hmkcode/config/spring-config.xml");
		
		//get jdbcTemplatePersonDAO
		//UserDAO userDAO = new UserDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		/*
		//create person bean to insert
		Person person = new Person();
		person.setName("Person 1");
		
		//( 1 ) insert person 
		personDAO.insert(person);

		//**set name of person
		person.setName("Person 2");	
		//** insert another person
		int id = personDAO.insert(person);
		
		//( 2 ) select persons by id
		personDAO.selectById(id);
		
		*/
		
		//( 3 ) select all
		/*
		List<User> users = userDAO.selectAll();
		for (User user : users)
			System.out.println(user);
		*/
		/*
		//**set name of all persons
		for(int i = 0; i < persons.size(); i++){
			persons.get(i).setName("Person Name "+i);
			//( 4 ) update person
			personDAO.update(persons.get(i));
		}
				
		//**check update
		persons = personDAO.selectAll();

		*/
		testUsers();
		testLectures();
		testLessons();
	}
	
	private static void testUsers() {
		UserDAO userDAO = new UserDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		List<User> users = userDAO.selectAll();
		for (User user : users)
			System.out.println(user);
	}
	
	private static void testLectures() {
		LectureDAO lectureDAO = new LectureDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		List<Lecture> lectures = lectureDAO.selectAll();
		for (Lecture lecture : lectures)
			System.out.println(lecture);
	}
	
	private static void testLessons() {
		LessonDAO lessonDAO = new LessonDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		List<Lesson> lessons = lessonDAO.selectAll();
		for (Lesson lesson : lessons)
			System.out.println(lesson);
	}
}
