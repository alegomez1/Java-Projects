package Udemy.Polymorphism;

public class SUV extends Vehicle {
    public SUV(String make, String model, int year){
        super(make,model,year);
    }

    //Start method
    public void start(){
        System.out.println(String.format("%s %s %d starting", getMake(), getModel(), getYear()));
    }
    //Stop method
    public void stop(){
        System.out.println(String.format("%s %s %d stopping", getMake(), getModel(), getYear()));
    }

}
