import java.util.Scanner;
import java.util.Random;
public class TicTacToeConstructor {

    Scanner keyboard = new Scanner(System.in);
    Random myRan = new Random();

    private String a1 = "-";
    private String a2 = "-";
    private String a3 = "-";

    private String b1 = "-";
    private String b2 = "-";
    private String b3 = "-";

    private String c1 = "-";
    private String c2 = "-";
    private String c3 = "-";

    private boolean gameOver = false;

    String[][] board = { {".",".","."} , {".",".","."}, {".",".","."}};

    public TicTacToeConstructor(){

        this.a1 = board[0][0];
        this.a2 = board[0][1];
        this.a3 = board[0][2];

        this.b1 = board[0][0];
        this.b2 = board[1][1];
        this.b3 = board[2][2];

        this.c1 = board[0][0];
        this.c2 = board[1][1];
        this.c3 = board[2][2];
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1;
    }

    public String getB2() {
        return b2;
    }

    public void setB2(String b2) {
        this.b2 = b2;
    }

    public String getB3() {
        return b3;
    }

    public void setB3(String b3) {
        this.b3 = b3;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public void playGame(){
        String option;
        System.out.println("\nWhere do you want to play?");
        option = keyboard.nextLine();

        switch (option){
            case "a1":
                setA1("x");
                break;
            case "a2":
                setA2("x");
                break;
            case "a3":
                setA3("x");
                break;

            case "b1":
                setB1("x");
                break;
            case "b2":
                setB2("x");
                break;
            case "b3":
                setB3("x");
                break;

            case "c1":
                setC1("x");
                break;
            case "c2":
                setC2("x");
                break;
            case "c3":
                setC3("x");
                break;
        }

    }

    //Logic order:

    /*
    * Generate random number that corresponds to empty space
    * Check if space is empty
    * If empty, put 'o' there
    * Otherwise find another space
     */

    public void computerPlay(){
        boolean spaceOccupied = false;
        int numberPicked = myRan.nextInt(9) +1;

        switch (numberPicked){
            case 1:
                if (a1.equals("x")){
                    computerPlay();
                }
                else {
                    setA1("o");
                }
                break;
            case 2:
                if (a2.equals("x")){
                    computerPlay();
                }
                else{
                    setA2("o");
                }
                break;
            case 3:
                if (a3.equals("x")){
                    computerPlay();
                }
                else{
                    setA3("o");
                }

                break;

            case 4:
                if (b1.equals("x")){
                    computerPlay();
                }
                else {
                    setB1("o");
                }
                break;
            case 5:
                if (b2.equals("x")){
                    computerPlay();
                }
                else {
                    setB2("o");
                }
                break;
            case 6:
                if (b3.equals("x")){
                    computerPlay();
                }
                else {
                    setB3("o");
                }
                break;

            case 7:
                if (c1.equals("x")){
                    computerPlay();
                }
                else {
                    setC1("o");
                }
                break;
            case 8:
                if (c2.equals("x")){
                    computerPlay();
                }
                else {
                    setC2("o");
                }
                break;
            case 9:
                if (c3.equals("x")){
                    computerPlay();
                }
                else {
                    setC3("o");
                }
                break;
        }

    }

    public void checkWinner(){


    }




    public void showBoard(){
        System.out.printf("\n%s   %s   %s\n" +
                          "%s   %s   %s\n" +
                          "%s   %s   %s", a1, a2, a3, b1, b2, b3, c1, c2, c3);
    }
}
