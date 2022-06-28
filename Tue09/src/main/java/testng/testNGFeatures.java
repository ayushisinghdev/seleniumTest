package testng;

import org.testng.annotations.Test;

public class testNGFeatures {
	
	@Test
	public void googleTitleTest() {
		System.out.println("Test1 - Google title test");
		int i = 9/0;
		System.out.println(i);
	}
	
	@Test(dependsOnMethods = "googleTitleTest")
	public void googleTest() {
		System.out.println("Test2 - Google title test");
	}

}
