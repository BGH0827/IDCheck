package com.mycompany.myapp09.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp09.model.dao.MemberDao;

@Service("MemberService")
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public int idCheck(String id) throws Exception {
		return memberDao.idCheck(id);
	}
}
