package com.mnmnwq.workout;

/**
 * Created by Administrator on 2018-07-13.
 */

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener", "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony","100 Pull-ups\n100 Pull-ups\n100 sit-ups\n100 Squats"),
            new Workout("The Wimp Special","5 Pul-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strength and Length","500 meter run\n21 X 1.5 pood kettleball swing\n21 x pull-ips")
    };
    //每个workout都有一个描述和名称
    private Workout(String name,String description){
        this.name = name;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return this.name;
    }
}