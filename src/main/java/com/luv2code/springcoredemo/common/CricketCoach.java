package com.luv2code.utils;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String dailyPractice() {
        return "Practice fast bowling for 15 minutes!!---nananan";
    }
}
