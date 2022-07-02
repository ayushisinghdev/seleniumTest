package testng;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
//	@Test(timeOut = 2000)
//	public void infiniteLoopTest() {
//		int i = 1;
//		while (i==1) {
//			System.out.println("Test - Google title test");
//		}}
//		
//	@Test(invocationTimeOut  = 2000,priority=2)
//	public void infiniteLoopTest1() {
//			int i = 1;
//			while (i==1) {
//				System.out.println("Test priority - Google title test");
//		}}
			
	@Test(expectedExceptions = NumberFormatException.class,priority=1)
	public void infiniteLoopTest2() {
		System.out.println("Test before");
			String a = "100A";
			Integer.parseInt(a);
			System.out.println("Testexception");
					}		
	}


