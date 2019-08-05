package com.fundamentals.java;

public class Out {
    class In {
        public int insideID;
    }
    public void DisplayIn() {
        In inobj = new In();
        inobj.insideID = 9;
        System.out.println("The value of the ID of the inner class is " + inobj.insideID);
    }
}