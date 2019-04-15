package Challenge6;

public class LotteryGame {

    /*  Here in main I create an instance of the Lottery class called 'lotto'
    *   Then I run the getUserPicks() method form the lotto class to start the program
    *   I created an int variable called numberOfMatches that is equal to the int value returned from the checkLotteryMatch() method
    *   Finally, there are a set of if, else-if statements that check to see what the value of numberOfMatches is
    *   Depending on the value it tells the user what they've won or have not won
     */
    public static void main(String[] args) {

        Lottery lotto = new Lottery();

        lotto.getUserPicks();

        int numberOfMatches = lotto.checkLotteryMatch();

        if(numberOfMatches == 3){
            System.out.println("You have won an a free lottery ticket!");
        }
        else if (numberOfMatches ==4){
            System.out.println("You have won a $2,000 prize!");
        }
        else if (numberOfMatches == 5){
            System.out.println("You have won a $50,000 prize!");
        }
        else if (numberOfMatches == 6){
            System.out.println("You have won a $1,000,000 grand prize!");
        }
        else {
            System.out.println("Sorry, no matches today. Try again");
        }

    }
}
