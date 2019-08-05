package com.fundamentals.java;

public class Window {   //demonstration of how to use multiple objects - blue book page 54
    private int windowNo;
    public String windowNa;
    public void Display() {
        //defining a class method
        System.out.println("Window number is " + this.windowNo);
        System.out.println("Window name would be " + this.windowNa);
    }
    public void Go(int no, String which) {
        this.windowNo = no;
        this.windowNa = which;
    }
}
