package com.sprintTest.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
 private int id;
 @Autowired
 @Qualifier("marks1")
 
 private Marks marks;
 public Student() {
	super();
	
}
@Override
public String toString() {
	return "Student [id=" + id + ", marks=" + marks + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Marks getMarks() {
	return marks;
}
public void setMarks(Marks marks) {
	this.marks = marks;
}
public Student(int id, Marks marks) {
	super();
	this.id = id;
	this.marks = marks;
}
 
}
