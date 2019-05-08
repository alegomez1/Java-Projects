package Room;

import java.util.Scanner;

public class RoomMain {
     static RoomConstructor room = new RoomConstructor();


    public static void main(String[] args) {
        askForWalls();
        System.out.println(room.getTotalSurfaceArea());

    }

    public static void askForWalls(){

        Scanner input = new Scanner(System.in);
        System.out.println("How many walls are you going to paint?\nEnter value: ");
        int numberOfWalls = input.nextInt();

        for (int i =0; i < numberOfWalls; i++){
            int trueNumber = i+1;
            System.out.println("What is the length of wall " + trueNumber + "?");
            double length = input.nextDouble();
            System.out.println("What is the height of wall " + trueNumber + "?");
            double height = input.nextDouble();
            room.calcSurfaceArea(length, height);
        }

    }
}
