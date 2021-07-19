package com.spring.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getName() {
        Student student = new Student();
        System.out.println(student.getName());
    }

    @Test
    void getAge() {
        Student student = new Student();
        System.out.println(student.getAge());
    }
}