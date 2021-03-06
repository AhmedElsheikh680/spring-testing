package com.spring.junit;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
//import org.springframework.util.Assert;
//
//import static org.junit.jupiter.api.Assertions.*;
import org.assertj.core.api.Assertions;

@Tag("student")
class StudentTest {

    @Test
    @DisplayName("HI Function")
    @RepeatedTest(value = 5, name = "{displayName} : {currentRepetition} | {totalRepetitions}" )
    void myTest(){
        System.out.println("HI");
    }

    //@Test
    @DisplayName("funRepetition fun")
    @RepeatedTest(3)
    void funRepeated(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
        System.out.println(testInfo.getTags());
        System.out.println(repetitionInfo.getCurrentRepetition());
    }


}

/*

    private Student student;

    @BeforeEach
    void setUp(){
        student = new Student();
        System.out.println("OUT");
    }



    @Test
    @DisplayName("Assertions")
    void newTest(){
        //Assertions.assertThat(student.getName()).isEqualTo("Ahmed");
        MatcherAssert.assertThat(student.getName(), Matchers.is("Ahmed"));
    }

    @Nested
    class nestedStudent {

        @BeforeEach
        void setUp(){
            System.out.println("In");
        }

        @Test
        void nestedTest(){
            Assertions.assertThat(student.getName()).isEqualTo("Ahmed");
        }
    }


 */


/*
    @Test
    void testing(){
        student = new Student();
        Assertions.assertAll(
                "Student Data",
                () -> Assertions.assertEquals(student.getName(), "Ahmed", "Name Not Matches"),
                () -> Assertions.assertEquals(student.getAge(), "25" , "Age Not Matches")
        );
    }
 */
 /*

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
  */