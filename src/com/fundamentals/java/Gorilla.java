package com.fundamentals.java;
/*
* Gorilla and Monkey will illustrate use of derived classes with functions
* blue book page 68
* */

public class Gorilla {
    public String face;
    public int height;
    public void Display() {
        System.out.println("This ape looks " + this.face + " to me!!");
        System.out.println("She is around " + this.height + " inches tall.");
    }
}
