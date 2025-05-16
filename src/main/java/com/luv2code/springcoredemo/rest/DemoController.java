package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    private Coach anotherCoach;

//    @Autowired
//    public DemoController(@Qualifier("trackCoach") Coach coach){
//        this.myCoach = coach;
//    }

//    @Autowired
//    public void setMyCoachCoach(Coach coach){
//        this.myCoach = coach;
//    }

    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach coach,
                          @Qualifier("baseballCoach") Coach anotherCoach){
        System.out.println("In Constructor: " + this.getClass().getSimpleName());
        this.myCoach = coach;
        this.anotherCoach = anotherCoach;
        System.out.println("same bean and myCoach == anotherCoach? " + (myCoach == anotherCoach));

    }

    @GetMapping("/getdailyworkout")
    public String getDailyWorker(){
        return myCoach.dailyPractice();
    }

    @GetMapping("/check")
    public String check(){
        return "answer is " + (this.myCoach == this.anotherCoach);
    }
}
