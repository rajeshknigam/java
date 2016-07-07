package com.rajesh.java.collection;

import java.util.Date;
import java.util.Objects;

public class Employee {

	private String fName;

	private String lName;

	private int eCode;

	private String email;

	private Date dateOfJoining;

	private boolean activeEmployee;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public boolean isActiveEmployee() {
		return activeEmployee;
	}

	public void setActiveEmployee(boolean activeEmployee) {
		this.activeEmployee = activeEmployee;
	}

	@Override
	public String toString() {
		return "Employee: " + fName + ", " + lName + ", " + eCode + ", " + dateOfJoining + ", " + activeEmployee;
	}

	@Override
	public int hashCode() {
		int result = 17;
		
		return result + Objects.hash(this.eCode);
	}

	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;

		if (obj instanceof Employee) {
			Employee empObj = (Employee) obj;

			if (this.eCode == empObj.geteCode()) {
				isEqual = true;
			} else {
				isEqual = false;
			}

		} else {
			isEqual = false;
		}
		return isEqual;
	}
}
