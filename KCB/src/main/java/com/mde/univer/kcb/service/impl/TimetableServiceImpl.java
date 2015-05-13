package com.mde.univer.kcb.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mde.univer.kcb.db.dao.TimetableDAO;
import com.mde.univer.kcb.db.mybatis.MyBatisConnectionFactory;
import com.mde.univer.kcb.db.vo.Timetable;
import com.mde.univer.kcb.service.inter.TimetableService;


@Service("timetableService")
public class TimetableServiceImpl implements TimetableService {
	
	@Override
	public List<Timetable> getTimetable() {
		TimetableDAO timetableDAO = new TimetableDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		return timetableDAO.selectAll();
	}

}
