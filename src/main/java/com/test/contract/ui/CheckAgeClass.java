package com.test.contract.ui;

/**
 * Created by Viktor on 30.12.2015.
 */
public class CheckAgeClass {

    private String age;

    CheckAgeClass(String age){
        this.age = age;
    }

    CheckAgeClass(){}

    public  String checkAge(String age) {
        if (age.matches("(?!0)[0-9]*"))return age;
        else return null;
    }

    public  String checkAge() {
        if (age.matches("(?!0)[0-9]*"))return age;
        else return null;
    }

  }






