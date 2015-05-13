package com.mde.univer.kcb.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mde.univer.kcb.db.dao.SubjectDAO;
import com.mde.univer.kcb.db.mybatis.MyBatisConnectionFactory;
import com.mde.univer.kcb.db.vo.Subject;
import com.mde.univer.kcb.service.inter.SubjectService;


@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {
	
	@Override
	public List<Subject> getSubjects() {
		SubjectDAO subjectDAO = new SubjectDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		return subjectDAO.selectAll();
	}

}
