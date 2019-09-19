package com.absoas.yb.home.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.absoas.yb.home.model.UserVO;

@Repository
public class UserDaoImpl implements IUserDao {
	
	protected static final String NAMESPACE = "com.absoas.yb.home.dao";
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public UserVO selectUserList() {
		return (UserVO) sqlSession.selectOne(NAMESPACE + ".selectUserList");
	}
	
}
