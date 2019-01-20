

//This is connected to PopUpClass and PrintMessageClass

import javax.swing.*;
import java.util.Scanner;

public class MainClass {

    //Ask user method

    public static void askUser() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What type of message would you like to see today?" +
                "\n1: Pop-up message!" +
                "\n2: Text displayed here" +
                "\n3: Input number");

        int userChoice = keyboard.nextInt();
        //If a string value is added here it crashes the program...
        switch (userChoice) {
            case 1:
                //Running these functions here, otherwise the code can be displayed directly here
                popUp();
                break;

            case 2:
                textDisplay();
                break;

            case 3:
                method3();
                break;


            default:
                System.out.println("You did not select one of the two options! Please try again!");

        }
    }

    //Method 1: Pop-up message
    public static void popUp() {
        PopUpClass boxMessage = new PopUpClass();
        boxMessage.alertBox();
    }


    //Method 2: Text message
    public static void textDisplay() {
        PrintMessageClass inTextDisplay = new PrintMessageClass();
        inTextDisplay.textMessage();

    }

    //Method 3: Different test
        public static void method3() {


           String strNumber = JOptionPane.showInputDialog("Please provide a number in the input box");
          int input = Integer.parseInt(strNumber);
           PopUpClass object = new PopUpClass();
           object.secondAlrtBox(input);

        }



    public static void main(String[] args) {

    askUser();


    }
}
