package com.wsd.test;

import org.junit.Test;

import com.wsd.beans.User;
import com.wsd.service.UserService;

import junit.framework.TestCase;
/**
 * 用户相关测试
 * @author LN
 *
 */
public class UserTest extends TestCase{
	/**
	 * 用户注册
	 */
	@Test
	public void testRegister() {
		UserService us = new UserService();
		User user = new User("test","123456");
		boolean flag= us.register(user);
		if(flag){
			System.out.println("注册成功");
		}else{
			fail("注册失败");
		}
	}

	
	/**
	 * 用户登陆
	 */
	@Test
	public void testLogin() {
		UserService us = new UserService();
		User user = new User("111","123456");
		boolean flag= us.register(user);
		if(flag){
			System.out.println("登陆成功");
		}else{
			fail("登陆成功");
		}
	}
}
