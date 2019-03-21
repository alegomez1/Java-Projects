package Practice;

public class CarCreator {
    //private variables
    private String make, model;
    private int year;

    //constructor
    public CarCreator(String aMake, String aModel, int aYear){
        this.make=aMake;
        this.model=aModel;
        this.year=aYear;
    }

    //getters and setters
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make=make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void getCarInfo(){
        System.out.printf("This is a %s %s from the year %d", getMake(), getModel(), getYear());
    }

    public int miles(int mpg){
        int miles = mpg *100;
        return miles;
    }
}
