package OldStuff;

import java.util.Random;

/**
 * This class simulates rolling a pair of dice 10,000 times and counts the
 * number of times doubles of are rolled for each different pair of doubles.
 */
public class DiceSimulation {

    static final int NUMBER = 10000; //the number of times to roll the dice
    //a random number generator used in simulating rolling a dice
    static Random generator = new Random();
    static Dice myDice;

    static int count = 0; // number of times the dice were rolled
    static int ones = 0; // number of times double one is rolled
    static int twos = 0; // number of times double two is rolled
    static int threes = 0; // number of times double three is rolled
    static int fours = 0; // number of times double four is rolled
    static int fives = 0; // number of times double five is rolled
    static int sixes = 0; // number of times double six is rolled

    //Here in main I am calling all three methods to run the program
    public static void main(String[] args)
    {
        rollDiceAndTabulateWhile();

        rollDiceAndTabulateDoWhile();

        rollDiceAndTabulateFor();
    }
    /*
    * This method is used to to roll the dice 10,000 times while using a while loop
    * It creates an instance of the OldStuff.Dice class called myDice which is used to call methods from the OldStuff.Dice class
    * At the start of the method I call the clearCounters() method in order to clear the values of the variables
    * At the end I call the summarizeResults() method in order to display the values for each variable
     */
    public static void rollDiceAndTabulateWhile()
    {
        Dice myDice = new Dice();
        clearCounters();


        // I set the while loop to run while count does not equal NUMBER so that once it reaches 10,000 times, it stops

        while (count!=NUMBER){
            myDice.rollDice();
            //I declare these two variables equal to the getDie() methods from the OldStuff.Dice class so it's easier to read in the if/else-if statements
           int die1 = myDice.getDie1();
           int die2= myDice.getDie2();

           //The if/else-if statements are set up so that if both variables have the same value, it will add 1 to the ones, twos, etc. variables, and also 1 to count
            if (die1 == 1 && die2 ==1){
                ones++;
                count++;
            }
            else if (die1 == 2 && die2 == 2){
                twos++;
                count++;
            }
            else if (die1 == 3 && die2 == 3){
                threes++;
                count++;
            }
            else if (die1 == 4 && die2 == 4){
                fours++;
                count++;
            }
            else if (die1 == 5 && die2 == 5){
                fives++;
                count++;
            }
            else if (die1 == 6 && die2 == 6){
                sixes++;
                count++;
            }
            //If the variables are not equal to each other, it simply adds 1 to the count so the loop does not run infinitely
            else {
                count++;
            }
        }
        System.out.println("\nThese results were made using a while loop\n" +
                "**************************************");
        summarizeResults();
    }

    /*
    * This method is used to roll the dice 10,000 but using a do-while loop
    * The clearCounters() method is called at the beginning in order to set the values of the variables back to 0
    * I create a myDice object as an instance of the OldStuff.Dice() class in order to call its methods
    * At the end I call the summarizeResults() method in order to display the values for each variable
     */
    public static void rollDiceAndTabulateDoWhile()
    {
        clearCounters();
        Dice myDice = new Dice();
        do
        {
            myDice.rollDice();
            //I declare these two variables equal to the getDie() methods from the OldStuff.Dice class so it's easier to read in the if/else-if statements
            int die1 = myDice.getDie1();
            int die2= myDice.getDie2();

            //The if/else-if statements are set up so that if both variables have the same value, it will add 1 to the ones, twos, etc. variables, and also 1 to count
            if (die1 == 1 && die2 ==1){
                ones++;
                count++;
            }
            else if (die1 == 2 && die2 == 2){
                twos++;
                count++;
            }
            else if (die1 == 3 && die2 == 3){
                threes++;
                count++;
            }
            else if (die1 == 4 && die2 == 4){
                fours++;
                count++;
            }
            else if (die1 == 5 && die2 == 5){
                fives++;
                count++;
            }
            else if (die1 == 6 && die2 == 6){
                sixes++;
                count++;
            }
            else {
                count++;
            }
            //Like the previous loop, I have it set to run while count is not equal to NUMBER so that it runs 10,000 times
        } while (count!=NUMBER);

        System.out.println("\nThese results were made using a do-while loop\n" +
                "**************************************");
        summarizeResults();
    }

    /*
    * This method is used to roll the dice 10,000 times but using a for loop instead
    * The clearCounters() method is called at the beginning in order to set the values of the variables back to 0
    * I create a myDice object as an instance of the OldStuff.Dice() class in order to call its methods
    * At the end I call the summarizeResults() method in order to display the values for each variable
     */
    public static void rollDiceAndTabulateFor()
    {
        clearCounters();
        Dice myDice = new Dice();

        //I set i equal to 0 and have the loop run while i is less than NUMBER. Every time it runs it adds 1 to counter
        for (int i = 0; i<NUMBER; i++){
            myDice.rollDice();

            //I declare these two variables equal to the getDie() methods from the OldStuff.Dice class so it's easier to read in the if/else-if statements
            int die1 = myDice.getDie1();
            int die2 = myDice.getDie2();

            //The if/else-if statements are set up so that if both variables have the same value, it will add 1 to the ones, twos, etc. variables, and also 1 to count
            if (die1 == 1 && die2 ==1){
                ones++;
                count++;
            }
            else if (die1 == 2 && die2 == 2){
                twos++;
                count++;
            }
            else if (die1 == 3 && die2 == 3){
                threes++;
                count++;
            }
            else if (die1 == 4 && die2 == 4){
                fours++;
                count++;
            }
            else if (die1 == 5 && die2 == 5){
                fives++;
                count++;
            }
            else if (die1 == 6 && die2 == 6){
                sixes++;
                count++;
            }
            else {
                count++;
            }

        }
        System.out.println("\nThese results were made using a for loop\n" +
                "**************************************");
        summarizeResults();
    }

    /*
    * This clearCounters() method is used to set all the values of the variables back to 0 so that when each loop method runs, they start anew at 0
     */
    public static void clearCounters()
    {
        count = 0;
        ones = 0;
        twos = 0;
        threes = 0;
        fours = 0;
        fives = 0;
        sixes = 0;
    }

    /*
    * This summarizeResults() method is used to print out how many times each double of the numbers was rolled
     */
    public static void summarizeResults()
    {
        System.out.printf("\nYou rolled this many double ones: %d\n" +
                "You rolled this many double twos: %d\n" +
                "You rolled this many double threes: %d\n" +
                "You rolled this many double fours: %d\n" +
                "You rolled this many double fives: %d\n" +
                "You rolled this many double sixes: %d\n", ones, twos, threes, fours, fives, sixes);


    }
}

