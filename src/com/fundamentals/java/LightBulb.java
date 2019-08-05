package com.fundamentals.java;

//the class LightEmittingDiode will extend this class

public class LightBulb implements AnInterface {

    private String lightColor;
    private String threadType;
    private int threadSize;
    private String metalType;

    public LightBulb(String lightColor, int threadSize, String threadType, String metalType) {
        System.out.println("Parameterized constructor for the light bulb");
    }

    public LightBulb () {

        System.out.println("The default constructor for LightBulb since there are no parameters");
    }

    public LightBulb(String metalType) { //overload constructor
        this(metalType, "coarse", 17, "blue");
        System.out.println("The type of metal on the threads is " + metalType);
    }

    //constructor for illustrating the use of the 'this' keyword
    public LightBulb(String metalType, String threadType, int threadSize, String lightColor) {
        this.metalType = metalType;
        this.threadType = threadType;
        this.threadSize = threadSize;
        this.lightColor = lightColor;
    }

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor;
    }

    public String getLightColor() {
        return lightColor;
    }
    //method
    public void bulbGoIn() {
        System.out.println("Twist it into the electric socket.");
    }

    //the same method but overloaded
    public void bulbGoIn(String message) {
            System.out.println(message);
    }

    public void setThreadSize() {
        this.threadSize = threadSize;
    }

    public int getThreadSize() {
        return  threadSize;
    }

    @Override
    public void endCall() {
    }
}