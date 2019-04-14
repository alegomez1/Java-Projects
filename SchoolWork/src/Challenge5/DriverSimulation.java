package Challenge5;

import java.io.*;
import java.util.Scanner;

public class DriverSimulation {

    //These are the two instances of the Driver class that are called later on in the program
    static Driver car1;
    static Driver car2;

    //These are the two static speed variables that get changed
    static int fastestSpeedCar1 =0;
    static int fastestSpeedCar2 =0;

    //Here in main I am calling all three methods in order to run the program
    public static void main(String[] args) throws IOException {

    setUpCars();

    raceCars();

    showAndSaveResults();

    }

    /*
    *   This method is used to give each car object their parameters
    *   car1 gets it's values from reading the "race.txt" file. This is done using the File and Scanner class, as well as a while loop to read each word/number
    *   car2 gets it's values from the user's input
    *   Then the method let's the user know the stats of each car, as well as that the race is about to begin
     */
    public static void setUpCars()throws IOException{


        //Setting up car1

        car1 = new Driver();
        String carModel = "";
        String carMake = "";
        int carYear = 0;
        int carSpeed = 0;

        File aFile = new File("race.txt");
        Scanner inFile = new Scanner(aFile);

        while (inFile.hasNext()){
            carMake = inFile.next();
            carModel = inFile.next();
            carYear = inFile.nextInt();
            carSpeed = inFile.nextInt();
        }

        car1.setMake(carMake);
        car1.setModel(carModel);
        car1.setYear(carYear);
        car1.setSpeed(carSpeed);


        inFile.close();

        //Setting up car2

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What make is the second car?");
        String make = keyboard.nextLine();

        System.out.println("What model is the second car?");
        String model = keyboard.nextLine();

        System.out.println("What year is the second car?");
        int year = keyboard.nextInt();

        System.out.println("What's the speed of the second car?");
        int speed = keyboard.nextInt();

        car2 = new Driver(year, model, make, speed);

        car1.setSpeed(0);
        car2.setSpeed(0);

        System.out.printf("The cars racing today are a %d %s %s and a %d %s %s", car1.getYear(), car1.getMake(), car1.getModel(), car2.getYear(), car2.getMake(), car2.getModel());


        System.out.println("\nStandby the race is about to begin!");

    }

    /*
    *   This method is used to simulate the cars racing five times
    *   It uses a for loop that runs five times and within it calls the accelerate method for each car, display's their current speed, brakes each car using the brake method, and then displays their speed then
    *   Then it runs if statements to determine if the ending speed for that 'lap' was the fastest speed, and makes that equal to their respective fastestSpeed variables
    *   Finally, it displays the fastest speed that each car reached
     */
    public static void raceCars() throws IOException{



        System.out.println("\nAnd they're off!");

        for (int i = 0; i<5; i++){
            car1.accelerate();
            car2.accelerate();

            System.out.printf("\nThe current speed for the %s is: %d mph, and the current speed for the %s is: %d mph\n", car1.getMake(), car1.getSpeed(), car2.getMake(), car2.getSpeed());

            car1.brake();
            car2.brake();

            System.out.printf("\nThe cars hit the brakes and the %s is now at %d mph, while the %s is at %d mph\n", car1.getMake(), car1.getSpeed(), car2.getMake(), car2.getSpeed());


            if (car1.getSpeed() > fastestSpeedCar1){
                fastestSpeedCar1 = car1.getSpeed();
            }
            if (car2.getSpeed() > fastestSpeedCar2){
                fastestSpeedCar2 = car2.getSpeed();
            }


        }

        System.out.printf("\nThe fastest speed that the %s reached was: %d mph\n" +
                "The fastest speed that the %s reached was: %d mph\n", car1.getMake(), fastestSpeedCar1, car2.getMake(), fastestSpeedCar2);


    }

    /*
    *   This method is used to display the winner of the race, and then record that to the race.txt file
    *   It does this by comparing the fastestSpeed variables, and depending which one is greater, that one gets written to the race.txt file using that car's toString method
    *   It does this using the FileWriter class which is set not to append to it replaces the text that's there
    *   It also uses PrintWriter and Scanner to be able to write it onto the file
     */
    public static void showAndSaveResults() throws  IOException{

        if (fastestSpeedCar1> fastestSpeedCar2){
            System.out.printf("\nThe winner of the race was the %s who reached a top speed of %d mph", car1.getMake(), fastestSpeedCar1);

            FileWriter fw = new FileWriter("race.txt", false);
            PrintWriter pw = new PrintWriter(fw);
            String sentence = car1.toString();
            pw.println(sentence);

            pw.close();

            Scanner inputFile = new Scanner(new File("race.txt"));

            inputFile.close();
        }
        else{
            System.out.printf("\nThe winner of the race was the %s who reached a top speed of %d mph", car2.getMake(), fastestSpeedCar2);

            FileWriter fw = new FileWriter("race.txt", false);
            PrintWriter pw = new PrintWriter(fw);
            String sentence = car2.toString();
            pw.println(sentence);

            pw.close();

            Scanner inputFile = new Scanner(new File("race.txt"));

            inputFile.close();
        }



    }


}
