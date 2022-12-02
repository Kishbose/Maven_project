package com.TestNG_Features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	@Test
	public void KTM() {
		System.out.println("KTM 390 Generate 42.9bhp power");
	}

	@Test
	@Ignore
	public void Bajaj() {
		System.out.println("pulser160 gives 45.30 kmpl  ");
	}

	@Test
	public void RE() {
		System.out.println("GT 650 Generate 47.65bhp power");
	}

	@Test(enabled = false)
	public void BMW() {
		System.out.println("BMW g310R gives 30.3 kmpl");
	}

	@Test
	public void Yamaha() {
		System.out.println("MT15 V2 Milages gives 58.60 kmpl  ");
	}	
}
