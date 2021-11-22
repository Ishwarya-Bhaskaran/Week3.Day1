package org.student;

import Department.Department;

public class Student extends Department{
public void studentName()
{
	System.out.println("Student Name");
}
public void studentDept()
{
	System.out.println("Student Department");
}
public void studentId()
{
	System.out.println("Student ID");
}
public static void main (String[] args)
{
	Student stud= new Student();
	stud.collegeCode();
	stud.collegeName();
	stud.collegeRank();
	stud.deptName();
	stud.studentName();
	stud.studentId();
	stud.studentDept();
}
}
