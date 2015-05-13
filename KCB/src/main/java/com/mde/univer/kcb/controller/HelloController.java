package com.mde.univer.kcb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mde.univer.kcb.db.vo.*;
import com.mde.univer.kcb.service.impl.*;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello(Model model) {
		System.out.println("Hello");
		List<User> users = new UserServiceImpl().getUsers();
		model.addAttribute("users", users);
		model.addAttribute("greeting", "Hello, World!!!");
		model.addAttribute("salary", 1000);
		return "hello";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView sayHi() {
		ModelAndView model1 = new ModelAndView("hello");
		List<User> users = new UserServiceImpl().getUsers();
		model1.addObject("users", users);
		return model1;
	}
	
	@RequestMapping(value = "/lectures", method = RequestMethod.GET)
	public ModelAndView getLectures() {
		ModelAndView model1 = new ModelAndView("lectures");
		List<Lecture> lectures = new LectureServiceImpl().getLectures();
		model1.addObject("lectures", lectures);
		return model1;
	}
	
	@RequestMapping(value = "/lessons", method = RequestMethod.GET)
	public ModelAndView getLessons() {
		ModelAndView model1 = new ModelAndView("lessons");
		List<Timetable> lessons = new TimetableServiceImpl().getTimetable();
		model1.addObject("lessons", lessons);
		return model1;
	}
	
	@RequestMapping(value = "/rooms", method = RequestMethod.GET)
	public ModelAndView getRooms() {
		ModelAndView model1 = new ModelAndView("rooms");
		List<Room> rooms = new RoomServiceImpl().getRooms();
		model1.addObject("rooms", rooms);
		return model1;
	}
	
	@RequestMapping(value = "/studentGroups", method = RequestMethod.GET)
	public ModelAndView getStudentGroups() {
		ModelAndView model1 = new ModelAndView("studentGroups");
		List<StudentGroup> studentGroups = new StudentGroupServiceImpl().getStudentGroups();
		model1.addObject("studentGroups", studentGroups);
		return model1;
	}
	
	@RequestMapping(value = "/subjects", method = RequestMethod.GET)
	public ModelAndView getSubjects() {
		ModelAndView model1 = new ModelAndView("subjects");
		List<Subject> subjects = new SubjectServiceImpl().getSubjects();
		model1.addObject("subjects", subjects);
		return model1;
	}
	
	@RequestMapping(value = "/tutors", method = RequestMethod.GET)
	public ModelAndView getTutors() {
		ModelAndView model1 = new ModelAndView("tutors");
		List<Tutor> tutors = new TutorServiceImpl().getTutors();
		model1.addObject("tutors", tutors);
		return model1;
	}	
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ModelAndView getUsers() {
		ModelAndView model1 = new ModelAndView("users");
		List<User> users = new UserServiceImpl().getUsers();
		model1.addObject("users", users);
		return model1;
	}
	
	@RequestMapping(value = "/createLesson", method = RequestMethod.GET)
	public ModelAndView getCreateLesson() {
		ModelAndView model1 = new ModelAndView("createLesson");
		model1.addObject("action", "title.createLesson");
		model1.addObject("lesson", new Lesson());
		return model1;
	}
	
	@RequestMapping(value = "/createLesson", method = RequestMethod.POST)
	public ModelAndView postCreateLesson(@ModelAttribute("lesson") Lesson lesson) {
		ModelAndView model1 = new ModelAndView("hello");
		new LessonServiceImpl().addLesson(lesson);
		model1.addObject("greeting", "saved");
		return model1;
	}
	
	@RequestMapping(value = "/editLesson", method = RequestMethod.GET)
	public ModelAndView getEditLesson(HttpServletRequest request) {
		ModelAndView model1 = new ModelAndView("editLesson");
		model1.addObject("action", "title.editLesson");
		int id = Integer.parseInt(request.getParameter("lessonId"));
		System.out.println(id);
		Lesson lesson = new LessonServiceImpl().getLessonById(id);
		model1.addObject("lesson", lesson);
		model1.addObject("greeting", "saved");
		return model1;
	}
	
	@RequestMapping(value = "/editLesson", method = RequestMethod.POST)
	public ModelAndView postEditLesson(@ModelAttribute("lesson") Lesson lesson) {
		ModelAndView model1 = new ModelAndView("hello");
		new LessonServiceImpl().updateLesson(lesson);
		model1.addObject("greeting", "updated");
		return model1;
	}
	
	@RequestMapping(value = "/deleteLesson", method = RequestMethod.GET)
	public ModelAndView getDeleteLesson(HttpServletRequest request) {
		ModelAndView model1 = new ModelAndView("hello");
		int id = Integer.parseInt(request.getParameter("id"));
		new LessonServiceImpl().deleteLesson(id);
		model1.addObject("greeting", "deleted");
		return model1;
	}

}
