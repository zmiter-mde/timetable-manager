package com.mde.univer.kcb.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mde.univer.kcb.db.dao.UserDAO;
import com.mde.univer.kcb.db.mybatis.MyBatisConnectionFactory;
import com.mde.univer.kcb.db.vo.User;
import com.mde.univer.kcb.service.inter.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Override
	public List<User> getUsers() {
		UserDAO userDAO = new UserDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		return userDAO.selectAll();
	}

}
