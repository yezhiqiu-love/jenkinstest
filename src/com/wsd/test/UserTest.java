package com.wsd.test;

import org.junit.Test;

import com.wsd.beans.User;
import com.wsd.service.UserService;

import junit.framework.TestCase;
/**
 * �û���ز���
 * @author LN
 *
 */
public class UserTest extends TestCase{
	/**
	 * �û�ע��
	 */
	@Test
	public void testRegister() {
		UserService us = new UserService();
		User user = new User("test","123456");
		boolean flag= us.register(user);
		if(flag){
			System.out.println("ע��ɹ�");
		}else{
			fail("ע��ʧ��");
		}
	}

	
	/**
	 * �û���½
	 */
	@Test
	public void testLogin() {
		UserService us = new UserService();
		User user = new User("111","123456");
		boolean flag= us.register(user);
		if(flag){
			System.out.println("��½�ɹ�");
		}else{
			fail("��½�ɹ�");
		}
	}
}
