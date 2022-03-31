package edu.quinnipiac.ser210.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener","5 Handstand push-ups\n 10 1 legged squats \n 15 pullups"),
            new Workout("Core Agony","100 Pull Ups\n 100 Push Ups \n 100 Sit Ups \n 100 squats"),
            new Workout("The Wimp Special", "5 Pull Ups \n 10 Push Ups \n 15 Squats"),
            new Workout("Strength and Length", "500 meter run \n 21 x 1.5 pood kettleball swing \n 21 x pull ups")
    };

    public Workout(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String toString(){
        return this.name;
    }
}
