package com.rajesh.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		Set<Employee> empSet = new HashSet<Employee>();

		// this is to pre populate the list.
		for (int i = 0; i < 10; i++) {
			Employee emp = EmployeeGenrator.generateEmployeeObject();
			empSet.add(emp);
		}

		// Get the size of list
		System.out.println("Set size --> " + empSet.size());
		System.out.println("");

		// get a specific Employee from Map.
		Employee empKey = new Employee();
		empKey.seteCode(2);

		System.out.println("Check if employee2 is in Set  --> " + empSet.contains(empKey));
		System.out.println("");

		// Remove a specific element from list.
		System.out.println("Removed a employee from Set --> " + empSet.remove(empKey));
		System.out.println("");

		int count = 0;
		// other way to read all items in list
		for (Iterator<Employee> iterator = empSet.iterator(); iterator.hasNext();) {
			System.out.println(count++ +") --> " + (Employee) iterator.next());
		}
	}
}
