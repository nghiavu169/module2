package com.codegym;

public class Student {
    private final int id;
    private final String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable
    Student(int iD, String n) {
        id = iD;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}
