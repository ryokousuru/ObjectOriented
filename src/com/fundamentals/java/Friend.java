package com.fundamentals.java;

public class Friend {
    private int friendNu;
    public String friendWho;
    public void Display() {
        //class method definition
        System.out.println("Friend number is " + this.friendNu);
        System.out.println("Friend is called " + this.friendWho);
    }

        public void Into(int nu, String who) {
            this.friendNu = nu;
            this.friendWho = who;
        }
    }

