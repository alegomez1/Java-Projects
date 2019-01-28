public class Class2 {


    //Attributes
   private String carType, carModel, carColor, carYear;


    //Default constructor
    public Class2() {

        this.carType = "Default type";
        this.carModel = "Default model";
        this.carColor = "Default color";
        this.carYear = "Default year";


    }

    //Nondefault constructor
    public Class2(String typeOfCar, String modelOfCar, String whatColorIsTheCar, String whatYearIsItFrom) {
        this.carType = typeOfCar;
        this.carModel = modelOfCar;
        this.carColor = whatColorIsTheCar;
        this.carYear = whatYearIsItFrom;
    }



    //Setters and getters

    public void setCarType(String enterTypeOfCar) {
        this.carType = enterTypeOfCar;
    }

    public String getCarType() {
        return carType;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String enterCarModel) {
        this.carModel = enterCarModel;
    }


    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String enterCarColor) {
        this.carColor = enterCarColor;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String enterCarYear) {
        this.carYear = enterCarYear;
    }
}
