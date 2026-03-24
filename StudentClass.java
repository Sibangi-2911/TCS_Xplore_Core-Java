package com.ilp.tcs;
class Student{
	int id;
	String name;}
public class StudentClass {
		public static void main(String args[]) {
			Student s1 = new Student();
			Student s2 = new Student();
			s1.id = 1;
			s2.id = 2;
			s1.name = "Sibangi";
			s2.name = "Seetal";
			System.out.println(s1.id);
			System.out.println(s1.name);
			System.out.println(s2.id);
			System.out.println(s2.name);
		}
	}
