package com.mycompany.myapp09.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("MemberDao")
public class MemberDao {
	@Autowired
	private SqlSession sqlSession;
	
	public int idCheck(String id) throws Exception {
		return sqlSession.selectOne("Member.idCheck", id);
	}
}
