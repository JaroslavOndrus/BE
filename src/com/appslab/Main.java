package com.appslab;

public class Main {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3,4,5);
        System.out.println(triangle1.GetPerimeter());
        System.out.println(triangle1.GetArea());
    }
}

class Student{

    private String Name;
    private int PhoneNumber;
    private int StudentNumber;
    private String StudentAddress;

    public Student(String name, int studentNumber, int phoneNumber, String studentAddress){
        Name = name;
        StudentNumber = studentNumber;
        PhoneNumber = phoneNumber;
        StudentAddress = studentAddress;

    }

    public String getName() {

        return Name;
    }

    public int getStudentNumber() {

        return StudentNumber;
    }

    public int getPhoneNumber() {

        return PhoneNumber;
    }

    public String getStudentAddress() {

        return StudentAddress;
    }
}

class Person{
    private String Name;
    private int Age;
    private double Budget;

    public Person(String name, int age, double budget) {
        Name = name;
        Age = age;
        Budget = budget;
    }

    public void ShowPerson(){
        System.out.println("Person name: "+Name+", Person Age: "+Age+", Person Budget: "+Budget);
    }

    public void SumBudget(){

    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public double getBudget() {
        return Budget;
    }
}
