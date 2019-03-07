import java.util.Random;

public class BingoCard
{
    //These are all of the instance variables that represent the spaces on the Bingo card
    private int bNum1;
    private int bNum2;
    private int bNum3;
    private int bNum4;
    private int bNum5;

    private int iNum1;
    private int iNum2;
    private int iNum3;
    private int iNum4;
    private int iNum5;

    private int nNum1;
    private int nNum2;
    private int nNum3;
    private int nNum4;
    private int nNum5;

    private int gNum1;
    private int gNum2;
    private int gNum3;
    private int gNum4;
    private int gNum5;

    private int oNum1;
    private int oNum2;
    private int oNum3;
    private int oNum4;
    private int oNum5;

    //This is the constructor which simulates a Bingo card. Each instance variable is set to a random number between a certain range
    public BingoCard()
    {
        Random myRan = new Random();

        this.bNum1 = myRan.nextInt(15) + 1;
        this.bNum2 = myRan.nextInt(15) + 1;
        this.bNum3 = myRan.nextInt(15) + 1;
        this.bNum4 = myRan.nextInt(15) + 1;
        this.bNum5 = myRan.nextInt(15) + 1;

        this.iNum1 = myRan.nextInt(15) + 16;
        this.iNum2 = myRan.nextInt(15) + 16;
        this.iNum3 = myRan.nextInt(15) + 16;
        this.iNum4 = myRan.nextInt(15) + 16;
        this.iNum5 = myRan.nextInt(15) + 16;

        this.nNum1 = myRan.nextInt(15) + 31;
        this.nNum2 = myRan.nextInt(15) + 31;
        this.nNum3 = myRan.nextInt(15) + 31;
        this.nNum4 = myRan.nextInt(15) + 31;
        this.nNum5 = myRan.nextInt(15) + 31;

        this.gNum1 = myRan.nextInt(15) + 46;
        this.gNum2 = myRan.nextInt(15) + 46;
        this.gNum3 = myRan.nextInt(15) + 46;
        this.gNum4 = myRan.nextInt(15) + 46;
        this.gNum5 = myRan.nextInt(15) + 46;

        this.oNum1 = myRan.nextInt(15) + 61;
        this.oNum2 = myRan.nextInt(15) + 61;
        this.oNum3 = myRan.nextInt(15) + 61;
        this.oNum4 = myRan.nextInt(15) + 61;
        this.oNum5 = myRan.nextInt(15) + 61;
        //Constructor for a BingoCard
        //Generate a random number for each instance variable in the Bingo Card, using
        //the following range of numbers:

        // "B" (numbers 1–15), "I" (numbers 16–30),
        // "N" (numbers 31–45), "G" (numbers 46–60),
        // and "O" (numbers 61–75).
    }

    //These are all the getter and setter methods
    public int getbNum1() {
        return bNum1;
    }

    public int getbNum2() {
        return bNum2;
    }

    public int getbNum3() {
        return bNum3;
    }

    public int getbNum4() {
        return bNum4;
    }

    public int getbNum5() {
        return bNum5;
    }

    public int getiNum1() {
        return iNum1;
    }

    public int getiNum2() {
        return iNum2;
    }

    public int getiNum3() {
        return iNum3;
    }

    public int getiNum4() {
        return iNum4;
    }

    public int getiNum5() {
        return iNum5;
    }

    public int getnNum1() {
        return nNum1;
    }

    public int getnNum2() {
        return nNum2;
    }

    public int getnNum3() {
        return nNum3;
    }

    public int getnNum4() {
        return nNum4;
    }

    public int getnNum5() {
        return nNum5;
    }

    public int getgNum1() {
        return gNum1;
    }

    public int getgNum2() {
        return gNum2;
    }

    public int getgNum3() {
        return gNum3;
    }

    public int getgNum4() {
        return gNum4;
    }

    public int getgNum5() {
        return gNum5;
    }

    public int getoNum1() {
        return oNum1;
    }

    public int getoNum2() {
        return oNum2;
    }

    public int getoNum3() {
        return oNum3;
    }

    public int getoNum4() {
        return oNum4;
    }

    public int getoNum5() {
        return oNum5;
    }

    public void setbNum1(int bNum1) {
        this.bNum1 = bNum1;
    }

    public void setbNum2(int bNum2) {
        this.bNum2 = bNum2;
    }

    public void setbNum3(int bNum3) {
        this.bNum3 = bNum3;
    }

    public void setbNum4(int bNum4) {
        this.bNum4 = bNum4;
    }

