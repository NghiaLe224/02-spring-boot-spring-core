package com.luv2code.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In constructor: " + this.getClass().getSimpleName());
    }

    @Override
    public String dailyPractice() {
        return "Swim 1000 meters as a warm up";
    }
}
