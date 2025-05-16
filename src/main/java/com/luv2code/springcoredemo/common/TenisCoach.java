package com.luv2code.springcoredemo.common;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach{

    public TenisCoach(){
        System.out.println("In class: " + this.getClass().getSimpleName());
    }

    @Override
    public String dailyPractice() {
        return "This is Tennis coach";
    }
}
