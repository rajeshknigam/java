package com.rajesh.spring.core;

public class OldRunner {
	public static void main(String[] args) {

		HelloBean1 bean1 = new HelloBean1();
		bean1.setMessage("Hello World !!");
		bean1.sayHello();

		HelloBean2 bean2 = new HelloBean2();
		bean2.setMessage("Hello World !!");
		bean2.setPerson("Rajesh");
		bean2.sayHello();
	}
}