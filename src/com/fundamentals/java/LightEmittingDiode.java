package com.fundamentals.java;

public class LightEmittingDiode extends LightBulb{

    private String chip;

    public LightEmittingDiode() {
        System.out.println("Default Constructor for a light emitting diode.");
    }


    //using the 'super' keyword with Constructor - from Constructor in "LightBulb" class
    public LightEmittingDiode(String chip, String lightColor, int threadSize, String threadType, String metalType) {
        super(lightColor, threadSize, threadType, metalType);
        this.chip = chip;
    }

    public void insertion() {
        System.out.println("Put both leads into separate holes on the circuit board.");
    }

    public String getChip() {
        return chip;
    }

    public void setChip() {
        this.chip = chip;
    }
}
