package com.ilp.tcs;

class Employee {

    // Private attributes
    private int id;
    private String name;
    private String designation;
    private int ssnNo;
    private int age;
    private double salary;

    // Static variable
    private static int idCounter = 0;

    // Constructor (no id, no idCounter in parameters)
    public Employee(String name, String designation, int ssnNo, int age, double salary) {
        idCounter++;              // increment static counter
        this.id = idCounter;      // assign to id

        this.name = name;
        this.designation = designation;
        this.ssnNo = ssnNo;
        this.age = age;
        this.salary = salary;
    }

    // Getter for idCounter (static)
    public static int getIdCounter() {
        return idCounter;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSsnNo() {
        return ssnNo;
    }

    public void setSsnNo(int ssnNo) {
        this.ssnNo = ssnNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
