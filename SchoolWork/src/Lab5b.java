import java.util.Scanner;
import javax.swing.JOptionPane;
public class Lab5b {

    /*
     Scenario 1 – You go to an arcade with 20 tokens, and each game costs 2 tokens. What loop should you use, and why?
     Every time you play, you should show the number of tokens you have left.
     Before the loop starts, display how many tokens you have available to play with.
     After the loop ends, state how many tokens you have left.
     */
    public static void scenario1(){

        int tokens = 20;
        int games = 0;

        for (int x = tokens; tokens != 0; x ++) {

            JOptionPane.showMessageDialog(null, "You have " + tokens + " tokens available");
            System.out.println("You have " + tokens + " tokens available");

            tokens -= 2;

            games += 1;

            JOptionPane.showMessageDialog(null, "You currently have: " + tokens + " tokens left");
            System.out.println("You currently have: " + tokens + " tokens left");
        }
        System.out.println("You played a total of " + games + " games");
    }

    /*
    Scenario 2 – You are playing a guessing game with your little cousin.  She writes down her favorite color on a piece of paper, and folds it over.
    Then, she asks you to guess her favorite color.  What loop should you use for that, and why?
    In the loop, ask the user to guess the favorite color, and compare it to the actual favorite color
    variable that had been initialized before the loop began. In the loop, display whether the user’s guess was correct or not.
     */

    public static void scenario2(){

        Scanner keyboard = new Scanner(System.in);
        String favoriteColor = "red";
        String userGuess = "blue";

        while (!favoriteColor.equalsIgnoreCase(userGuess)){

            userGuess = JOptionPane.showInputDialog("Guess what color is written down");
            //userGuess = keyboard.nextLine();
            if (userGuess.equalsIgnoreCase(favoriteColor)){
               // System.out.println("You guessed correctly!");
                JOptionPane.showMessageDialog(null, "You guessed correctly!");
            }
            else {
                //System.out.println("You guessed wrong\n");
                JOptionPane.showMessageDialog(null, "You guessed wrong");
            }
        }

    }


    /* ******DRAW IO FOR FLOWCHARTS*****

    Scenario 3 – You go to an arcade with 100 tokens, and each game costs a variable number of tokens.
    What loop should you use, and why? Before the loop begins, display how many tokens you have available.
    Inside the loop, ask the user how many tokens does the next game cost, and subtract that amount from the
    total tokens if it is less than or equal to the total tokens.  Then, state how many tokens are still left.
     */


    public static void scenario3() {

        Scanner keyboard = new Scanner(System.in);
        int tokens = 100;
        int gameCost;
        String strGameCost;

        for (gameCost =0; gameCost<=tokens;){


            JOptionPane.showMessageDialog(null, "You have " + tokens + " tokens available to play");
            strGameCost = JOptionPane.showInputDialog(null,"How many tokens does this game cost?");
            gameCost = Integer.parseInt(strGameCost);

            if (gameCost<=tokens){
                tokens -= gameCost;
                JOptionPane.showMessageDialog(null, "You can play this game!");
            }
            else {
                JOptionPane.showMessageDialog(null, "You do not have enough tokens to play");
            }

        }




    }


    /*
    Scenario 4 – You go to an all-you-can-eat buffet.  You are trying to eat only until you are no longer hungry.
    What loop should you use, and why? The loop should ask the user if he/she is STILL hungry, and if the answer
    is “yes” then the loop should display “eat more.”
     */

    public static void scenario4() {

        String userHunger = "";
        String noMore = "No";

      //  for (!userHunger.equalsIgnoreCase(noMore)){
            userHunger = JOptionPane.showInputDialog(null, "Are you still hungry?");
            if (!userHunger.equalsIgnoreCase(noMore)){
                JOptionPane.showMessageDialog(null, "Eat more");
        }
    }


    /*
    Scenario 5 – It is Saturday night, and you are watching the Lottery draw for Fantasy Five.
    You get inspired to write a program to generate 10 lotto tickets, each ticket has 5 Lotto numbers.
    What loop should you use, and why? Note: To generate the 5 lotto numbers, you could create another
    loop inside the outer loop.  This is called a “nested” loop. The outer loop is for the number of tickets,
    and the inner loop is for the number of Lotto numbers on each ticket. The output should look like
    this, where – stands for the randomly generated number between 1 & 60, and … stands for the remaining tickets.
     */

    public static void scenario5() {

    }


    public static void main(String[] args) {

        //scenario1();
        //scenario2();
        //scenario3();
    }
}
