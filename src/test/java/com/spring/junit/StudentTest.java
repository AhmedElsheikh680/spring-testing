package com.spring.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;

    @BeforeEach
    void setUp() {

        student  = new Student();
    }

    @Test
    void getName(){
        //Assertions.assertEquals(student.getName(), "Ahmed", "Name Not Matches");
        Assertions.assertTrue("Ahmed".equals(student.getName()));
    }

    @Test
    void getAge() {
        Assertions.assertEquals(student.getAge(), "25" , "Age Not Matches");
        Assertions.assertTrue("25".equals(student.getAge()), "Age Not Matches");
    }
}