package com.fundamentals.java;

/*
* static members are used to define values that should remain
* the same across all objects of a class
* */

public class Statistic {  //class for showcasing how to work with static members - pg 59 blue book
    private int elecID;
    public String atom;
    public static int incrementor = 0;  //a static member

    public void Display() {
    //define the class method
        System.out.println("The charge of the electricity is positive " + this.elecID);
        System.out.println("The electricities name is " + this.atom);
    }
    public Statistic() {  //non parameterized constructor
        System.out.println("Constructor call");
        this.elecID = 40000;
        this.atom = "Positively charged";
    }

    public Statistic(int nb, String posit) {
        this.elecID = nb;
        this.atom = posit;
    }
}
