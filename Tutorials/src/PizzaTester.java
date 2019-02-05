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
     * The getUserInput() method creates different variables who's values change depending on what the user inputs.
     * This is used to store the user's name, their preferred pizza size and pizza type, as well as what kind of toppings they would like.
     * The only variables that are initialized are the booleans for the toppings which by default are set to false. If and when the user wants a topping their value becomes true.
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


        //Here I am creating an instance of aPizza order by invoking the constructor and passing it the values the user has given.
        aPizzaOrder = new Pizza(firstName, pizzaSizeInInches, pizzaType, cheeseTopping, pepperoniTopping, sausageTopping, onionTopping, mushroomTopping);
    }

    /**
     * This calculatePizzaCost() method is used to calculate exactly how much the pizza the user has selected will cost, based on their choice of toppings and size.
     * It then returns the cost as a double variable
     */
    public static double calculatePizzaCost()
    {


        //Here all the variables are being defined and initialized
        double cost = 12.99;            //cost of the pizza

        String toppings = "";          //list of toppings
        int numberOfToppings = 0;      //number of toppings
        String crust = "";
        final double TOPPING_PRICE = 1.25;


        //These if and else if statements check to see what type of crust the user has selected by checking in with the .getHandThinDeep() method from the Pizza domain class

        if (aPizzaOrder.getHandThinDeep() == 'h'|| aPizzaOrder.getHandThinDeep() == 'H')
            crust = "Hand-Tossed";
        else if (aPizzaOrder.getHandThinDeep() == 't' || aPizzaOrder.getHandThinDeep() == 'T')
            crust = "Thin-Crust";
        else if (aPizzaOrder.getHandThinDeep() == 'd' || aPizzaOrder.getHandThinDeep() == 'D')
            crust = "Deep-Pan";


        //Task #2a: Determine how many more toppings and concatenate them to the toppings String variable, and add 1 to numberOfToppings for each topping:

        /* These if statements use the getter functions from the Pizza domain class to check if the user has selected they would like that specific topping added

        If they have, the numberOfToppings variable will increase by 1 to indicate an extra topping has been added. A string indicating the type of additional topping is also

        added to the toppings String variable.
        */
        if (aPizzaOrder.getCheeseTopping())
        {
            numberOfToppings += 1;
            toppings = toppings + "Additional Cheese ";
        }

        if (aPizzaOrder.getPepperoniTopping())
        {
            numberOfToppings += 1;
            toppings = toppings + "Additional Pepperoni ";
        }

        if (aPizzaOrder.getSausageTopping())
        {
            numberOfToppings += 1;
            toppings = toppings + "Additional Sausage ";
        }

        if (aPizzaOrder.getOnionTopping())
        {
            numberOfToppings += 1;
            toppings = toppings + "Additional Onion ";
        }

        if (aPizzaOrder.getMushroomTopping())
        {
            numberOfToppings += 1;
            toppings = toppings + "Additional Mushroom ";
        }


        //Task #2b:  Set the initial cost of the pizza based upon the size. Hint:  Use an if-statement (10inch = 10.99; 12inch = 12.99; 14inch = 14.99; 16inch = 16.99)

        /* These if and else-if statements use the .getPizzaSize() method from the Pizza domain class to see what the user chose as the size they would like,
         * and depending on the size, it sets the cost accordingly
        */
        if (aPizzaOrder.getPizzaSize() == 10) {
            cost = 10.99;
        }
        else if (aPizzaOrder.getPizzaSize() == 12) {
            cost = 12.99;
        }
        else if (aPizzaOrder.getPizzaSize() == 14) {
            cost = 14.99;
        }
        else if (aPizzaOrder.getPizzaSize() == 16) {
            cost = 16.99;
        }
        else {
            //If the user does not pick one of the choices for size, I am telling them a 12 inch pizza will be made instead, and setting the size to 12 and the cost to 12.99
            JOptionPane.showMessageDialog(null, "You did not pick one of the choices so a 12 inch pizza will be made");
            aPizzaOrder.setPizzaSize(12);
            cost = 12.99;
        }


        // Finalize the total cost of the pizza:
        cost = cost + (TOPPING_PRICE * numberOfToppings);


        //Display the pizza order confirmation:
        JOptionPane.showMessageDialog(null, "Your order is as follows: "
                + "\nOne " + aPizzaOrder.getPizzaSize() + " inch pizza \n" + crust + " crust " + toppings + ".");

        return cost;

    }


    /**
     * The checkForDiscount() method uses the .getPizzaCustomerName() method from the Pizza domain class to check what the customer's name is.
     * If the customer's name is Mike or Diana/Diane, they get a discount of $2 which is stored in the discount variable, which then gets applied to the final cost in the main function.
     */
    public static double checkForDiscount()
    {
        double discount = 0;


        //Retrieving the entered customer name and setting it equal to a String variable.
        String customerName = aPizzaOrder.getPizzaCustomerName();

        //Here I am using an if statement to check what the customers name is to see whether or not they will get a discount.
        //Side note, I added both Diana and Diane, because here in the comments it says Diana but on the assignment page it says Diane so I'm using both just in case.
        //I'm using an .equalsIgnoreCase() function to account for the user typing the name with an uppercase or lowercase 'M' or 'D'

        if (customerName.equalsIgnoreCase("Mike") || customerName.equalsIgnoreCase("Diana") || customerName.equalsIgnoreCase("Diane")){
            System.out.println("Discount applied"); //I used this to check whether or not the discount was being applied appropriately by printing this message in the console
            discount = 2;

        } else {
            discount = 0;
            System.out.println("No discount applied"); //I used this to check whether or not the discount was being applied appropriately by printing this message in the console
        }


        return discount;
    }


    /**
     * The calculateTax() method received the cost as a parameter and returns a double.
     * The sales tax rate is set at 8% and this is multiplied by the parameter cost to set how much tax the user will pay.
     */
    public static double calculateTax(double cost)
    {
        final double TAX_RATE = .08;    //sales tax rate
        double tax = 0;

        //Task #4:  Calculate tax by multiplying tax_rate by parameter

        tax = TAX_RATE * cost;

        return tax;
    }


    /**
     * The displayFinalPrice() method receives the cost and tax double variables as parameters, and adds them to calculate what the total cost of the pizza is.
     * An object called aFormat is created from the DecimalFormat class to set what format we want the final cost displayed in.
     * A JOptionPane message box is then used to display to the user what the cost of their order is, the tax on it, the total cost,  and that it will be ready in 30 minutes.
     */
    public static void displayFinalPrice(double cost, double tax)
    {
        //ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES, using the DecimalFormat class defined at the beginning of this method.
        //calculate and display tax and total cost

        DecimalFormat aFormat = new DecimalFormat("$##0.00");


        double totalCost = cost + tax;

        JOptionPane.showMessageDialog(null, "The cost of your order is: " + aFormat.format(cost)
                + "\nThe tax is: " + aFormat.format(tax)
                + "\nThe total cost of your order is: " + aFormat.format(totalCost)
                + "\nYour order will be ready for pick-up in 30 minutes.");

        //Task #5:  Using JOptionPane, display "The cost of your order is: " (use the DecimalFormat object)
        //          "The tax is: " (use the DecimalFormat object)
        //          "The total due is:  " (use the DecimalFormat object)
        //          "Your order will be ready for pick-up in 30 minutes."

    }

}
