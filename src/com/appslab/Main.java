package com.appslab;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Sam", 2, 123456, "Legionarska 1, 01001 Zilina");
        Student student2 = new Student("John", 5, 456789, "Legionarska 2, 01001 Zilina");

        System.out.println(student1.getStudentNumber() + ", " + student1.getPhoneNumber() + ", " + student1.getStudentAddress());
        System.out.println(student2.getStudentNumber() + ", " + student2.getPhoneNumber() + ", " + student2.getStudentAddress());
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
