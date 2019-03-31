package Challenge5;

import java.io.BufferedReader;
import java.io.FileReader;

public class DriverSimulation {
    public static void main(String[] args) throws   {

        Driver Tesla = new Driver(2018, "Model S", "Tesla", 100);
        System.out.println(Tesla.getMake());
        System.out.println(Tesla.getSpeed());
        Tesla.brake();
        System.out.println(Tesla.getSpeed());
        Tesla.brake();
        System.out.println(Tesla.getSpeed());

        //FileReader and buffer code:

        FileReader fr = new FileReader("Car.txt");
        BufferedReader br = new BufferedReader(fr);

        String str;

        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
    }
}
