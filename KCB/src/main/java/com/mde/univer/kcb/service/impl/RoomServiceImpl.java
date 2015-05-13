package com.mde.univer.kcb.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mde.univer.kcb.db.dao.RoomDAO;
import com.mde.univer.kcb.db.mybatis.MyBatisConnectionFactory;
import com.mde.univer.kcb.db.vo.Room;
import com.mde.univer.kcb.service.inter.RoomService;


@Service("roomService")
public class RoomServiceImpl implements RoomService {
	
	@Override
	public List<Room> getRooms() {
		RoomDAO roomDAO = new RoomDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		return roomDAO.selectAll();
	}

}
