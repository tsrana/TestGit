package com.ant;

public class MainJavaClass {

	public static void main(String[] args) {
		MyAbstractClass a;
		a = new MyClass();
		a.add(1, 2);
		a = new MyClass1();
		a.add(1, 2);
		a.add(1, 2, 3);		
		System.out.println("End");
	}	
}
