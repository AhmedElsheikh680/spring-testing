package com.spring.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person person;

    @Test
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
                        () -> Assertions.assertEquals(person.getFirstName(), "Ahmed", "FirstName Not Matches"),
                        () -> Assertions.assertEquals(person.getLastName(), "Elsheikh", "LastName Not matches")
                ),
                () -> Assertions.assertAll("Person Phones",
                        () -> Assertions.assertEquals(person.getPhone1(), "012", "Phone1 Not Matches"),
                        () -> Assertions.assertEquals(person.getPhone2(), "010", "Phone2 not Matches")
                )
                );
    }

}