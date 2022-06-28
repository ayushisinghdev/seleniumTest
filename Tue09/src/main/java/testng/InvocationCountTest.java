package testng;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount = 10)
	public void googleTitleTest() {
		System.out.println("Test - Google title test");
	}

}
