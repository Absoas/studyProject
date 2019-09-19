package com.absoas.yb.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.absoas.yb.home.dao.IUserDao;
import com.absoas.yb.home.model.UserVO;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserDao userDao;
	
	@Override
	public UserVO selectUserList() {
		return userDao.selectUserList();
	}
	
	
}
