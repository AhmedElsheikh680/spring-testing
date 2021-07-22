package com.spring.junit;

public class Student {

    private static String name = "Ahmed";
    private static String age = "25";

    public Student() {
    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        Student.name = name;
    }

    public  String getAge() {
        return age;
    }

    public  void setAge(String age) {
        Student.age = age;
    }
}
