package com.fundamentals.java;
/*
* Classes Cat and Kitten illustrate use of inherited classes
* with refined functions - blue book page 69
* */
public class Cat {
    public String paw;
    public String claw;
    public int tail;
    public void Display() {
        System.out.println("The cat has " + this.paw + " paws");
        System.out.println("He also has really " + claw + " claws!!");
        System.out.println("He\'s about " + this.tail + " inches long");

    }
}
