package org.college;

public class Student {
    public void studentName() {
    	System.out.println("Yuvi");
    }
    public void studentDept() {
    	System.out.println("CSE");
    }
    public void studentId() {
    	System.out.println("1234");
    }
    public static void main(String args []) {
    	Student s = new Student();
    	s.studentName();
    	s.studentDept();
    	s.studentId();
    }
}
