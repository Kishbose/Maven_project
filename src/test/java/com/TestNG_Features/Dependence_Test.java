package com.TestNG_Features;

import org.testng.annotations.Test;

public class Dependence_Test {
  @Test
  public void Card() {
	  System.out.println("5656 2312 8789 6565");
  }

  @Test(dependsOnMethods = "2024")
  public void Month() {
	  System.out.println("04");
  }

  @Test
  public void Year () {
	  System.out.println("2024");
  }
  
  @Test
  public void CVV() {
	  System.out.println("921");
  }
  
  











}
