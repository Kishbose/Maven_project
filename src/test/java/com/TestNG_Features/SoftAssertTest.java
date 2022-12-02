package com.TestNG_Features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	@Test(priority = -1)
	public void Bike() {
		String a = "RE GT 650";
		float b = 47.65f;
		Assert.assertNotEquals(a, b);
		System.out.println("Verification successed");

	}

	@Test
	public void Power() {
		String a = "RE GT 650";
		String b = "RE GT 650bhp";
		SoftAssert s = new SoftAssert();
		s.assertEquals(a, b);
		System.out.println("Verification successed");
	}

	@Test
	public void Royal() {
		String a = "RE GT 650";
		String b = "RE GT 650";
		SoftAssert s1 = new SoftAssert();
		s1.assertNotEquals( b, a);
		System.out.println("Verification successed");
	}
}