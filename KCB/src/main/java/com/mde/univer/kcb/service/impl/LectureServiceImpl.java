package com.mde.univer.kcb.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mde.univer.kcb.db.dao.LectureDAO;
import com.mde.univer.kcb.db.mybatis.MyBatisConnectionFactory;
import com.mde.univer.kcb.db.vo.Lecture;
import com.mde.univer.kcb.service.inter.LectureService;


@Service("lectureService")
public class LectureServiceImpl implements LectureService {
	
	@Override
	public List<Lecture> getLectures() {
		LectureDAO lectureDAO = new LectureDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		return lectureDAO.selectAll();
	}

}
