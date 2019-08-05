package com.fundamentals.java;

public class ParagraphConstruction { //Parameterized constructor - page 57 blue book
private int paragraphNo;
public String paragraphNa;
public void Display() {
        //define a class method
        System.out.println("It's the number " + this.paragraphNo + " paragraph on the page.");
        System.out.println("The paragraph is titled " + this.paragraphNa);
        }
public void Goonin(int nm, String title) {
        this.paragraphNo = nm;
        this.paragraphNa = title;
        }
public ParagraphConstruction() {   //here is the non-parameterized constructor
        System.out.println("Calling for the writer to construct a good paragraph");
        this.paragraphNo = 2;
        this.paragraphNa = "\"The adventures of Sally and Stan\'";
        }
public ParagraphConstruction(int nm, String title) {  //and here's the parameterizedu
        this.paragraphNo = nm;
        this.paragraphNa = title;
        }
        }
