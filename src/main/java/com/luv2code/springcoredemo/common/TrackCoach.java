package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In class: " + this.getClass().getSimpleName());
    }

    @Override
    public String dailyPractice() {
        return "This is Track coach";
    }
}
