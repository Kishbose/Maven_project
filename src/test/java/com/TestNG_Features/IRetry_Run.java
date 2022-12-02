package com.TestNG_Features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetry_Run implements IRetryAnalyzer {

	int a = 1;
	char c = 2;

	public boolean retry(ITestResult result) {
		if (a <= c) {
			a++;
			return true;
		}
		return false;
	}
}
