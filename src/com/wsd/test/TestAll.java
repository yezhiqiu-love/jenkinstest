package com.wsd.test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * ִ�����е�Ԫ����
 * @author LN
 *
 */
public class TestAll extends TestCase{

	public static TestSuite suite() {
		 // ����һ�������׼�          
		TestSuite suite = new TestSuite();           
		// ���Ӳ������class����          
		suite.addTestSuite(UserTest.class);         
		suite.addTestSuite(ProductTest.class); 
		return suite;
	}

}
