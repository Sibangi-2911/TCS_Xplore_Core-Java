package com.ilp.tcs;

public class Employee1 {
	int id;
	String name;
	
//	Without the use of this keyword output is null
/*public Employee1(int id, String name){
		id = id;
	name = name;
	}*/
	
	public Employee1(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println("Employee id is: "+id+"& Employee Name is: "+name);
	}
}
