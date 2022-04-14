package com.edu;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  //create table Student
public class Employee {
	@Id   //primary key
private int Eid;
private String Ename;
private float Esalary;
//generate setter and getter method 
//generate toString
public int getEid() {
	return Eid;
}
public void setEid(int Eid) {
	this.Eid = Eid;
}
public String getEname() {
	return Ename;
}
public void setEname(String Ename) {
	this.Ename = Ename;
}
public float getESalary() {
	return Esalary;
}
public void setEsalary(float Esalary) {
	this.Esalary = Esalary;
}

@Override
public String toString() {
	return "Employee [Eid=" + Eid + ", Ename=" + Ename + ",Esalary=" + Esalary + "]";
}



}


