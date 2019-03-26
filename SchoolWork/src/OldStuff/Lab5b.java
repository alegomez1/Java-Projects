package OldStuff;

import java.util.Random;
import javax.swing.JOptionPane;
public class Lab5b {

    /*
     Scenario 1 – You go to an arcade with 20 tokens, and each game costs 2 tokens. What loop should you use, and why?
     Every time you play, you should show the number of tokens you have left.
     Before the loop starts, display how many tokens you have available to play with.
     After the loop ends, state how many tokens you have left.
     */


    /*
    * For this scenario I used a for loop and set it to run as long as tokens does not equal 0
    * That allows it to not run infinitely, as every time it runs, the value of tokens decreases by 2
    * At the beginning and end of every loop it shows the user their balance of tokens
     */
    public static void scenario1(){

        //This tokens variable is used to track how many tokens the user has left
        int tokens = 20;

        for (int x = tokens; tokens != 0; x ++) {

            JOptionPane.showMessageDialog(null, "You have " + tokens + " tokens available");

            tokens -= 2;

            JOptionPane.showMessageDialog(null, "You currently have: " + tokens + " tokens left");

        }
    }

    /*
    Scenario 2 – You are playing a guessing game with your little cousin.  She writes down her favorite color on a piece of paper, and folds it over.
    Then, she asks you to guess her favorite color.  What loop should you use for that, and why?
    In the loop, ask the user to guess the favorite color, and compare it to the actual favorite color
    variable that had been initialized before the loop began. In the loop, display whether the user’s guess was correct or not.
     */


    /*
    * For this scenario I used a while loop to run as long as the user's guess does not equal the favorite color
    * Whether the user guesses wrong or right the program lets them know
     */
    public static void scenario2(){

        //These two string variables are used to track what the favorite color is and compare it against the user's guess
        String favoriteColor = "red";
        String userGuess = "blue";

        while (!favoriteColor.equalsIgnoreCase(userGuess)){

            //userGuess changes every time the loop is run
            userGuess = JOptionPane.showInputDialog("Guess what color is written down");

            if (userGuess.equalsIgnoreCase(favoriteColor)){

                JOptionPane.showMessageDialog(null, "You guessed correctly!");
            }
            else {

                JOptionPane.showMessageDialog(null, "You guessed wrong");
            }
        }
    }


/*
    Scenario 3 – You go to an arcade with 100 tokens, and each game costs a variable number of tokens.
    What loop should you use, and why? Before the loop begins, display how many tokens you have available.
    Inside the loop, ask the user how many tokens does the next game cost, and subtract that amount from the
    total tokens if it is less than or equal to the total tokens.  Then, state how many tokens are still left.
     */


/*
    * For this scenario I used a for loop to track how many tokens the user has, and whether or not that is enough to play an arcade game, depending on the game's token cost
    * If the user has enough tokens available, it says they can play and then subtracts that amount from the total token count
 */
    public static void scenario3() {

        //These are the variables used to track the values throughout the program
        int tokens = 100;
        int gameCost;
        String strGameCost;


        for (gameCost =0; tokens>=0;){

            JOptionPane.showMessageDialog(null, "You have " + tokens + " tokens available to play");
            //strGameCost has to be parsed into an int so that gameCost can be subtracted from the tokens count accordingly
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

    /*
    * For this scenario I used a do while loop because I wanted it to run at least once to ask the user if they are hungry
    * Depending on the answer the loop will either run again and keep asking if the user is hungry, and stop once they say no
     */
    public static void scenario4() {
        //This String variable is used to track the user's response to whether they are still hungry or not
        String isUserHungry = " ";

        do
        {
            String hungerResponse = JOptionPane.showInputDialog(null,"Are you still hungry?\nYes or No");
            if (hungerResponse.equalsIgnoreCase("Yes")){

                isUserHungry = "Yes";
                JOptionPane.showMessageDialog(null, "Eat more");
            }
            else if (hungerResponse.equalsIgnoreCase("No")){
                isUserHungry = "No";
                JOptionPane.showMessageDialog(null, "You are full");
            }

        } while (isUserHungry.equalsIgnoreCase("Yes"));
    }


    /*
    Scenario 5 – It is Saturday night, and you are watching the Lottery draw for Fantasy Five.
    You get inspired to write a program to generate 10 lotto tickets, each ticket has 5 Lotto numbers.
    What loop should you use, and why? Note: To generate the 5 lotto numbers, you could create another
    loop inside the outer loop.  This is called a “nested” loop. The outer loop is for the number of tickets,
    and the inner loop is for the number of Lotto numbers on each ticket. The output should look like
    this, where – stands for the randomly generated number between 1 & 60, and … stands for the remaining tickets.
     */

    /*
    * For this scenario I used a pair of nested for loops as well as a myRan object which is an instance of the Random class
    * The myRan object is used to generate random numbers from 1-60 to be shown as the five lottery numbers
    * The first loop is used to indicate how many tickets will be drawn which is 10 tickets'
    * The second loop is used to assign five random numbers from 1-60 as the winning numbers on each ticket, and display it on said ticket
    *
     */
    public static void scenario5() {

        //The values of these five variables change every time the second loop is run
        int number1, number2, number3, number4, number5;

        Random myRan = new Random();

        for(int tickets = 1; tickets<=10; tickets++){

            for (int numbers = 1; numbers<=1; numbers++){

                number1 = myRan.nextInt(60) + 1;
                number2 = myRan.nextInt(60) + 1;
                number3 = myRan.nextInt(60) + 1;
                number4 = myRan.nextInt(60) + 1;
                number5 = myRan.nextInt(60) + 1;


                JOptionPane.showMessageDialog(null,
                        "Ticket " + tickets + ":\t" + number1 + " " + number2 + " " +  number3 + " " +  number4 + " " +  number5);
            }

        }
    }

    public static void test(){
        int i = 5;



        for(i = 0; i < 2; i = i + 1)

        {

            System.out.println(i);

        }
    }

    //Here in main I am calling the 5 different scenarios to run the program
    public static void main(String[] args) {

//        scenario1();
//        scenario2();
//        scenario3();
//        scenario4();
//        scenario5();
        test();

    }
}



/*    public static void bingo(){
        int number1, number2, number3, number4, number5;
        Random myRan = new Random();

        for (int rows =0; rows<1; rows++){
            System.out.print("B\tI\tN\tG\tO");

            for (int numbers= 0; numbers<=4; numbers++){
                number1 = myRan.nextInt(15) + 1;
                number2 = myRan.nextInt(15) + 1;
                number3 = myRan.nextInt(15) + 1;
                number4 = myRan.nextInt(15) + 1;
                number5 = myRan.nextInt(15) + 1;

                System.out.printf(("\n%d\t%d\t%d\t%d\t%d"), number1, number2, number3, number4, number5);
            }


        }
    }*/
