package Lab10b;
import java.util.Scanner;
import java.util.ArrayList;

//Task 1

//Task 1a.ArrayList<String> arr = new ArrayList<>();arr.set(0, "This is a String");
// Exception:Index out of bounds exception
// What caused the error: Trying to set index of 0 in the array to "This is a String" without having defined the size of the array yet or added anything to it
// How to Fix It: change .set to .add and remove the 0
//
// --------------------------------------------------------------------


//Task 1b.ArrayList<String> arr = new ArrayList<>();arr.add("Apple");arr.add("Banana");arr.add("Carrot");arr.add(6, "Pineapple Pizza");
// Exception: Index out of bounds exception
// What caused the error: The last .add(6, "Pineapple Pizza") because the array size is only 3 so it cannot find index 6
// How to Fix It: Change the 6 to a number from 0-2, or get rid of it all together

// --------------------------------------------------------------------


//Task 1c.ArrayList<String> arr = new ArrayList<>();arr.add("Apple");arr.add("Banana");arr.add("Carrot");arr.add(3, "Regular Pizza");
// Exception: No error
//What caused the error: N/A
//How to Fix It: N/A

//--------------------------------------------------------------------

//Task 1d.ArrayList<String> arr = new ArrayList<>();arr.add("Apple");arr.add("Banana");arr.add("Carrot");arr.get(1) = "Blood Orange";
// Exception: Unexpected Type
// What caused the error: arr.get(1) = "Blood Orange";
// How to Fix It: Remove the = "Blood Orange";
//
// --------------------------------------------------------------------

//Task 1e.ArrayList<String> arr = new ArrayList<>();arr.add("Apple");arr.add("Banana");arr.add("Carrot");arr.get(arr.size());
// Exception: Index out of bounds exception
// What caused the error: arr.get(arr.size()); Because the .size method returns 3 and there is no index 3
// How to Fix It: Remove the arr.size() and change it for a value between 0-2
//
// --------------------------------------------------------------------

//Task 1f.ArrayList<String> arr = new ArrayList<>();arr.add("Apple");arr.add("Banana");arr.add("Carrot");arr.remove("Potato");
//Exception: No error
// What caused the error: N/A
// How to Fix It: N/A



public class ArrayListsLab
{
    static ArrayList<String> array = new ArrayList<>();

    /*
     *  Here in main, I ask the user to enter a value for how many items they want to store into the array
     *  That value gets passed to the populateArray() method as a parameter
     *  Then the changeArray() method is called
      */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many values would you like to store in the array list?");

        int values = keyboard.nextInt();

        populateArray(values);

        changeArray();
    }

    //Task 2

    /*
    *   This method is used to populate the array and add values to it that the user inputs
    *   It takes an int parameter which it uses to run a for loop that number of times
    *   In the loop it asks the user to enter each value to populate the array
    *   In the end, it runs an enhanced for loop to print out each element of the array
     */
    public static void populateArray(int values){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nPlease enter all the values of the array");

        for (int i = 0; i < values; i++){
            System.out.println("\nWhat value would you like to add?");
            String valueToAdd = keyboard.nextLine();
            array.add(i, valueToAdd);
        }

        System.out.println("The values in your array are:");

        for (String each : array){
            System.out.println(each);
        }

    }

    //Task 3

    /*
    *   This method is used to present the user with the option to a view the value of the array at a certain index, and gives them the option to modify it
    *   It first declares the variables that are going to be used
    *   Then a do while loop runs to validate that the user has entered a valid index value
    *   Then it asks the user whether or not they want to change that value to something else
    *   If they do, it changes it and prints out the new modified array, if not, the method ends
     */
    public static void changeArray(){

        Scanner keyboard = new Scanner(System.in);
        int indexToShow = 0;
        int newSize = array.size() -1;

        do
        {
            System.out.println("\nAt what index would you like to see the value of?");
            indexToShow = keyboard.nextInt();
            System.out.println("Please enter a number between 0 and " + newSize);
        } while (indexToShow > array.size() || indexToShow < 0);

        System.out.println("The value at index " + indexToShow + " is " + array.get(indexToShow));

        keyboard.nextLine();

        System.out.println("\nWould you like to change this value to something else?\nYes or No");
        String userChoice = keyboard.nextLine();

        if (userChoice.equalsIgnoreCase("yes")){

            System.out.println("\nWhat value would you like to change it to?");
            String userValue = keyboard.nextLine();
            array.set(indexToShow,userValue);

            System.out.println("\nThe changed array values are:");

            for (String i : array){
                System.out.println(i);
            }
        }
        else {
            System.out.println("\nThe values will not be changed then");
        }

    }
}
