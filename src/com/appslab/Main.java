package com.appslab;

public class Main {

    public static void main(String[] args) {

        /*Student student1 = new Student("Sam", 2, 123456, "Legionarska 1, 01001 Zilina");
        Student student2 = new Student("John", 5, 456789, "Legionarska 2, 01001 Zilina");

        System.out.println(student1.getStudentNumber() + ", " + student1.getPhoneNumber() + ", " + student1.getStudentAddress());
        System.out.println(student2.getStudentNumber() + ", " + student2.getPhoneNumber() + ", " + student2.getStudentAddress());*/

        Person[] array = new Person[5];

        array[0] = new Person("Peter", 69, 1585.58);
        array[1] = new Person("Pavol", 15, 258.5);
        array[2] = new Person("Jaro", 17, 25.2);
        array[3] = new Person("Timo", 18, 58555.86);
        array[4] = new Person("Svano", 12, 3.58);

        for(int i = 0; i < array.length; i++){
            array[i].ShowPerson();
        }
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
