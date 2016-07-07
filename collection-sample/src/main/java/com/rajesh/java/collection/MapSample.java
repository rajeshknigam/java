package com.rajesh.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapSample {

	public static void main(String[] args) {
		Map<Employee, Employee> empMap = new HashMap<Employee, Employee>();

		// this is to pre populate the list.
		for (int i = 0; i < 10; i++) {
			Employee emp = EmployeeGenrator.generateEmployeeObject();
			empMap.put(emp, emp);
		}

		// Get the size of list
		System.out.println("Map size --> " + empMap.size());
		System.out.println("");

		// get a specific Employee from Map.
		Employee empKey = new Employee();
		empKey.seteCode(2);

		System.out.println("Employee 2 from map --> " + empMap.get(empKey));
		System.out.println("");

		// Remove a specific element from list.
		System.out.println("Removed a employee from map --> " + empMap.remove(empKey));
		System.out.println("");

		int count = 0;
		// other way to read all items in list
		for (Iterator<Employee> iterator = empMap.keySet().iterator(); iterator.hasNext();) {
			Employee key = (Employee) iterator.next();
			System.out.println(count++ +") --> " + empMap.get(key));
		}
	}

}
