package com.spring.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

@Tag("param")
public class ParamTesting {

    @DisplayName("Param Test")
    @ParameterizedTest(name = "{displayName}: {index} => {arguments}")
    @ValueSource(strings = {"Ahmed", "Ali", "Saad", "Kareem"})
    void paramtest(String value){
        System.out.println(value);
    }

    @DisplayName("Enum Test")
    @ParameterizedTest(name = "{displayName}: {index} => {arguments}")
    @EnumSource(Gender.class)
    void enumTest(Gender value) {
        System.out.println(value);
    }


    @DisplayName("Param Test 2")
    @ParameterizedTest(name = "{displayName}: {index} => {arguments}")
    @CsvSource({
            "Ahmed, 25, 015",
            "Ali, 20, 011",
            "Samy, 45, 010"
    })
    void paramTest(String name, int age, String phone){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Phone: "+ phone);

    }
}
