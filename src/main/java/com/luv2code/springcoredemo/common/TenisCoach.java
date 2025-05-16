package com.luv2code.springcoredemo.common;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class TenisCoach implements Coach{
    @Override
    public String dailyPractice() {
        return "This is Tennis coach";
    }
}
