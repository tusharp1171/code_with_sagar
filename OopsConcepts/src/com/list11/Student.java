package com.list11;

public class Student {
private int sID;
public int getsID() {
	return sID;
}
@Override
public String toString() {
	return "Student [sID=" + sID + ", SName=" + SName + ", div=" + div + ", classNo=" + classNo + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public void setsID(int sID) {
	this.sID = sID;
}
public String getSName() {
	return SName;
}
public void setSName(String sName) {
	SName = sName;
}
public char getDiv() {
	return div;
}
public void setDiv(char div) {
	this.div = div;
}
public int getClassNo() {
	return classNo;
}
public void setClassNo(int classNo) {
	this.classNo = classNo;
}
private String SName;
private char div;
private int classNo;
}
