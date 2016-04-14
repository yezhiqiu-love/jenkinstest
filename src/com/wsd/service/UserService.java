package com.wsd.service;

import com.wsd.beans.User;

/**
 * 用户Service
 * @author LN
 *
 */
public class UserService {

	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public boolean register(User user){
		boolean result=false;
		if(null!=user && !"".equals(user.getUsername())&&!"".equals(user.getPassword())){
			//do login user database
			result=true;
		}   
		return result;
	}
	
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public boolean login(User user){
		boolean result=false;
		if(null!=user && !"".equals(user.getUsername())&&!"".equals(user.getPassword())){
			//do login user database
			result=true;
		}
		return result;
	}
}
