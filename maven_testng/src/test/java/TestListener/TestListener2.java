package TestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class TestListener2 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("this is test scenario : onTestStart "+ result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("this is my scenario : onTestSuccess"+ result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("this is my secenario : onTestFailue "+ result.getName());
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("this is my secenario : onTestSkipped "+ result.getName());

		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("this is my secenario : onTestFailedButWithinSuccessPercentage "+ result.getName());

		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("this is my secenario : onTestFailedWithTimeout "+ result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("this is my secenario : onStart "+ context.getName());

		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("this is my secenario : onFinish "+ context.getName());

		
	}

}
