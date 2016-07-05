package com.rajesh.java.core.inheritance;

public class Parent {

	private String name;
	private String[] child;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getChild() {
		return child;
	}

	public void setChild(String[] child) {
		this.child = child;
	}
	
	public void printInfo(){
		System.out.println("My Name:"+name);
		for (int i = 0; i < child.length; i++) {
			System.out.println(i+") "+child[i]);
		}
	}
}
