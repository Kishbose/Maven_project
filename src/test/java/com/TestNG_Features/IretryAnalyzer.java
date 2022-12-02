package com.TestNG_Features;

import org.testng.Assert;
import org.testng.annotations.Test;
 
public class IretryAnalyzer {
	@Test(retryAnalyzer = IRetry_Run.class)
	public void Royal() {
		String a = "RE GT 650";
		String b = "RE GT 650";
		Assert.assertNotEquals(a, b);
	}
	@Test
	public void Bike() {
		String a = "RE GT 650";
		float b = 47.65f;
		Assert.assertNotEquals(a, b);

	}
}