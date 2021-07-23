package com.spring.junit;

import org.junit.jupiter.api.*;

@Tag("person")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface PersonInterface {

    @BeforeAll
    default void beforeAll(){
        System.out.println("Before All-------------");
    }

    @BeforeEach
    default void welcome(){
        System.out.println("Hello From Interface");
    }

    @Test
    default void myTest(){
        System.out.println("MY TEST");
    }
}
