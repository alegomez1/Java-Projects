import java.util.Scanner;
public class BodyMassIndex {

    //This static Person variable allows it to be called later on
    public static Person anyPerson;

    //Here in main I am calling the two methods to run the program
    public static void main(String[] args)
    {

        createPersonObject();
        displayBMI();
       System.out.println(anyPerson.toString());

    }

    /*
    This method is used to ask the user what their first name, height, and weight are, and then stores those values into variables
    It then creates a new instance of the Person object and passes those values as parameters
     */
    public static void createPersonObject()
    {
        Scanner keyboard = new Scanner(System.in);
        //Ask user for their first name, height in inches, and weight in pounds.
        String firstName;
        double height;
        double weight;

        System.out.println("What is your first name?");
        firstName = keyboard.nextLine();

        System.out.println("What is your height?");
        height = keyboard.nextDouble();

        System.out.println("What is your weight?");
        weight = keyboard.nextDouble();
        //Scanner and then ask user for information & store it in these local variables.

        anyPerson = new Person(firstName, height, weight);

        //Create a Person object and store it in the static variable, anyPerson
        //anyPerson = new ...

    }

    public static void displayBMI()
    {
         anyPerson.calculateBMI();

         double bmi = anyPerson.getBmi();
        //Call the method in the anyPerson object that calculates BMI


        //Display the BMI of the anyPerson object.

        //Display the appropriate message to the user, depending on
        //the following ranges:

        //A BMI below 18.5 is considered underweight.
        //A BMI of 18.5 to 24.9 is considered healthy.
        //A BMI of 25 to 29.9 is considered overweight.
        //A BMI of 30 or higher is considered obese.

        if (bmi < 18.5){
            System.out.println("You are underweight");
        }
        else if (bmi>= 18.5 && bmi <=24.9){
            System.out.println("You are healthy");
        }
        else if (bmi>=25 && bmi<=29.9){
            System.out.println("You are overweight");
        }
        else if (bmi>=30){
            System.out.println("You are obese");

        }
    }

}
