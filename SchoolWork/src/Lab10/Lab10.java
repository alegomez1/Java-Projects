package Lab10;
import java.util.Scanner;

public class Lab10 {
    //Creating global String array
    public static String[] data;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many values would you like to store in the array?");

        int values = keyboard.nextInt();

        data = new String[values];

        populateArray(values);

        changeArray();

    }

    //Task 2
    /*
    *   This method uses the value the user passes it along in main to populate the array
    *   It takes an int as a parameter and creates a loop that runs that many times
    *   In the loop it asks the user to enter a value which is then added to the data array at that index
    *   Finally, it prints out all of the values of the data array
     */
    public static void populateArray(int valueSize){
        System.out.println("Please input each value of the array\n");
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < valueSize; i++){
            System.out.println("Please enter a value");
            String value = keyboard.nextLine();
            data[i] = value;
        }

        System.out.println("The new values for the array are: ");
        for (String myValue : data){
            System.out.println(myValue);
        }
    }

    //Task 3
    /*
    *   This method is used to change the value of the data array at a certain index
    *   It first asks the user that index of the data array they would like to see, prints that value, and asks if they'd like to change it
    *   If they do, it asks them to enter a new value, followed by a loop which prints out the new values of the array
    *   If not, it simply tells the user that nothing will be changed
     */
    public static void changeArray(){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What index of the array would you like to see?");

        int userIndex = keyboard.nextInt();

        System.out.println("The value of data["+userIndex+"] is: " + data[userIndex] +
                "\nWould you like to change it?\n1: Yes 2: No");

        int userChoice = keyboard.nextInt();

        keyboard.nextLine();

        if (userChoice == 1){
            System.out.println("What value would you like to change it to?");
            String userValue = keyboard.nextLine();
            data[userIndex] = userValue;
            System.out.println("The new array values are:");
            for (String values : data){
                System.out.println(values);
            }

        }else
            System.out.println("Okay, nothing will change");


    }

}
