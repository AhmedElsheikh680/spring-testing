package com.spring.junit;

public class Student {

    private static String name = "Ahmed";
    private static int age = 25;

    public Student() {
    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        Student.name = name;
    }

    public  int getAge() {
        return age;
    }

    public  void setAge(int age) {
        Student.age = age;
    }
}
