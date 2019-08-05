package com.fundamentals.java;
/*
* PollyParrot and Finch illustrate use of polymorphism
* and how function called work in base and derived classes
* blue book page 74
* */
public class PollyParrot {
  public String beak;
  public int tall;
  public void Display() {
      System.out.println("The parrot has a " + this.beak + " beak.");
      System.out.println("She\'s around " + this.tall + " inches tall");
  }

}
