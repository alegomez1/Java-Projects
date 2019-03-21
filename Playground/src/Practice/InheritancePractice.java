package Practice;

public class InheritancePractice {

    public static void main(String[] args) {
        TeslaClass ModelS = new TeslaClass("Tesla", "Model S", 2019);
        ModelS.getCarInfo();
        System.out.println(ModelS.miles(50));


        CarCreator car = new CarCreator("Chevy", "Malibu", 2018);
        car.getCarInfo();


    }
}
