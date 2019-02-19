import java.util.Random;

public class Dice {

    private int die1;
    private int die2;

    public Dice()
    {
        die1 = 0;
        die2 = 0;
    }

    //accessors for die1 & die2 go here:


    public void rollDice()
    {
        Random myRan = new Random();

        die1 = myRan.nextInt(6) + 1;
        die2 = myRan.nextInt(6) + 1;
    }


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

    public String toString()
    {
        return "You rolled a ..." + die1 + " and " + die2;   }
}
