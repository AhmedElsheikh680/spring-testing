package com.spring.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class OperatingSystemTest {

    @Test
    @DisplayName("Run On Windows")
    @EnabledOnOs(OS.WINDOWS)
    void windows(){
        System.out.println("WINDOWS=======================");
    }

    @Test
    @DisplayName("Run Om MAc")
    @EnabledOnOs(OS.MAC)
    void mac(){
        System.out.println("MAC===========================");
    }

    @Test
    @DisplayName("Run On Linux")
    @EnabledOnOs(OS.LINUX)
    void linux(){
        System.out.println("LINUX================================");
    }

    @Test
    @DisplayName("JAVA 8")
    @EnabledOnJre(JRE.JAVA_8)
    void version8(){
        System.out.println("JAVA 8 ========================");
    }

    @Test
    @DisplayName("JAVA 11")
    @EnabledOnJre(JRE.JAVA_11)
    void version11(){
        System.out.println("JAVA 11 =======================");
    }

    @Test
    @DisplayName("Environment Variable Username One")
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches="SMARTCS")
    void username1(){
        System.out.println("SMARTCS===============");
    }

    @Test
    @DisplayName("environment Variable Username Two")
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "Ahmed Elsheikh")
    void username2(){
        System.out.println("AHmed Elsheikh=================");
    }















}
