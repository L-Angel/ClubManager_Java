package com.clubmanager.admin.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clubmanager.bean.User;
import com.clubmanager.dao.UserDAO;

@Service("LoginSerivce")
public class LoginServiceImpl implements LoginService{
	@Autowired
	@Resource(name="UserDAO")
	private UserDAO userdao;
	public boolean validateUser(String username,String password) throws Exception{
		
		User user =(User) this.userdao.findByUsername(username).get(0);
		if(user.getPassword().equals(password)){
			return true;
		}
		return false;
	}

}
