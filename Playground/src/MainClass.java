

//This is connected to PopUpClass and PrintMessageClass

import java.util.Scanner;

public class MainClass {

    //Ask user method

    public static void askUser() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What type of message would you like to see today?" +
                "\n1: Pop-up message!" +
                "\n2: Text displayed here");

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

    public static void main(String[] args) {

    askUser();


    }
}
