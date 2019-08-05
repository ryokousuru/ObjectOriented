package com.fundamentals.java;

import java.awt.*;

public class Main {

    public static void main(String[] args) {  //using multiple classes per page 52 of the blue book
        // write your code here

        System.out.println("Welcome back!!");

        //Create the object of the class
        Friend fry = new Friend();

        fry.Into(4, "Sally");
        fry.Display();

        Cousin cs = new Cousin();
        cs.cousinNu = 5;
        cs.cousinNa = "Ruby";
        cs.Display();

        //Create an object for the windows class

        Window mado = new Window();
        mado.Go(9, "side");
        mado.Display();

        Window mado1 = new Window();
        mado1.Go(8, "rear");
        mado1.Display();

        //create an object of the construction worker class
        ConstructionWorker brick = new ConstructionWorker();
        brick.Display();

        //create and object for the ParagraphConstruction class
        ParagraphConstruction word = new ParagraphConstruction(2, "\"The adventures of Sally and Stan\"");
        word.Display();

        //an object for the Statistic class
        Statistic elec = new Statistic(50000, "zapping it!!");
        Statistic.incrementor++;
        elec.Display();
        System.out.println("The number of electrons in the wire is around " + Statistic.incrementor);

        //Create an object of the MamaMonkey class
        Ape teeth = new Ape();
        teeth.chimpNo = 8;
        teeth.monkeyName = "Wendy";
        teeth.Display();

        //Create an object for the Teenager subclass
        Teenager adol = new Teenager();
        adol.age = 17;
        adol.called = "Davy";
        adol.Display();

        //Create an object for the class Monkey
        Monkey tail = new Monkey();
        tail.height = 90;
        tail.face = "really mean";
        tail.Display();

        //Create an object for the derived class Kitten
        Kitten little = new Kitten();
        little.paw = "soft";
        little.claw = "sharp";
        little.tail = 20;
        little.Display();

        //An object for the Fawn subclass
        Fawn calf = new Fawn();
        calf.antlers = "buck";
        calf.length = 50;
        calf.Display();

        //An object for the PollyParrot superclass
        PollyParrot wing = new PollyParrot();
        wing.beak = "short";
        wing.tall = 5;
        wing.Display();

        //An object for the Finch subclass

        Finch winglet = new Finch();
        winglet.beak = "even shorter";
        winglet.tall = 4;
        winglet.Display();

        //An object for the Sun superclass
        Sun shine = new Sun();
        shine.color = " bright yellow";
        shine.diameter = 1000050520582.0;
        shine.Display();

        //An object for the Star subclass
        Star light = new Star();
        light.color = "blinding white";
        light.diameter = 10849204;
        light.Display();

        //An object for the Out class (embedded class)
        Out oobj = new Out();
        oobj.DisplayIn();

        //An object for the Outside class (embedded class)
        Outside objt = new Outside();
        objt.DisplayInside();

        //An object for the Inside class (embedded class)
        Outside.Inside inoj = objt.new Inside();
        inoj.insideID = 4;
        System.out.println("The number for the inside class is " + inoj.insideID);

        //Create an object for the StatOut/StatIn classes
        StatOut sta = new StatOut();
        sta.DisplayStatIn();

        StatOut.StatIn.inStID = 77;
        System.out.println("The identification for the inside static class is " + StatOut.StatIn.inStID);

        LightMeUp(); //method to call LightBulb superclass / LightEmittingDiode subclass

        //Create an object for the anonymous class
        Abs ab = new Abs() {
            public void Display() {
                System.out.println("It is the method for displaying");
            }
        };
                ab.Display();
            }

        public static void LightMeUp() {
            LightBulb light1 = new LightBulb();
        }



}

