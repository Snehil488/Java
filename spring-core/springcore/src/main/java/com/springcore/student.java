package com.springcore;

public class student {
	private int studentId; 
	private String studentName;
	private String studentAdress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAdress() {
		return studentAdress;
	}
	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}
	
	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", studentName=" + studentName + ", studentAdress=" + studentAdress
				+ "]";
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
