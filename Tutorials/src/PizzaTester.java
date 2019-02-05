/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author cristy
 */
public class PizzaTester
{
    public static Pizza aPizzaOrder;

    /**
     * @param args the command line arguments
     * 5 methods are called from main:  getUserInput(), calculatePizzaCost(), checkForDiscount(), calculateTax(), and displayFinalPrice()
     */
    public static void main(String[] args)
    {

        getUserInput();  //method will create aPizzaOrder object, which is a global variable
        double cost = calculatePizzaCost();   //method will calculate cost of pizza and return it
        double discount = checkForDiscount(); //method will return either 0 or 2, depending on whether user earned a discount or not
        double finalCost = cost - discount;   //final cost after applying discount
        double tax = calculateTax(finalCost); //method will calculate tax using finalCost as argument, and return tax
        displayFinalPrice(finalCost, tax);    //method will receive finalCost and tax as argument, to display final price
    }


    /**
     * Add comments about the purpose of getUserInput() method
     */
    public static void getUserInput()
    {
        String firstName;               //user's first name
        String userInput;
        int pizzaSizeInInches;          //10, 12, 14, 16
        char pizzaType;                 //hand, thin, deep dish
        boolean cheeseTopping = false;
        boolean pepperoniTopping = false;
        boolean sausageTopping = false;
        boolean onionTopping = false;
        boolean mushroomTopping = false;

        //welcome message
        JOptionPane.showMessageDialog(null, "Welcome to Mike and Diane's Pizza.");


        //get user's first name
        firstName = JOptionPane.showInputDialog("Enter your first name: ");


        //prompt user and get pizza size choice
        JOptionPane.showMessageDialog(null, "Pizza Size (inches) Cost"+
                '\n'+ "10' $10.99"+
                '\n'+ "12' $12.99"+
                '\n'+ "14' $14.99"+
                '\n'+ "16' $16.99");

        userInput = JOptionPane.showInputDialog("What size pizza would you like?" +
                '\n'+"10, 12, 14, or 16(enter the number only)");
        pizzaSizeInInches = Integer.parseInt (userInput);


        userInput = JOptionPane.showInputDialog("What type of crust would you like?"+
                '\n'+"(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish)"+
                '\n'+ "(Enter H, T, or D):");
        pizzaType = userInput.charAt(0);




        //Task #0:  Write the if-statements to set the value of the cheeseTopping boolean flags to true or false, depending on
        //          whether the user says Yes or No.  Use charAt(0) to get the first letter of their response, and check for
        //          an uppercase and a lowercase version of the first letter ('Y' or 'y')
        //          Continue asking the user about all the other toppings (pepperoni, onion, sausage, mushroom), and setting the appropriate flags to true or false


        JOptionPane.showMessageDialog(null,"All pizzas come with cheese."+
                '\n'+"Additional toppings are $1.25 each."+
                '\n'+"Choose from: Additional Cheese, Pepperoni, Sausage, Onion, or Mushroom.");

        userInput = JOptionPane.showInputDialog("Would you like additional cheese?");

        if (userInput.charAt(0) == 'y' || userInput.charAt(0) == 'Y') {
            cheeseTopping = true;
        } else {
            cheeseTopping = false;
        }

        userInput = JOptionPane.showInputDialog("Would you like additional pepperoni?");

        if (userInput.charAt(0) == 'y' || userInput.charAt(0) == 'Y') {
            pepperoniTopping = true;
        } else {
            pepperoniTopping = false;
        }

        userInput = JOptionPane.showInputDialog("Would you like additional onion?");

        if (userInput.charAt(0) == 'y' || userInput.charAt(0) == 'Y') {
            onionTopping = true;
        } else {
            onionTopping = false;
        }

        userInput = JOptionPane.showInputDialog("Would you like additional sausage?");

        if (userInput.charAt(0) == 'y' || userInput.charAt(0) == 'Y') {
            sausageTopping = true;
        } else {
            sausageTopping = false;
        }

        userInput = JOptionPane.showInputDialog("Would you like additional mushroom?");

        if (userInput.charAt(0) == 'y' || userInput.charAt(0) == 'Y') {
            mushroomTopping = true;
        } else {
            mushroomTopping = false;
        }


        // Task #1:  Create an instance of aPizzaOrder by invoking the constructor, and passing it the values in firstName, pizzaSizeInInches, pizzaType, cheeseTopping, pepperoniTopping, sausageTopping, onionTopping, mushroomTopping.
        //           Hint:  Remember to use "new" to instantiate an object of aPizzaOrder

        aPizzaOrder = new Pizza(firstName, pizzaSizeInInches, pizzaType, cheeseTopping, pepperoniTopping, sausageTopping, onionTopping, mushroomTopping);





    }


