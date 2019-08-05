package com.fundamentals.java;
/*
* The Deer and Fawn classes illustrate how to use
* constructors in base and derived classes - blue book page 71
* */
public class Deer {
    public String antlers;
    public int length;
    public void Display() {
        System.out.println("The antlers indicate he\'s a " + this.antlers);
        System.out.println(("He is also around " + this.length + " centimeters long  from nose to tail"));
    }
    public Deer() {
        System.out.println("This is the deer superclass constructor");
    }
}
