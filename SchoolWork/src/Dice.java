import java.util.Random;

public class Dice {

    //These are the private variables to represent the value for each die
    private int die1;
    private int die2;

    //This is the constructor for the Dice class. It initializes each die's value to 0
    public Dice()
    {
        die1 = 0;
        die2 = 0;
    }

    /*
    * This method is used to roll the dice
    * It creates a myRan object as an instance of the Random() class
    * Each die variable is set to a random number between 1 and 6
     */
    public void rollDice()
    {
        Random myRan = new Random();

        die1 = myRan.nextInt(6) + 1;
        die2 = myRan.nextInt(6) + 1;
    }

    //These are all the getters and setters for the die1 and die2 variables
    public int getDie1() {
        return die1;
    }

    public void setDie1(int die1) {
        this.die1 = die1;
    }

    public int getDie2() {
        return die2;
    }

    public void setDie2(int die2) {
        this.die2 = die2;
    }

    //This is the toString() method that returns a String to show what the values of the die variables are
    public String toString()
    {
        return "You rolled a ..." + die1 + " and " + die2;   }
}
