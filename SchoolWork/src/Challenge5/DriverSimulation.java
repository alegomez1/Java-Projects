package Challenge5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DriverSimulation {
    public static void main(String[] args) throws IOException {

        Driver car1 = new Driver();
        String carModel = "";
        String carMake = "";
        int carYear = 0;
        int carSpeed = 0;
        /*
        *   Read file and set car1 variables to the files
         */

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

        car1.toString();

        inFile.close();


    }
}
