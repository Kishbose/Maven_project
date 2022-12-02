package com.mvnConcepts.Maven_Project;

public class Child extends Parent{
	public void Age() {
		System.out.println("21");
		
	}
public static void main(String[] args) {
	Child c = new Child();
	c.name();
	c.Age();
}
}
