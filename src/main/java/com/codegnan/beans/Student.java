package com.codegnan.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

	private String sid;
	private String sname;
	private int sage;
	private List<String> qualifications;
	private Set<String> subjects;
	private Map<String, Integer> degreeAndYearOfPassout;
	private Properties subjectsAndMarks;
	private Course course;
	
	public void displayStudentDetails() {
		System.out.println("Student Details: ");
		System.out.println("-----------------");
		System.out.println("Student Id: "+sid);
		System.out.println("Student Name: "+sname);
		System.out.println("Student Age:"+sage);
		System.out.println("Qualification: "+qualifications);
		System.out.println("Subjects: "+subjects);
		System.out.println("Degree And Year: "+degreeAndYearOfPassout);
		System.out.println("subjects And Marks: "+subjectsAndMarks);
		System.out.println("Course Deatils:");
		System.out.println("---------------------------");
		System.out.println("courseId: "+course.getCid());
		System.out.println("Course Name: "+course.getCname());
		System.out.println("Course Fees:"+course.getCfee());
	}
}
