import java.util.Scanner;
public class CalculatorTester {


    //Ask user what they would like to do

    public static void askUser(){
        CalculatorDomain calc = new CalculatorDomain();
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter first number");
        int num1 = kb.nextInt();

        System.out.println("Please enter second number");
        int num2 = kb.nextInt();
        kb.nextLine();

        System.out.println("What would you like to do?\n" +
                "1: Add numbers\n" +
                "2: Substract numbers\n" +
                "3: Average numbers");
        int option = kb.nextInt();

        switch (option){
            case 1:
                System.out.println(calc.additionMethod(num1, num2));
                break;

            case 2:
                System.out.println(calc.differenceMethod(num1, num2));
                break;

            case 3:
                System.out.println(calc.averageMethod(num1,num2));
                break;

                default:
                    System.out.println("You did not enter a number");
                    break;


        }
    }

    public static void main(String[] args) {

        askUser();


    }
}