    /**
     * add comments about the purpose of calculatePizzaCost() and describe the value that this method returns
     * @return
     */
    public static double calculatePizzaCost()
    {


        double cost = 12.99;            //cost of the pizza

        String toppings = "";          //list of toppings
        int numberOfToppings = 0;      //number of toppings
        String crust = "";
        final double TOPPING_PRICE = 1.25;


        if (aPizzaOrder.getHandThinDeep() == 'h'|| aPizzaOrder.getHandThinDeep() == 'H')
            crust = "Hand-Tossed";
        else if (aPizzaOrder.getHandThinDeep() == 't' || aPizzaOrder.getHandThinDeep() == 'T')
            crust = "Thin-Crust";
        else if (aPizzaOrder.getHandThinDeep() == 'd' || aPizzaOrder.getHandThinDeep() == 'D')
            crust = "Deep-Pan";

        if (aPizzaOrder.getCheeseTopping())
        {
            numberOfToppings += 1;
            toppings = toppings + "Additional Cheese ";
        }
        //Task #2a: Determine how many more toppings and concatenate them to the toppings String variable, and add 1 to numberOfToppings for each topping:



        //Task #2b:  Set the initial cost of the pizza based upon the size. Hint:  Use an if-statement (10inch = 10.99; 12inch = 12.99; 14inch = 14.99; 16inch = 16.99)



        // Finalize the total cost of the pizza:
        cost = cost + (TOPPING_PRICE * numberOfToppings);


        //Display the pizza order confirmation:
        JOptionPane.showMessageDialog(null, "Your order is as follows: " + "\n One " + aPizzaOrder.getPizzaSize() + " inch pizza \n" + crust + " crust " + toppings + ".");

        return cost;

    }

    /**
     * add comments about what this method does, and what is the value that it returns.
     * @return
     */
    public static double checkForDiscount()
    {
        double discount = 0;
        //return a discount if user is eligible
        //Task #3:  Figure out whether to return 0 or $2, depending on whether the customer's name is either Mike or Diana


        return discount;
    }


    /**
     * add comments about what this method does, what it receives as a parameter, and what value it returns.
     * @param cost
     * @return
     */
    public static double calculateTax(double cost)
    {
        final double TAX_RATE = .08;    //sales tax rate
        double tax = 0;

        //Task #4:  Calculate tax by multiplying tax_rate by parameter


        return tax;
    }


    /**
     * add comments about what this method does, what it receives as parameters.
     * @param cost
     * @param tax
     */
    public static void displayFinalPrice(double cost, double tax)
    {
        //ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES, using the DecimalFormat class defined at the beginning of this method.
        //calculate and display tax and total cost

        DecimalFormat aFormat = new DecimalFormat("$##0.00");

        //Task #5:  Using JOptionPane, display "The cost of your order is: " (use the DecimalFormat object)
        //          "The tax is: " (use the DecimalFormat object)
        //          "The total due is:  " (use the DecimalFormat object)
        //          "Your order will be ready for pick-up in 30 minutes."

    }

}
