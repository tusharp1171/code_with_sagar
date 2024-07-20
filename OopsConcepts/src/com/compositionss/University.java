package com.compositionss;

public class University {
private int id;
private String uni_Name;

private Department department;

@Override
public String toString() {
	return "University [id=" + id + ", uni_Name=" + uni_Name + ", department=" + department + ", getId()=" + getId()
			+ ", getUni_Name()=" + getUni_Name() + ", getDepartment()=" + getDepartment() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUni_Name() {
	return uni_Name;
}

public void setUni_Name(String uni_Name) {
	this.uni_Name = uni_Name;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}
public static void main(String[] args) {
	Department dp=new Department();
	           dp.setId(2);
	           dp.setDep_Name("BSC");
	
	 University un=new University();
	            un.setId(1);
	            un.setUni_Name("sppu");
	            un.setDepartment(dp);
	            
	            System.out.println("UnID : "+un.getId());
	            System.out.println("UnName : "+un.getUni_Name());
	            System.out.println("UnDeptID : "+un.getDepartment().getId());
	            System.out.println("UnDeptName : "+un.getDepartment().getDep_Name());
}
}
