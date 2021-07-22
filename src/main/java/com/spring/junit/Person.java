package com.spring.junit;

public class Person {

    private String firstName  = "Ahmed";
    private String lastName = "Elsheikh";
    private String phone1 = "012";
    private String phone2 = "010";

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String findById(int id) {
        if(id == 5){
            return "Ahmed";
        } else if(id == 6){
            return "Elsheikh";
        } else  {
            return null;
        }
    }

    public void getException() {
        throw new SpecialException();
    }















}
