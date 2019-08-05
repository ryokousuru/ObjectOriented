package com.fundamentals.java;
/*
* Example of creating an instance of the inner object within the main program
* page 80 of the blue book
* */
public class Outside {
    class Inside {
        public int insideID;
    }
    public void DisplayInside() {
        Inside insobj = new Inside();
        insobj.insideID = 5;
        System.out.println("The identification number of the inside class is " + insobj.insideID);
    }
}
