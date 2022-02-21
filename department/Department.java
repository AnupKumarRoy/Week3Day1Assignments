package org.department;

import org.college.College;

public class Department extends College {
public void deptName() {
	System.out.println("Dept. Name");
}
	public static void main(String[] args) {
    Department department = new Department();
    department.deptName();

	}

}
