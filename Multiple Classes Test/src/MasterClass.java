import java.util.Scanner;
public class MasterClass {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What would you like to do today?\n1: Calculator\n2: Nursing school simulator");
        int userChoice = keyboard.nextInt();

        switch (userChoice){

            case 1:
                calculatorClass sum = new calculatorClass();
                System.out.println("Please enter a number");
                int number1 = keyboard.nextInt();
                System.out.println("Please enter a second number");
                int number2 = keyboard.nextInt();
                System.out.println(sum.addingCalculation(number1, number2));
                break;

            case 2:

                nameClass nursing = new nameClass();

                System.out.println("What is your name?");

                keyboard.nextLine();

                String name = keyboard.nextLine();

                System.out.println("Congratulations " + name + " you've been accepted to all the following schools with a full ride scholarship: FIU, Harvard, Yale, NOVA, FSU, UF, and UM!");

                break;






        }




    }
}
