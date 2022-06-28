package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	SoftAssert softAssert = new SoftAssert();
	@Test
	public void googleTitleTest() {
		System.out.println("Test1");
		softAssert.assertEquals(true, false);
		System.out.println("Test2");
		softAssert.assertEquals(false, false);
		System.out.println("Test3");
		softAssert.assertEquals(true, false);
		System.out.println("Test4");
		System.out.println("Test5");
		softAssert.assertAll();
	}
	@Test
	public void googleTitleTest1() {
		SoftAssert softAssert1 = new SoftAssert();
		System.out.println("Test1");
		softAssert1.assertEquals(true, false,"true is not equal to false");
		softAssert1.assertAll();
	}
	

}
