package com.rajesh.spring.aop;

public class Project {

	private String name;
	private int projectId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", projectId=" + projectId + "]";
	}

}