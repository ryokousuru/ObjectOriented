package com.fundamentals.java;
/*
 * PollyParrot and Finch illustrate use of polymorphism
 * and how function called work in base and derived classes
 * blue book page 74
 * */
public class Finch extends PollyParrot{

    public void Display() {
        System.out.println("The finch has a " + this.beak + " beak");
        System.out.println("She\'s only around " + this.tall + " inches tall");
    }

}
