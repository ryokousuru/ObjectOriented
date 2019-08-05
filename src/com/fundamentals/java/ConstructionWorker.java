package com.fundamentals.java;
 // blue book page 56
public class ConstructionWorker { //a class for the purpose of defining constructors
    private int constructionWorkerNo;
    public  String constructionWorkerWho;
    public void Display() {
        //defining a class method
        System.out.println("Construction Worker No: " + this.constructionWorkerNo);
        System.out.println("The construction worker is called " + this.constructionWorkerWho + " by his colleagues.");
    } //end of method

    public void Enter(int numb, String whoishe) {
        this.constructionWorkerNo = numb;
        this.constructionWorkerWho = whoishe;
    }

    public ConstructionWorker() {   //enter the constructor
        System.out.println("The constructor is calling a construction worker.");
        this.constructionWorkerNo = 11;
        this.constructionWorkerWho = "Default";
    }

} //end of class
