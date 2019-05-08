package Room;

import java.util.Scanner;

public class RoomConstructor {

    static double totalSurfaceArea = 0;

    static double oneGallonPrice = 20.00;
    static double oneGallonCoverage = 350.00;

    static double threeGallonPrice = 55.00;
    static double threeGallonCoverage = 1050.00;



    //Functions used

    //Calculates the surface area and adds it to double totalSurfaceArea
    public void calcSurfaceArea(double length, double height){
        double surfaceArea = length*height;
        totalSurfaceArea += surfaceArea;
    }

    //Asks for the number of walls built, then runs the calcSurfaceArea function
    public void askForWalls() {

        Scanner input = new Scanner(System.in);
        System.out.println("How many walls are you going to paint?\nEnter value: ");
        int numberOfWalls = input.nextInt();

        for (int i = 0; i < numberOfWalls; i++) {
            int trueNumber = i + 1;
            System.out.println("What is the length of wall " + trueNumber + "?");
            double length = input.nextDouble();
            System.out.println("What is the height of wall " + trueNumber + "?");
            double height = input.nextDouble();
            calcSurfaceArea(length, height);
        }
    }

    public void gallonsNeeded(){

       double gallonsNeeded = totalSurfaceArea/350.00;
       double singleGallonPrices = gallonsNeeded*oneGallonPrice;
       double tripleGallonPrices = gallonsNeeded*threeGallonPrice;
        System.out.printf("You will need approximately %.2f gallons of paint\n", gallonsNeeded);
        System.out.printf("Using single gallon buckets it will cost about $%.2f\n", singleGallonPrices);
        System.out.printf("Using triple gallon buckets it will cost about $%.2f\n", tripleGallonPrices);

    }

    //Getters and setters
    public double getTotalSurfaceArea() {
        return totalSurfaceArea;
    }

    public void setTotalSurfaceArea(double totalSurfaceArea) {
        RoomConstructor.totalSurfaceArea = totalSurfaceArea;
    }
}
