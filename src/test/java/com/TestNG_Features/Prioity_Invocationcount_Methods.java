package com.TestNG_Features;

import org.testng.annotations.Test;

public class Prioity_Invocationcount_Methods {
  @Test
  public void KTM() {
	  System.out.println("KTM 390 Generate 42.9bhp power");
  }
  
  @Test(priority = -1,invocationCount = 2)
  public void RE() {
		System.out.println("GT 650 Generate 47.65bhp power");
	}

  @Test(priority = 1)
	public void Yamaha() {
		System.out.println("MT15 V2 gives Givs 58.60 kmpl ");
	}
}
