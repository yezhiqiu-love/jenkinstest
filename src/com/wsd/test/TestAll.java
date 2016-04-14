package com.wsd.test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * 执行所有单元测试
 * @author LN
 *
 */
public class TestAll extends TestCase{

	public static TestSuite suite() {
		 // 创建一个测试套件          
		TestSuite suite = new TestSuite();           
		// 增加测试类的class对象          
		suite.addTestSuite(UserTest.class);         
		suite.addTestSuite(ProductTest.class); 
		return suite;
	}

}
