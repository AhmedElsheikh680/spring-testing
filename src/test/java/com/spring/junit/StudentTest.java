package com.spring.junit;

import org.junit.jupiter.api.*;

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

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach-------------");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll----------------");
    }
}