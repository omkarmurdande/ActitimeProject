package com.Actitime.GenericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" method Started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" method PASSED",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+" method FAILED",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" method SKIPPED",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+" started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(context.getName()+" ended",true);
	}
	

}
