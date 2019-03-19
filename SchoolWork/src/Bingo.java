import java.util.Random;
import java.util.Scanner;
public class Bingo {

    /**
     * @param args the command line arguments
     */
    public static BingoCard gameCard;
    public static int totalGamesWon = 0;


    public static void main(String[] args) {

        int playAgain = 1;
        Scanner keyboard = new Scanner(System.in);

        /*
        *   This do-while loop is meant to run at least once and then ask the player if they would like to keep playing
        *   Their response is tied to the playAgain variable
        *   Every time the loop runs, the methods playGame() and determineWinner() are called to run the program and simulate a Bingo game
        *   How many games the user has won so far is also displayed
         */
        do
        {
            gameCard = new BingoCard();
            playGame();
            determineWinner();
            System.out.println("\nSo far you have won "+ totalGamesWon + " games");
            System.out.println("\nDo you want to play again?\n" +
                    "1: Yes\t2: No");
            playAgain = keyboard.nextInt();

        }while (playAgain == 1);

    }

    /*
    *   This method is meant to simulate a Bingo game by running a loop 25 times to simulate the drawing of 25 random numbers in a Bingo game
    *   There are then a series of if statements to check to see if the random number generated is between a certain range, and furthermore to see if it matches one of the random numbers tied to the letters
    *   If there is a match, that letter's number becomes a 0 to simulate that user's number having been drawn
     */
    public static void playGame()
    {
        Random myRan = new Random();

        for (int i = 0; i<25; i++){
            int numberDrawn = myRan.nextInt(75) + 1;

            if (numberDrawn>=1 && numberDrawn<=15){
                if (numberDrawn == gameCard.getbNum1()){
                    gameCard.setbNum1(0);
                }
                else if (numberDrawn == gameCard.getbNum2()){
                    gameCard.setbNum2(0);
                }
                else if (numberDrawn == gameCard.getbNum3()){
                    gameCard.setbNum3(0);
                }
                else if (numberDrawn == gameCard.getbNum4()){
                    gameCard.setbNum4(0);
                }
                else if (numberDrawn == gameCard.getbNum5()){
                    gameCard.setbNum5(0);
                }
            }
            else if (numberDrawn>=16 && numberDrawn<=30){
                if (numberDrawn == gameCard.getiNum1()){
                    gameCard.setiNum1(0);
                }
                if (numberDrawn == gameCard.getiNum2()){
                    gameCard.setiNum2(0);
                }
                if (numberDrawn == gameCard.getiNum3()){
                    gameCard.setiNum3(0);
                }
                if (numberDrawn == gameCard.getiNum4()){
                    gameCard.setiNum4(0);
                }
                if (numberDrawn == gameCard.getiNum5()){
                    gameCard.setiNum5(0);
                }
            }
            else if (numberDrawn>=31 && numberDrawn<=45){
                if ( gameCard.getnNum1() == numberDrawn){
                    gameCard.setnNum1(0);
                }
                else if (numberDrawn == gameCard.getnNum2()){
                    gameCard.setnNum2(0);
                }
                else if (numberDrawn == gameCard.getnNum3()){
                    gameCard.setnNum3(0);
                }
                else if (numberDrawn == gameCard.getnNum4()){
                    gameCard.setnNum4(0);
                }
                else if (numberDrawn == gameCard.getnNum5()){
                    gameCard.setnNum5(0);
                }
            }
            else if (numberDrawn>=46 && numberDrawn<=60){
                if (numberDrawn == gameCard.getgNum1()){
                    gameCard.setgNum1(0);
                }
                else if (numberDrawn == gameCard.getgNum2()){
                    gameCard.setgNum2(0);
                }
                else if (numberDrawn == gameCard.getgNum3()){
                    gameCard.setgNum3(0);
                }
                else if (numberDrawn == gameCard.getgNum4()){
                    gameCard.setgNum4(0);
                }
                else if (numberDrawn == gameCard.getgNum5()){
                    gameCard.setgNum5(0);
                }
            }
            else if (numberDrawn>=61 && numberDrawn<=75){
                if (numberDrawn == gameCard.getoNum1()){
                    gameCard.setoNum1(0);
                }
                else if (numberDrawn == gameCard.getoNum2()){
                    gameCard.setoNum2(0);
                }
                else if (numberDrawn == gameCard.getoNum3()){
                    gameCard.setoNum3(0);
                }
                else if (numberDrawn == gameCard.getoNum4()){
                    gameCard.setoNum4(0);
                }
                else if (numberDrawn == gameCard.getoNum5()){
                    gameCard.setoNum5(0);
                }
            }

        }

    }

    /*
    *   This method is used to determine if the user's Bingo card has won or not
    *   It first displays the card in a way that simulates the way a real Bingo card is set up
    *   Then it called the gotBingo() method from the constructor class to determine if the user has got Bingo
    *   If they have it tells them seo and adds a 1 to the totalGamesWon variable, otherwise it tells the user they did not win
     */
    public static void determineWinner()
    {
        System.out.printf("\n" +
                        "%d  %d  %d  %d  %d  \n" +
                        "%d  %d  %d  %d  %d  \n" +
                        "%d  %d  %d  %d  %d  \n" +
                        "%d  %d  %d  %d  %d  \n" +
                        "%d  %d  %d  %d  %d  \n",
                gameCard.getbNum1(),gameCard.getiNum1(),gameCard.getnNum1(),gameCard.getgNum1(),gameCard.getoNum1(),
                gameCard.getbNum2(),gameCard.getiNum2(),gameCard.getnNum2(),gameCard.getgNum2(),gameCard.getoNum2(),
                gameCard.getbNum3(),gameCard.getiNum3(),gameCard.getnNum3(),gameCard.getgNum3(),gameCard.getoNum3(),
                gameCard.getbNum4(),gameCard.getiNum4(),gameCard.getnNum4(),gameCard.getgNum4(),gameCard.getoNum4(),
                gameCard.getbNum5(),gameCard.getiNum5(),gameCard.getnNum5(),gameCard.getgNum5(),gameCard.getoNum5()
                );

       if (gameCard.gotBingo()){
           System.out.println("\nBINGO!");
           totalGamesWon +=1;
       }
       else {
           System.out.println("\nNo Bingo");
       }
    }

}





