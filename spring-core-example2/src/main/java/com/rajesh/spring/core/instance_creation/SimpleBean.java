package com.rajesh.spring.core.instance_creation;

public class SimpleBean {

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
}