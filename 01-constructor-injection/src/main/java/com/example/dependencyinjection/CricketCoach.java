package com.example.dependencyinjection;

import org.springframework.stereotype.Component;

@Component //  make the class as a bean  and make it available to injection
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "go for a run";
    }
}
