package com.springexample.springbootrestapiapplication;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int sid;
private String sname;
private String scity;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getScity() {
	return scity;
}
public void setScity(String scity) {
	this.scity = scity;
}


}
