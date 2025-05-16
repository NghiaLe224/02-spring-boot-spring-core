package com.luv2code.springcoredemo.common;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("In class: " + this.getClass().getSimpleName());
    }

    @Override
    public String dailyPractice() {
        return "This is Baseball coach";
    }
}
