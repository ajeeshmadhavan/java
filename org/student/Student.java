package org.student;

import org.department.Department;

public class Student extends Department {
public void studentName(String name) {
	System.out.println("student name"+"  "+name);
}
public void studentDept() {
	System.out.println("student department: Agri");
}
public void studentID() {
	System.out.println("student id: 003");
}
public static void main(String[] args) {
Student stu=new Student();
stu.collegeName();
stu.collegeCode();
stu.collegeRank();
stu.deptName();
stu.studentDept();
stu.studentName("Ajeesh");
stu.studentID();
}

}
