package com.rajesh.spring.core;

public class HelloBean2 {
	private String message;
	private String person;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public void sayHello(){
		 System.out.println("Saying hello to :"+person + " with greeting message: "+ message);
	}
}