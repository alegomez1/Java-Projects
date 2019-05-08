package Lynda;

import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {
        StringManipulationConstructor testing = new StringManipulationConstructor();
        String text = getInput();
        System.out.println(testing.upperCase(text));
    }

    public static String getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some text: ");
        return input.nextLine();
    }

}
