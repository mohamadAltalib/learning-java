package com.example.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;  // The constructor of DemoController is annotated with @Autowired.
        // This means that when a DemoController instance is created, Spring will automatically inject an
        // instance of a class that implements the Coach interface into this constructor.
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
