package com.spring.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll---------------");
    }

    @BeforeEach
    void setUp() {
        student = new Student();
        System.out.println("@BeforeEach-----------------");
    }

    @Test
    void getName() {

        System.out.println(student.getName());
    }

    @Test
    void getAge() {

        System.out.println(student.getAge());
    }
}