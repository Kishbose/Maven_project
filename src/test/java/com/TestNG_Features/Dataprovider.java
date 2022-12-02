package com.TestNG_Features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
  

	@Test(dataProvider = "Topics")

	public void Details(String Day1,String Day2,String Day3) {
		System.out.println("First Month Topic : "+Day1);
		System.out.println("Second Month Topic  : "+Day2);
		System.out.println("Third Month Topic  : "+Day3);	
	}

	@DataProvider
    public Object [] [] Topics () {
		return new Object [] [] { {"Java","Selenium","Project" },{"Primitive","Adactin","DataDriven"},{"WebDriver","Javascript","TestNG"}};
		
    }

}
