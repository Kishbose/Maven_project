package com.TestNG_Features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertsTest {
  @Test
  public void Bike() {
    String a = "RE GT 650";
    float b =  47.65f;
    Assert.assertNotEquals(a, b);
   System.out.println("Validation Successed");

  }

  @Test
  public void Royal() {
    String a = "RE GT 650";
    String b = "RE GT 650";
    Assert.assertNotEquals(a, b);
   System.out.println("Validation Not Successed");

  }

  @Test (enabled = false)
  public void wheeler() {
    String a = "RE GT 650";
    String b = "RE GT 650";
    Assert.assertEquals( b, a);
   System.out.println("Validation  Successed");
}

}