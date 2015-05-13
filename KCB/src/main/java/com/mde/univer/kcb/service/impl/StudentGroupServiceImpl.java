package com.mde.univer.kcb.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mde.univer.kcb.db.dao.StudentGroupDAO;
import com.mde.univer.kcb.db.mybatis.MyBatisConnectionFactory;
import com.mde.univer.kcb.db.vo.StudentGroup;
import com.mde.univer.kcb.service.inter.StudentGroupService;


@Service("studentGroupService")
public class StudentGroupServiceImpl implements StudentGroupService {
	
	@Override
	public List<StudentGroup> getStudentGroups() {
		StudentGroupDAO studentGroupDAO = new StudentGroupDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		return studentGroupDAO.selectAll();
	}

}
