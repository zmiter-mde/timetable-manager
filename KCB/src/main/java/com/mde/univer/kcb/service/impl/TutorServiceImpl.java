package com.mde.univer.kcb.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mde.univer.kcb.db.dao.TutorDAO;
import com.mde.univer.kcb.db.mybatis.MyBatisConnectionFactory;
import com.mde.univer.kcb.db.vo.Tutor;
import com.mde.univer.kcb.service.inter.TutorService;


@Service("tutorService")
public class TutorServiceImpl implements TutorService {
	
	@Override
	public List<Tutor> getTutors() {
		TutorDAO tutorDAO = new TutorDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		return tutorDAO.selectAll();
	}

}
