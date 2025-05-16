package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In class: " + this.getClass().getSimpleName());
    }

    @Override
    public String dailyPractice() {
        return "Practice fast bowling for 15 minutes!!- to check setter";
    }
}
