package com.im.beans;

import java.util.Map;

public class College {
	private Map<String,String> facultySubjects;

	

	public College(Map<String, String> facultySubjects) {
		super();
		this.facultySubjects = facultySubjects;
	}



	@Override
	public String toString() {
		return "College [facultySubjects=" + facultySubjects + "]";
	}
	
	
}
