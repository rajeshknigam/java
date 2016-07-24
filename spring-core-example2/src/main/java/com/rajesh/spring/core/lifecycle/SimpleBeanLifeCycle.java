package com.rajesh.spring.core.lifecycle;

public class SimpleBeanLifeCycle {

	private String message;
	private int helloCount;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getHelloCount() {
		return helloCount;
	}

	public void setHelloCount(int helloCount) {
		this.helloCount = helloCount;
	}

	public void sayHello() {
		System.out.println("Saying hello with Message : " + message);
		System.out.println("Count so far: " + ++helloCount);
	}
	
	public void initMethod(){
		System.out.println("Inside of init method.");
		helloCount = 100;
		System.out.println("helloCount : " + helloCount);
	}
	
	public void destoryMethod(){
		System.out.println("Inside of destory method.");
		helloCount = 0;
		System.out.println("helloCount : " + helloCount);
	}
}