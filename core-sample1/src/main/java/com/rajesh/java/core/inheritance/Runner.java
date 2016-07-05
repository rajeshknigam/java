package com.rajesh.java.core.inheritance;

public class Runner {

	public static void main(String[] args) {

		System.out.println("----------------------- Scenario 1-------------- ");
		System.out.println("When creating the direct instance of parent.. ");
		
		Parent p = new Parent(); // see how the instance has been created.
		p.setName("Rati Ram");
		String[] childs = {"Rajesh","Kuku","Sonu","Monu","Nitin"};
		p.setChild(childs);
		p.printInfo();
		
		System.out.println("----------------------- Scenario 2-------------- ");
		System.out.println("When creating the instance of Child1 and refernce of Parent.. ");
		Parent child1 = new Child1(); // this reference is of Parent but instance is of Child1
		child1.setName("Rati Ram");
		String[] childs1 = {"Rajesh","Kuku","Sonu","Monu","Nitin"};
		child1.setChild(childs1);
		child1.printInfo();
		
		System.out.println("----------------------- Scenario 3-------------- ");
		System.out.println("When creating the instance of Child2 and refernce of Parent.. ");
		Parent child2 = new Child2(); // this reference is of Parent but instance is of Child2
		child2.setName("Rati Ram");
		String[] childs2 = {"Rajesh","Kuku","Sonu","Monu","Nitin"};
		child2.setChild(childs2);
		child2.printInfo();
		
		System.out.println("----------------------- Scenario 4-------------- ");
		System.out.println("When creating the instance of Child3 and refernce of Parent.. ");
		Parent child3 = new Child3(); // this reference is of Parent but instance is of Child3
		child3.setName("Rati Ram");
		String[] childs3 = {"Rajesh","Kuku","Sonu","Monu","Nitin"};
		child3.setChild(childs3);
		String[] grandChilds3 = {"Nikku"};
		
		Child3 child31 = new Child3(); // this reference is of Child3 as well instance is of Child3
		child31.setName("Rati Ram");
		child31.setChild(childs3);
		child31.setGrandChild(grandChilds3);
		child31.printInfo();
		
		
	}

}
