import java.util.Scanner;

public class Playground {





    public static void main(String[] args) {


            Scanner kb = new Scanner(System.in);

            System.out.println("What is your favorite number?");

            int x = kb.nextInt();

            if (x > 0){
                do
                {
                    System.out.println("Your number: " + x + " is still greater than 0");
                    x--;
                }while (x>0);


            } else if (x == 0){
                System.out.println("You're entered zero!");
            } else {
                System.out.println("Please enter a positive number");
            }



    }
}
