package com.spring.junit;

import org.junit.jupiter.api.*;
import org.springframework.util.Assert;

import java.time.Duration;

@Tag("person")
class PersonTest {
    private Person person;

    @Test
    @Disabled
    void testing() {
        person = new Person();
//        Assertions.assertAll("Person Data",
//                () -> Assertions.assertEquals(person.getFirstName(), "Ahmed" , "FirstName Not Matches"),
//                () -> Assertions.assertEquals(person.getLastName(), "Elsheikh", "LastName Not Matches"),
//                () -> Assertions.assertEquals(person.getPhone1(), "012", "Phone1 Not Matches"),
//                () -> Assertions.assertEquals(person.getPhone2(), "010", "Phone2 Not Matches")
//                );

        Assertions.assertAll("Person Data" ,
                () -> Assertions.assertAll("Person Names",
                        () -> Assertions.assertEquals(person.getFirstName(), "Ahmedd", "FirstName Not Matches"),
                        () -> Assertions.assertEquals(person.getLastName(), "Elsheikh", "LastName Not matches")
                ),
                () -> Assertions.assertAll("Person Phones",
                        () -> Assertions.assertEquals(person.getPhone1(), "012", "Phone1 Not Matches"),
                        () -> Assertions.assertEquals(person.getPhone2(), "010", "Phone2 not Matches")
                )
                );
    }

    @Test
    @DisplayName("Test Person By ID")
    void findById() {
        person = new Person();
        Assertions.assertEquals(person.findById(1), null);
    }

    @Test
    @DisplayName("Test Person By Exception")
    void getExceptionTest(){
        person = new Person();
        Assertions.assertThrows(RuntimeException.class, () -> person.getException());
    }

    @Test
    @DisplayName("TIme Out Test")
    void timeOutTest(){
        Assertions.assertTimeout(Duration.ofMillis(1000),
                () -> {
            Thread.sleep(2000);
                    System.out.println("Time Out Test");
                }
                );
    }

    @Test
    @DisplayName("TIme OutPreemptivly")
    void timeoutPreemptivly(){
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(1000),
                () -> {
            Thread.sleep(2000);
                    System.out.println("Time out Preemptivly");
                }
                );
    }

    @Test
    @DisplayName("test assertEquals")
    void newTest(){
        //Assertions.assertTrue(1 == 1);
        Assertions.assertTrue("Ahmed".equalsIgnoreCase("ahmed"));
    }















}