package com.fundamentals.java;

/*
*classes Adult and Teenager will illustrate basic Inheritance
page 66 example
 */
public class Teenager extends Adult {

    public int age;
    public String called;

    public void Display() {
        System.out.println("The teen has been around for " + this.age + " years now.");
        System.out.println("He is called " + this.called);
    }

}
