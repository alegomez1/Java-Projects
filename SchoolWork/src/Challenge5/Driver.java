package Challenge5;
import java.util.*;

public class Driver {

    private int year, speed;
    private String model, make;

    public Driver(int year, String model, String make, int speed){
        this.year = year;
        this.model = model;
        this.make = make;
        this.speed = speed;
    }
    public Driver(){
        this.year = 2000;
        this.model = "Malibu";
        this.make = "Chevy";
        this.speed = 60;
    }

    public void accelerate(){
        Random myRan = new Random();
        int ranSpeed = myRan.nextInt(70)+5;

        this.speed += ranSpeed;
    }

    public void brake(){
        Random myRan = new Random();
        int ranSpeed = myRan.nextInt(30)+5;

        this.speed -= ranSpeed;
    }

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
