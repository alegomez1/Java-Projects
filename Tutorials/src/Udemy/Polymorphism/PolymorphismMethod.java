package Udemy.Polymorphism;

public class PolymorphismMethod {

    public static void main(String[] args) {


        //Create object from parent class
        Vehicle v1 = new Vehicle("Ford", "F150", 2012);
        v1.start();
        v1.stop();

        System.out.println("-----------------------------");

        //Create SUV object
        SUV v2 = new SUV("Toyota", "RAV4", 2016);
        v2.start();
        v2.stop();

        System.out.println("-----------------------------");

        //Create Semi object
        Semi v3 = new Semi("Volvo", "VML", 2010);
        v3.start();
        v3.stop();

        System.out.println("-----------------------------");

        //Create motorbike object
        Motorbike v4 = new Motorbike("Harley", "Samson", 2013);
        v4.start();
        v4.stop();
    }
}
