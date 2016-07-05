package com.rajesh.java.core.inheritance;

public class Child3 extends Parent {

	private String[] grandChild;

	public String[] getGrandChild() {
		return grandChild;
	}

	public void setGrandChild(String[] grandChild) {
		this.grandChild = grandChild;
	}


	@Override
	public void printInfo() {
		System.out.println("Child 3 - My Name:" + super.getName());
		
		String[] child = super.getChild();
		for (int i = 0; i < child.length; i++) {
			System.out.println(i + ") " + child[i]);
		}
		System.out.println("--------------------------------");
		for (int i = 0; i < grandChild.length; i++) {
			System.out.println(i + ") " + grandChild[i]);
		}
	}
}
