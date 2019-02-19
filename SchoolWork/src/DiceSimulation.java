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

    public static void main(String[] args)
    {

        // instantiate the dice object
        // Call each of the 3 looping METHODS HERE

        rollDiceAndTabulateWhile();

        System.out.println("\nExecuted");
    }

    public static void rollDiceAndTabulateWhile()
    {
        //Complete task 2 here:
        //Call the clearCounters() method
        Dice newDice = new Dice();
        clearCounters();

        while (count!=NUMBER){
            newDice.rollDice();
            newDice.getDie1();
            newDice.getDie2();

            if (newDice.getDie1() == 1 && newDice.getDie2() ==1){
                ones++;
                count++;
            }
            else if (newDice.getDie1() == 2 && newDice.getDie2() == 2){
                twos++;
                count++;
            }
            else if (newDice.getDie1() == 3 && newDice.getDie2() == 3){
                threes++;
                count++;
            }
            else if (newDice.getDie1() == 4 && newDice.getDie2() == 4){
                fours++;
                count++;
            }
            else if (newDice.getDie1() == 5 && newDice.getDie2() == 5){
                fives++;
                count++;
            }
            else if (newDice.getDie1() == 6 && newDice.getDie2() == 6){
                sixes++;
                count++;
            }

            else {
                count++;
            }
        }

        summarizeResults();

        //Use a while loop to generate 10000 dice rolls
        //Hint: call the rollDice() method inside the loop and check dice value using getters
        //Call the summarizeResults() method
    }

    public static void rollDiceAndTabulateDoWhile()
    {
        //Complete task 3 here:
        //Call the clearCounters() method

        //Use a Do-While loop to generate 10000 dice rolls
        //Hint: call the rollDice() method inside the loop and check dice value using getters
        //Call the summarizeResults() method
    }

    public static void rollDiceAndTabulateFor()
    {
        //Complete task 4 here:
        //Call the clearCounters() method

        //Use a for-loop to generate 10000 dice rolls
        //Hint: call the rollDice() method inside the loop and check dice value using getters
        //Call the summarizeResults() method
    }

    public static void clearCounters()
    {
        //Complete task 5 here:
        //reset all counters back to 0
        count = 0;
        ones = 0;
        twos = 0;
        threes = 0;
        fours = 0;
        fives = 0;
        sixes = 0;
    }

    public static void summarizeResults()
    {
        //Complete task 6 here:
        //Print out the value of all counters
        System.out.printf("You rolled this many double ones: %d\n" +
                "You rolled this many double twos: %d\n" +
                "You rolled this many double threes: %d\n" +
                "You rolled this many double fours: %d\n" +
                "You rolled this many double fives: %d\n" +
                "You rolled this many double sixes: %d", ones, twos, threes, fours, fives, sixes);

    }
}
