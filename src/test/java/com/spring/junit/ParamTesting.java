package com.spring.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
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
}
