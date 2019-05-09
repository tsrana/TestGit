package com.ant;

public abstract class MyAbstractClass implements MyInterface {
	public abstract int add();
	
	public int add(int x, int y) {		
		System.out.println("Inside MyAbstractClass...");
		return 0;	
	}
	
	public int add(int x, int y, int z) {		
		System.out.println("Inside MyAbstractClass...");
		return 0;	
	}
}
