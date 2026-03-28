package com.ilp.tcs;

public class SingleTonClass {
	private static SingleTonClass obj=null;
	private SingleTonClass(){};
	public static SingleTonClass objectCreationMethod() {
		if(obj==null) {
			obj = new SingleTonClass();
		}
		return obj;
	}
	public void display() {
		System.out.println("SingleTon class example");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTonClass myObject = SingleTonClass.objectCreationMethod();
		myObject.display();

	}

}
