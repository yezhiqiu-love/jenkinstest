package com.wsd.service;

import com.wsd.beans.User;

/**
 * �û�Service
 * @author LN
 *
 */
public class UserService {

	/**
	 * �û�ע��
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
	 * �û���¼
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
