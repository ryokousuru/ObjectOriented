package com.fundamentals.java;
/*
 * The Deer and Fawn classes illustrate how to use
 * constructors in base and derived classes - blue book page 71
 * */
public class Fawn extends Deer {

    public void Display() {
        System.out.println("The fawn will one day be a " + this.antlers);
        System.out.println("Right now his length is around " + this.length + " inches.");
    }

    public Fawn() {
        System.out.println("This would be the fawn subclass constructor");
    }
}
