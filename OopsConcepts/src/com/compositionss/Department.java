package com.compositionss;

public class Department {
private int id ;
private String dep_Name;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Department [id=" + id + ", dep_Name=" + dep_Name + ", getId()=" + getId() + ", getDep_Name()="
			+ getDep_Name() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
public String getDep_Name() {
	return dep_Name;
}
public void setDep_Name(String dep_Name) {
	this.dep_Name = dep_Name;
}
}
