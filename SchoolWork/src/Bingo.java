public class Bingo {

    /**
     * @param args the command line arguments
     */
    public static BingoCard gameCard;
    public static int totalGamesWon = 0;

    public static void main(String[] args) {

        //Use do-while loop to do the following:
        //1.  instantiate a gameCard
        //2.  call the method playGame()
        //3.  call the method determineWinner()
        //4.  Ask user if they wish to play again? (1 = yes; 2 = no)
        //5.  Loop while user replies 1

        //Display value in totalGamesWon

    }

    public static void playGame()
    {
        //Loop 25 times, simulating the 25 balls in a BINGO game
        //Inside loop:
        //1.  Generate a random number between 1 and 75

        //2.  if the number generated is between 1–15,
        //    check bNum1, bNum2, bNum3, bNum4, and bNum5 to see if there is a match;
        //    if so, move a 0 to the matching instance variable in the gameCard

        //3.  if the number generated is between 16–30,
        //    check iNum1, iNum2, iNum3, iNum4, and iNum5 to see if there is a match;
        //    if so, move a 0 to the matching instance variable in the gameCard

        //4.  if the number generated is between 31–45,
        //    check nNum1, nNum2, nNum3, nNum4, and nNum5 to see if there is a match;
        //    if so, move a 0 to the matching instance variable in the gameCard

        //5.  if the number generated is between 46–60,
        //    check gNum1, gNum2, gNum3, gNum4, and gNum5 to see if there is a match;
        //    if so, move a 0 to the matching instance variable in the gameCard

        //6.  if the number generated is between 61–75,
        //    check oNum1, oNum2, oNum3, oNum4, and oNum5 to see if there is a match;
        //    if so, move a 0 to the matching instance variable in the gameCard

    }

    public static void determineWinner()
    {
        //1.  Print the content of the Bingo Card, ensuring the display is formatted as follows:
        //    bNum1  iNum1  nNum1  gNum1  oNum1
        //    bNum2  iNum2  nNum2  gNum2  oNum2
        //    bNum3  iNum3  nNum3  gNum3  oNum3
        //    bNum4  iNum4  nNum4  gNum4  oNum4
        //    bNum5  iNum5  nNum5  gNum5  oNum5

        //2.  Call the gotBingo() method for the gameCard

        //3.  if gotBingo() returns true, add 1 to totalGamesWon
        //    AND display "BINGO!"

        //4.  if gotBingo() returns false, display "No BINGO"
    }

}
