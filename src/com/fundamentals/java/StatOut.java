package com.fundamentals.java;

public class StatOut {
    static class StatIn {
        static public int inStID;
    }
    public void DisplayStatIn() {
        StatIn.inStID = 10;
        System.out.println();
    }
}
