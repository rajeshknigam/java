package com.rajesh.spring.core.di;

public class Employee {

	private String fName;
	private String lName;
	private int eCode;
	private Project project;
	private Address adress;

	public Employee() {
	}

	public Employee(String fName, String lName, int eCode, Project project, Address adress) {
		this.adress = adress;
		this.eCode = eCode;
		this.fName = fName;
		this.lName = lName;
		this.project = project;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int geteCode() {
		return eCode;
	}

	public void seteCode(int eCode) {
		this.eCode = eCode;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", eCode=" + eCode + ", project=" + project
				+ ", adress=" + adress + "]";
	}

}