    public void setbNum5(int bNum5) {
        this.bNum5 = bNum5;
    }

    public void setiNum1(int iNum1) {
        this.iNum1 = iNum1;
    }

    public void setiNum2(int iNum2) {
        this.iNum2 = iNum2;
    }

    public void setiNum3(int iNum3) {
        this.iNum3 = iNum3;
    }

    public void setiNum4(int iNum4) {
        this.iNum4 = iNum4;
    }

    public void setiNum5(int iNum5) {
        this.iNum5 = iNum5;
    }

    public void setnNum1(int nNum1) {
        this.nNum1 = nNum1;
    }

    public void setnNum2(int nNum2) {
        this.nNum2 = nNum2;
    }

    public void setnNum3(int nNum3) {
        this.nNum3 = nNum3;
    }

    public void setnNum4(int nNum4) {
        this.nNum4 = nNum4;
    }

    public void setnNum5(int nNum5) {
        this.nNum5 = nNum5;
    }

    public void setgNum1(int gNum1) {
        this.gNum1 = gNum1;
    }

    public void setgNum2(int gNum2) {
        this.gNum2 = gNum2;
    }

    public void setgNum3(int gNum3) {
        this.gNum3 = gNum3;
    }

    public void setgNum4(int gNum4) {
        this.gNum4 = gNum4;
    }

    public void setgNum5(int gNum5) {
        this.gNum5 = gNum5;
    }

    public void setoNum1(int oNum1) {
        this.oNum1 = oNum1;
    }

    public void setoNum2(int oNum2) {
        this.oNum2 = oNum2;
    }

    public void setoNum3(int oNum3) {
        this.oNum3 = oNum3;
    }

    public void setoNum4(int oNum4) {
        this.oNum4 = oNum4;
    }

    public void setoNum5(int oNum5) {
        this.oNum5 = oNum5;
    }

    /*
    *   This gotBingo() method is used to check whether or not the user won Bingo
    *   It checks to see if all the numbers horizontally, diagonally, or vertically are equal to zero to indicate that the user scored Bingo
    *   If so it returns true, otherwise it returns false
     */
    public boolean gotBingo()
    {

        if (    (bNum1==0 && bNum2==0 && bNum3==0 && bNum4==0 && bNum5==0) ||
                (iNum1==0 && iNum2==0 && iNum3==0 && iNum4==0 && iNum5==0) ||
                (nNum1==0 && nNum2==0 && nNum3==0 && nNum4==0 && nNum5==0) ||
                (gNum1==0 && gNum2==0 && gNum3==0 && gNum4==0 && gNum5==0) ||
                (oNum1==0 && oNum2==0 && oNum3==0 && oNum4==0 && oNum5==0))
        {
            return true;
        }
        else if (   (bNum1==0 && iNum1==0 && nNum1==0 && gNum1==0 && oNum1==0) ||
                    (bNum2==0 && iNum2==0 && nNum2==0 && gNum2==0 && oNum2==0) ||
                    (bNum3==0 && iNum3==0 && nNum3==0 && gNum3==0 && oNum3==0) ||
                    (bNum4==0 && iNum4==0 && nNum4==0 && gNum4==0 && oNum4==0) ||
                    (bNum5==0 && iNum5==0 && nNum5==0 && gNum5==0 && oNum5==0))
        {
            return true;
        }
        else if (   (bNum1==0 && iNum2==0 && nNum3==0 && gNum4==0 && oNum5==0) ||
                    (bNum5==0 && iNum4==0 && nNum3==0 && gNum2==0 && oNum1==0))
        {
            return true;
        }
        else {
            return false;
        }

    }

    //This is the toString() method meant to display the values of each variable in a way that mimics a real Bingo card
    public String toString()
    {

        return "BingoCard:\n" + bNum1 + "  " + bNum2 + "  " + bNum3 + "  " + bNum4 + "  " + bNum5 + "  \n" +
                iNum1 + "  " + iNum2 + "  " + iNum3 + "  " + iNum4 + "  " + iNum5 + "  \n" +
                nNum1 + "  " + nNum2 + "  " + nNum3 + "  " + nNum4 + "  " + nNum5 + "  \n" +
                gNum1 + "  " + gNum2 + "  " + gNum3 + "  " + gNum4 + "  " + gNum5 + "  \n" +
                oNum1 + "  " + oNum2 + "  " + oNum3 + "  " + oNum4 + "  " + oNum5 + "  \n";

    }


}
