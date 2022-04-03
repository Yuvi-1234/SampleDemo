package org.college;

public class Dept {
    public void deptName() {
    	System.out.println("Computer Science");
    }
    public static void main (String args []) {
    	Dept d = new Dept();
    	d.deptName();
    	Student s = new Student();
    	s.studentName();
    	s.studentDept();
    	s.studentId();
    	Hostel h = new Hostel();
    	h.hostelName();
    }
}
