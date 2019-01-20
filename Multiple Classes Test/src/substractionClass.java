import java.util.Scanner;

public class substractionClass {
    public int substractionMethod(int number1, int number2) {

       int difference = number1 - number2;
       return difference;


    }

    public String testMethod() {

        Scanner keyboard = new Scanner((System.in));

        System.out.println("What is your name?");
       String username = keyboard.nextLine();

       return username;


    }
}
