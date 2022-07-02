package testng;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class customListener extends Base implements ITestListener{
	
	public void onTestFailure (ITestResult result) {
		System.out.println("Failed Test");
		failed();
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Start Test");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
	}

	public void onStart(ITestContext context) {
		System.out.println("Start");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Finish");
	}
	
}
