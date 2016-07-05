package com.rajesh.java.core.inheritance;

public class Child2 extends Parent {

	@Override
	public void printInfo() {
		System.out.println("Child 2 - My Name:"+super.getName());
		String[] child = super.getChild();
		for (int i = 0; i < child.length; i++) {
			System.out.println(i+") "+child[i]);
		}
	}
}
