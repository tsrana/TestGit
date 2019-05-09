package com.ant;

public class MyClass1 extends MyClass{

	@Override
	public int add() {
		System.out.println("Inside MyClass1...");
		return 0;
	}

	public int add(int x, int y) {	
		super.add(x, y);
		System.out.println("Inside MyClass1...");
		return 0;
	
	}
}