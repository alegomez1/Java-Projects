package OldStuff;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author
 */
public class MidtermPractice
{
    public static SlotMachine aSM;
    public static int numTokens = 20;

    /*
    *   Here in main I created a do while loop that is meant to run every time the user responds with 'Yes' when asked if they want to play
    *   Every time the loop runs, it runs both methods as well as subtract 2 from the total number of tokens
    *   If at any point the user runs out of tokens or responds that they do not want to play again, the loop stops and thanks the user for playing
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String userPlayAgain = "yes";
        //Instantiate a OldStuff.SlotMachine object:
        aSM = new SlotMachine();

        do
        {
            System.out.println("Do you want to play?");
            userPlayAgain = keyboard.nextLine();

            //This if statement checks to see if the user does want to play again and if they have enough tokens available to play
            if (userPlayAgain.equalsIgnoreCase("yes") && numTokens>=2){
                playSlotMachine();
                determineWinner();
                numTokens -= 2;
            }
            else {
                System.out.println("Thanks for playing, please come again!");
            }
        }while (userPlayAgain.equalsIgnoreCase("yes"));

    }
/*
*   This method is used to generate 3 random numbers
*   It creates an instance of the Random class under the object myRan. This object is then used to generate those 3 random numbers from 1-7
*   These numbers are then assigned to int variables num1, num2, and num3
*   Then the object aSM uses its setter functions to set each variable to the RanNum1, RanNum2, and RanNum3 from the OldStuff.SlotMachine class
 */
    public static void playSlotMachine()
    {
        Random myRan = new Random();
        int num1, num2, num3;

        num1 = myRan.nextInt(7)+1;
        num2 = myRan.nextInt(7)+1;
        num3 = myRan.nextInt(7)+1;

        aSM.setRanNum1(num1);
        aSM.setRanNum2(num2);
        aSM.setRanNum3(num3);
    }

/*
*   This method is used to ask the user to guess each of the three numbers generated, and it then determines how many of the user's guesses are correct
 */
    public static void determineWinner()
    {
        Scanner keyboard = new Scanner(System.in);
        int guess1, guess2, guess3, num1, num2, num3;
        int matches = 0;

        num1= aSM.getRanNum1();
        num2= aSM.getRanNum2();
        num3= aSM.getRanNum3();


        System.out.println("Guess the first number");
        guess1 = keyboard.nextInt();
        if (num1 == guess1){
            matches+=1;
        }

        System.out.println("Guess the second number");
        guess2 = keyboard.nextInt();
        if (num2 == guess2){
            matches+=1;
        }

        System.out.println("Guess the third number");
        guess3 = keyboard.nextInt();
        if (num3 == guess3){
            matches+=1;
        }

        if (matches ==3){
            System.out.println("You are the grand prize winner!");
        }
        else if (matches ==2){
            System.out.println("Good job, almost there");
        }
        else {
            System.out.println("Sorry, try again");
        }

    }

}
