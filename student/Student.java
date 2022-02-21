package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name");
	}
	public void studentDept() {
		System.out.println("Student Dept");
	}public void studentId() {
		System.out.println("College rank");
	}

	public static void main(String[] args) {
	Student student = new Student();
	student.collegeCode();
	student.collegeName();
	student.collegeRank();
	student.deptName();
	student.studentDept();
	student.studentName();
	student.studentId();
	
	}

}
