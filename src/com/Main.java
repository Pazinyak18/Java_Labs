package com;
import student.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Student Vasya = new Student("Vasya", "Pupkin", 100, 180.0f);
        Student Andriy = new Student("Andriy", "Petryshevich", 90, 185.0f,
                "KTM-19", "Metrologi", true, "Zgoretskya", 1880.70f,
                65.5f,1999);
        System.out.println(Vasya.toString());
        student.resetValues("Andriy", "Petryshevich", 90, 185.0f,
                "KTM-19", "Metrologi", true, "Zgoretskya", 1880.70f,
                65.5f,1999);
        Andriy.printAmountOfStudents();
        Student.printStaticAmountOfStudents();
    }
}
