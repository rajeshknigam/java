package com.rajesh.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		// this is to pre populate the list.
		for (int i = 0; i < 10; i++) {
			empList.add(EmployeeGenrator.generateEmployeeObject());
		}

		// Get the size of list
		System.out.println("List size --> " + empList.size());
		System.out.println("");
		
		// get a specific element from list.
		System.out.println("Employee 2 from list --> " + empList.get(2));
		System.out.println("");

		// Remove a specific element from list.
		Employee empRemove = empList.get(5);
		System.out.println("Removed a employee from list --> " + empList.remove(empRemove));
		System.out.println("");

		// other way to read all items in list
		for (int i = 0; i < empList.size(); i++) {
			System.out.println(i + ") --> " + empList.get(i));
		}

		System.out.println("");
		System.out.println("");
		System.out.println("");
		// replace a specific element from list.
		empList.add(5, EmployeeGenrator.generateEmployeeObject());

		// other way to read all items in list
		for (int i = 0; i < empList.size(); i++) {
			System.out.println(i + ") --> " + empList.get(i));
		}
	}
}
