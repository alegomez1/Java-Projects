package Practice;

public class TeslaClass extends CarCreator {

    public TeslaClass(String make, String model, int year){
        super(make,model,year);
    }

    public void getCarInfo(){
        System.out.printf("This electric car is a %s %s from the year %d", getMake(), getModel(), getYear());
    }


}

