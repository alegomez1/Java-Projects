package Challenge5;
import java.util.*;

public class Driver {
    //These are all the variables used in this constructor class
    private int year, speed;
    private String model, make;

    //This is the non default constructor that accepts parameters
    public Driver(int year, String model, String make, int speed){
        this.year = year;
        this.model = model;
        this.make = make;
        this.speed = speed;
    }
    //This is the default constructor
    public Driver(){
        this.year = 2000;
        this.model = "Malibu";
        this.make = "Chevy";
        this.speed = 60;
    }

    //This method randomly generates a number from 5-70 and adds it to the speed variable
    public void accelerate(){
        Random myRan = new Random();
        int ranSpeed = myRan.nextInt(70)+5;

        this.speed += ranSpeed;
    }

    //This method randomly generates a number between 5-30 and subtracts it from the speed variable
    public void brake(){
        Random myRan = new Random();
        int ranSpeed = myRan.nextInt(30)+5;

        this.speed -= ranSpeed;
    }

    //These are all the getters and setters
    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    //This is the toString that shows the values of the variables
    @Override
    public String toString() {
        return "Driver{" +
                "year=" + year +
                ", speed=" + speed +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
